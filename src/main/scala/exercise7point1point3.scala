import doodle.backend.StandardInterpreter._
import doodle.core._
import doodle.jvm.Java2DFrame._
import doodle.syntax._

object exercise7point1point3 {

  def main(args: Array[String]): Unit = {
    val board = (Image.square(15).fillColor(Color.black) beside Image.square(15)).fillColor(Color.red) above
      (Image.square(15).fillColor(Color.red) beside Image.square(15).fillColor(Color.black))
    def checkerboard(count: Int): Image =
      count match {
        case 0 => board
        case n => (checkerboard(n-1) beside checkerboard(n-1)) above (checkerboard(n-1) beside checkerboard(n-1))
      }
    checkerboard(0).draw
    checkerboard(1).draw
    checkerboard(2).draw
  }



}

