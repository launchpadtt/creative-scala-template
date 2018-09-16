import doodle.backend.StandardInterpreter._
import doodle.core.Image._
import doodle.core._
import doodle.jvm.Java2DFrame._
import doodle.syntax._

object exercise7point1 {

  def main(args: Array[String]): Unit = {
    val a_box = Image.rectangle(20, 20).fillColor(Color.royalBlue)
    def stackedBoxes(count: Int): Image =
    count match {
      case 0 => Image.empty
      case n => a_box above stackedBoxes(n-1)
    }

    stackedBoxes(3).draw
  }
}

