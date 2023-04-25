package com.knoldus.db

import com.knoldus.models.Company
import com.typesafe.scalalogging.Logger

import scala.collection.immutable.HashMap

class CompanyReadDto {
  val loggers = Logger(getClass)
  loggers.info("CompanyReadDto contains the company list")
  private val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  private val philipsCompany: Company = Company("Philips", "philips123@gmail.com", "Noida")
  private val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Philips" -> philipsCompany)

  loggers.info("getCompanyByName method to return company if exist")

  def getCompanyByName(name: String): Option[Company] = companies.get(name)
}
