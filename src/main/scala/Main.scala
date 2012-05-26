import scalaz._
import Scalaz._
import effects._

object Main {

  def pmain(args: Vector[String]): IO[Unit] =
    putStrLn("sbt-prototype project running!!")

  def main(args: Array[String]) = pmain(Vector.empty ++ args).unsafePerformIO
}
