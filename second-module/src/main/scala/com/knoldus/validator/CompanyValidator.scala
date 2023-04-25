package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.typesafe.scalalogging.Logger

class CompanyValidator {
  val loggers = Logger(getClass)

  def companyIsValid(company: Company): Boolean = {
    loggers.info("Checking company is valid or not")
    val companyReadDto = new CompanyReadDto
    val emailValidator = new EmailValidator
    val isCompanyValid = companyReadDto.getCompanyByName(company.name) match {
      case Some(_) => true
      case None => false
    }
    loggers.info("company has been validated")
    val isEmailIdValid = emailValidator.emailIdIsValid(company.emailId)
    if (isCompanyValid && isEmailIdValid) true
    else false
  }
}