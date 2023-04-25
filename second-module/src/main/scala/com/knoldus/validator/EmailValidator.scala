package com.knoldus.validator

import com.typesafe.scalalogging.Logger

import scala.util.{Failure, Success, Try}

class EmailValidator {
  val loggers = Logger(getClass)

  def emailIdIsValid(userEmail: String): Boolean = {
    Try {
      loggers.info("Verifying the email id is valid or not")
      val listOfSpecialCharacter = List('!', '#', '$', '^', '&', '*', '(', ')', '~', '+', '-', '/')
      val isEmailContainingSpecialCharacter = !(userEmail.count(specialCharacter => listOfSpecialCharacter.contains(specialCharacter)) >= 1)
      userEmail match {
        case email if email.count(_ == '@') == 1 && email.contains(".com") && isEmailContainingSpecialCharacter && email.length < 30 =>
          val substring = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.')).length
          val isUserNameBeforeAtTheRate = email.substring(0, email.indexOf('@')).length
          if (substring > 2 && isUserNameBeforeAtTheRate > 2) true
          else throw new RuntimeException("less character between @ and . OR email doesn't contain user name")

        case _ => throw new RuntimeException("Email is not Appropriate")
      }
    } match {
      case Success(_) => true
      case Failure(_) => false
    }
  }
}