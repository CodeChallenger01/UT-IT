package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee
import com.typesafe.scalalogging.Logger

class EmployeeValidator {
  val loggers = Logger(getClass)

  def employeeIsValid(employee: Employee): Boolean = {
    loggers.info("Validating the employee information")
    val companyReadDto = new CompanyReadDto
    val emailValidator = new EmailValidator
    val isEmailIdValid = emailValidator.emailIdIsValid(employee.emailId)
    val isCompanyExists = companyReadDto.getCompanyByName(employee.companyName) match {
      case Some(_) => true
      case None => false
    }
    loggers.info("Both mail id and company of employee validated")
    if (isEmailIdValid && isCompanyExists) true
    else false
  }
}
