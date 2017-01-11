import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.stream.ActorMaterializer
import akka.actor.ActorSystem

import scala.concurrent.Future
import scala.util.{ Failure, Success }

object sms {
  def main(args: Array[String]) {
    implicit val system = ActorSystem()
    implicit val materializer = ActorMaterializer()

    val responseFuture: Future[HttpResponse] =
      Http().singleRequest(HttpRequest(uri = "https://smsapi.free-mobile.fr/sendmsg?user=XXX&pass=YYY&msg=ZZZ"))
    }
}
