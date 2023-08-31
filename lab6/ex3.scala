package lab6
import chisel3._
import chisel3.util._

class ex3 extends Module {
  val io = IO(new Bundle {
    val din = Input(UInt(4.W))
    val reload = Input(Bool())
    val out = Output(UInt(4.W))
  })

  val timer_count = RegInit(0.U(8.W))
  val done = (timer_count === 0.U)
  val next = WireInit(0.U)

  when(io.reload) {
    next := io.din // Load the data from input
  }.elsewhen(!done) {
    next := timer_count - 1.U // Decrement the timer
  }.otherwise {
    next := timer_count }

  timer_count := next
  io.out := timer_count
}
