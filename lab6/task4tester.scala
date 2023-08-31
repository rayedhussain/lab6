package lab6
import org.scalatest._
import chisel3._
import chisel3.util._
import chiseltest._
 class task4tester extends FreeSpec with ChiselScalatestTester{
    "task4lab6" in {
         test(new task4){ a=>
         a.io. up_down.poke(0.B)
         a.clock.step(1)
         a.io.out.expect(6.U)
         
         }}}