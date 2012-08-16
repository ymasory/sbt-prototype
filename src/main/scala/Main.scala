package com.example

import scalaz._
import effect._
import IO._

object Main {
  import BuildInfo._

  def pmain(args: Vector[String]): IO[Unit] =
    putStrLn(
      "hello, %s v%s running with Scala v%s on sbt v%s" format (
        name, version, scalaVersion, sbtVersion
      )
    )

  def main(args: Array[String]) = pmain(Vector.empty ++ args).unsafePerformIO
}
