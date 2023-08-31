package Lab6
import chisel3._
import chisel3.util._

class OneBitXORCounter(maxCount: UInt) extends Module {
    val io = IO(new Bundle {
        val count = Output(UInt(log2Ceil(maxCount + 1).W))
        val resetCount = Input(Bool())
    })

    val counterReg = RegInit(0.U(log2Ceil(maxCount + 1).W))
    val xorOutput = counterReg(log2Ceil(maxCount + 1) - 1) ^ counterReg(0)

    when(io.resetCount) {
        counterReg := 0.U
    }.otherwise {
        counterReg := Mux(xorOutput, 0.U, counterReg + 1.U)
    }

    io.count := counterReg
    }
