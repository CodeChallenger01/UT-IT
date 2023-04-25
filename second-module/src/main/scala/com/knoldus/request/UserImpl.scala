package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import com.typesafe.scalalogging.Logger

class UserImpl(userValidator: UserValidator) {
  val loggers = Logger(getClass)
  loggers.info("It is implementation part of Employee")

  def createUser(user: User): Option[String] = {
    loggers.info("Inside the create Employee method")
    if (userValidator.userIsValid(user)) Option(user.emailId)
    else None
  }
}