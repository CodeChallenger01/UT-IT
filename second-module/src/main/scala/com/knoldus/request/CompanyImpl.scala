package com.knoldus.request

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import com.typesafe.scalalogging.Logger

class CompanyImpl(companyValidator: CompanyValidator) {
  val loggers = Logger(getClass)
  loggers.info("This is company Implementation part")

  def createCompany(company: Company): Option[String] = {
    loggers.info("createCompany method has been called")
    if (companyValidator.companyIsValid(company)) Option(company.name)
    else None
  }
}