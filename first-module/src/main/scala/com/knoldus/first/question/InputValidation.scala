package com.knoldus.first.question

import com.typesafe.scalalogging.Logger

import scala.util.{Failure, Success, Try}

class InputValidation {
  private val loggers = Logger(getClass)
  loggers.info("Inside the Input Validation class")

  def verifyUserName(userName: String): String = {
    Try {
      loggers.info("Verifying the user name")
      val listOfSpecialCharacter = List('@', '!', '#', '$', '^', '&', '*', '(', ')', '~')
      val isUserNameValid = userName.map {
        case num if listOfSpecialCharacter.contains(num) => throw new Exception("Containing Special Character")
        case num if num.isDigit => throw new Exception("Containing Numeric value")
        case num => num
      }
      isUserNameValid.split(" ").toList.length match {
        case size if size == 2 || size == 3 => s"Username :$userName"
        case size if size <= 1 || size > 3 => throw new Exception("Not Correct User Name Either it is too sort or too long")
        case _ => isUserNameValid
      }
    } match {
      case Success(value) => s"$value"
      case Failure(exception) => s"$exception"
    }
  }

  def verifyEmailId(userEmail: String): String = {
    Try {
      loggers.info("Verifying the email id of user")
      val listOfSpecialCharacter = List('!', '#', '$', '^', '&', '*', '(', ')', '~', '+', '-', '/')
      val isEmailContainingSpecialCharacter = !(userEmail.count(specialCharacter => listOfSpecialCharacter.contains(specialCharacter)) >= 1)
      userEmail match {
        case email if email.count(_ == '@') == 1 && email.contains(".com") && isEmailContainingSpecialCharacter && email.length < 30 =>
          val substring = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.')).length
          val isUserNameBeforeAtTheRate = email.substring(0, email.indexOf('@')).length
          if (substring > 2 && isUserNameBeforeAtTheRate > 2) s"Email ID: $email"
          else throw new RuntimeException("less character between @ and . OR email doesn't contain user name")

        case _ => throw new RuntimeException("Email is not Appropriate")
      }
    } match {
      case Success(value) => s"$value"
      case Failure(exception) => s"$exception"
    }
  }

  def verifyUserPassword(password: String, userName: String): String = {
    Try {
      loggers.info("Verifying the password user")
      val listOfSpecialCharacter: List[Char] = List('%', '@', '#', '&', '$')
      val isContainSpecialCharOtherThanGiven = !password.forall { character =>
        character.isUpper || character.isLower || character.isDigit || listOfSpecialCharacter.contains(character)
      }
      loggers.info("Matching with different validation of password")
      password match {
        case hasUpper if password.count(upper => upper.isUpper) < 1 => s"Password doesn't has Uppercase Letter :$hasUpper"
        case hasLower if password.count(lower => lower.isLower) < 1 => s"Password doesn't has Lowercase Letter :$hasLower"
        case hasNumber if password.count(number => number.isDigit) < 1 => s"Password doesn't has Number :$hasNumber"
        case hasSpecialCharacter if password.count(specialCharacter => listOfSpecialCharacter.contains(specialCharacter)) < 1 => s"Password doesn't has Special Character :$hasSpecialCharacter"
        case hasUserName if password.contains(userName.replaceAll("\\s", "")) => s"Password has User Name :$hasUserName"
        case otherSpecialChar if isContainSpecialCharOtherThanGiven => s"Password has Other Special Character :$otherSpecialChar"
        case pass => s"Valid Password :$pass"
      }
    } match {
      case Success(value) => s"Password :$value"
      case Failure(exception) => s"$exception"
    }
  }
}