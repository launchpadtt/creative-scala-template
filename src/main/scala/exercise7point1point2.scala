import doodle.backend.StandardInterpreter._
import doodle.core._
import doodle.jvm.Java2DFrame._
import doodle.syntax._

object exercise7point1point2 {

  def main(args: Array[String]): Unit = {
    def cross(count: Int): Image =
      count match {
        case 0 => Image.circle(10)
        case n => (Image.circle(10) beside (Image.circle(10) above cross(n-1) above Image.circle(10))) beside Image.circle(10)
      }

    cross(0).draw
    cross(1).draw
    cross(2).draw

  }



}

