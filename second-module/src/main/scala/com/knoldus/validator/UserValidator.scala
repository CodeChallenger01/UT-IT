package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.typesafe.scalalogging.Logger

class UserValidator {
  val loggers = Logger(getClass)

  def userIsValid(user: User): Boolean = {
    loggers.info("Validating the employee information")
    val companyReadDto = new CompanyReadDto
    val emailValidator = new EmailValidator
    val isEmailIdValid = emailValidator.emailIdIsValid(user.emailId)
    val isCompanyExists = companyReadDto.getCompanyByName(user.companyName) match {
      case Some(_) => true
      case None => false
    }
    loggers.info("Both mail id and company of employee validated")
    if (isEmailIdValid && isCompanyExists) true
    else false
  }
}