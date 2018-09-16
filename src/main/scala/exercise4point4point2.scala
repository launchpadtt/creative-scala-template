import doodle.core._
import doodle.core.Image._
import doodle.syntax._
import doodle.jvm.Java2DFrame._
import doodle.backend.StandardInterpreter._

object exercise4point4point2 {

  def main(args: Array[String]): Unit = {

    val door = ((rectangle(5,10) fillColor Color.red lineColor Color.red) above(rectangle(5, 20) fillColor Color.black))
    val house = (triangle(30,30) fillColor Color.darkRed) above (door on (square(30) fillColor Color.red))

    val yard = (circle(20) fillColor Color.green) above (rectangle(5, 20) fillColor Color.brown)

    val top_road_part = (rectangle(20,3) fillColor Color.yellow) beside (rectangle(5,3) fillColor Color.black)
    val road = (top_road_part beside top_road_part beside top_road_part) above (rectangle(80, 3) fillColor Color.black)

    val home = (house beside yard) above road

    val neighbourhood = home beside home beside home

    neighbourhood.draw

  }
}

