import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object exercise4point4 {

  def main(args: Array[String]): Unit = {
    val target = (circle(10) fillColor Color.red) on (circle(20) fillColor Color.white) on (circle(30) fillColor Color.red)
    val trunk = rectangle(15, 40)
    val stump = rectangle(20, 5) fillColor Color.brown
    val grass = rectangle(40, 20) fillColor Color.green

    val archery_target = target above trunk above stump above grass

    archery_target.draw

  }
}

