
/*2. Write regular expression for email parsing.
Description :
val EMAIL = “ regular expression definition”.r
val EMAIL(user, domain) = “knol@knoldus.com”
user = knol
domain = knoldus.com*/
import scala.util.matching.Regex
object EmailParsing extends App{

  val Email = """([\w\.]+)@([\w\.]+)""".r

  EmailParsing.emailParser("knol@knoldus.com")
  println("")
  EmailParsing.emailParser("purva.agrawal@knoldus.com")
  println("")
  def emailParser(emailId:String):Unit ={

    emailId match {
      case Email(user,domain)=> println(s"User: $user \nDomain: $domain")
      case _ => println("Invalid email id")
    }

  }
}




