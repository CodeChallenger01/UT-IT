package com.knoldus.db

import org.scalatest.flatspec.AnyFlatSpec

class CompanyReadDtoTest extends AnyFlatSpec {

  val companyReadDto = new CompanyReadDto

  "getCompanyByName" should "return None if company not exists " in {
    val companyName = "Google"
    val actualOutput = companyReadDto.getCompanyByName(companyName).toString
    val expectedOutput = "None"
    assertResult(expectedOutput) {
      actualOutput
    }
  }

  "getCompanyByName" should "not return Company if company not exists " in {
    val companyName = "Google"
    val actualOutput = companyReadDto.getCompanyByName(companyName).toString
    val expectedOutput = "Some(Company(Knoldus,knoldus@gmail.com,Noida))"
    assert(expectedOutput != actualOutput)
  }

  "getCompanyByName" should "return company name if exists" in {
    val companyName = "Knoldus"
    val actualOutput = companyReadDto.getCompanyByName(companyName).toString
    val expectedOutput = "Some(Company(Knoldus,knoldus@gmail.com,Noida))"
    assertResult(expectedOutput) {
      actualOutput
    }
  }

  "getCompanyByName" should "not return any company name" in {
    val companyName = "Knoldus"
    val actualOutput = companyReadDto.getCompanyByName(companyName).toString
    val expectedOutput = "Some(Company(Google,google@gmail.com,Noida))"
    assert(expectedOutput != actualOutput)
  }
}
