package lab6
import chisel3.util._ 
import chisel3 . _
 
 class ex1 ( val init : Int = 1) extends Module {
    val io = IO ( new Bundle {
    val in = Input (UInt (4. W ) )
    val out = Output ( UInt (4. W ) )
        })
    // val state:=  ( init . U (4. W ) ) // register initialization

    val state =  io . in 
     
      io.out:=state 
}