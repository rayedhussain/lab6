package lab6
import org.scalatest._
import chisel3._
import chisel3.util._
import chiseltest._
 class ex3tester extends FreeSpec with ChiselScalatestTester{
    "oneshot" in {
         test(new ex3){ a=>
         a.io.din.poke(1.U)
         a.io.reload.poke(true.B)
         a.clock.step(10)
         a.io.out.expect(1.U)
         
         }}}