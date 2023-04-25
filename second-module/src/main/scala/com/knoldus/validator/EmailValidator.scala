package com.knoldus.validator

import com.typesafe.scalalogging.Logger

class EmailValidator {
  val loggers = Logger(getClass)

  def emailIdIsValid(emailId: String): Boolean = {
    loggers.info("Inside the emailIdIsValid method to check email id is valid or not")
    emailId match {
      case "knoldus@gmail.com" => true
      case "philips123@gmail.com" => true
      case _ => false
    }
  }
}