package lab6
import org.scalatest._
import chisel3._
import chisel3.util._
import chiseltest._
 class pipotester extends FreeSpec with ChiselScalatestTester{
    "pipocheking " in {
         test(new ex1){ a=>
         a.io.in.poke(1.U)
         a.clock.step(10)
         a.io.out.expect(1.U)
         
         }}}