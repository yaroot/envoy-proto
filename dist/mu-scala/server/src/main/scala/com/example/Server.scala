package com.example

import cats.effect._
import com.example.hello.Greeter
import higherkindness.mu.rpc.server._

object Server extends IOApp {

  implicit val greeter: Greeter[IO] = new HappyGreeter[IO]

  def run(args: List[String]): IO[ExitCode] = for {
    serviceDef <- Greeter.bindService[IO]
    server     <- GrpcServer.default[IO](12345, List(AddService(serviceDef)))
    _          <- GrpcServer.server[IO](server)
  } yield ExitCode.Success

}
