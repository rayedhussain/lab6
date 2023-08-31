package lab6
import org.scalatest._
import chisel3._
import chisel3.util._
import chiseltest._
 class ex2tester extends FreeSpec with ChiselScalatestTester{
    "counter " in {
         test(new counter(13)){ a=>
         a.clock.step(5)
         a.io.out.expect(5.U)
         
         }}}