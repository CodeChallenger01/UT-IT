package com.knoldus.validator

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class CompanyValidatorTest extends AnyFlatSpec {

  val companyValidator = new CompanyValidator

  "companyIsValid" should "return true if company exists" in {
    val company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    val actualOutput = companyValidator.companyIsValid(company)
    val expectedOutput = true
    expectedOutput shouldBe actualOutput
  }

  "companyIsValid" should "not return true if company not exists" in {
    val company = Company("Google", "google@gmail.com", "Noida")
    val actualOutput = companyValidator.companyIsValid(company)
    val expectedOutput = true
    assert(actualOutput != expectedOutput)
  }

  "companyIsValid" should "return false if company not exists" in {
    val company = Company("Google", "google@gmail.com", "Noida")
    val actualOutput = companyValidator.companyIsValid(company)
    val expectedOutput = false
    expectedOutput shouldBe actualOutput
  }

  "companyIsValid" should "not return false if company not exists" in {
    val company = Company("Google", "google@gmail.com", "Noida")
    val actualOutput = companyValidator.companyIsValid(company)
    val expectedOutput = true
    assert(expectedOutput != actualOutput)
  }

  "companyIsValid" should "return true if other company exists" in {
    val company = Company("Philips", "philips123@gmail.com", "Noida")
    val actualOutput = companyValidator.companyIsValid(company)
    val expectedOutput = true
    expectedOutput shouldBe actualOutput
  }

  "companyIsValid" should "not return true company name if other company not exists" in {
    val company = Company("Google", "philips123@gmail.com", "Noida")
    val actualOutput = companyValidator.companyIsValid(company)
    val expectedOutput = true
    assert(actualOutput != expectedOutput)
  }
  "companyIsValid" should "return false if email id  verified" in {
    val company = Company("Philips", "philips123@gmail.com", "Noida")
    val actualOutput = companyValidator.companyIsValid(company)
    println(actualOutput)
    val expectedOutput = true
    expectedOutput shouldBe actualOutput
  }

  "companyIsValid" should "not return false if email id verified" in {
    val company = Company("Google", "philips123@gmail.com", "Noida")
    val actualOutput = companyValidator.companyIsValid(company)
    val expectedOutput = true
    assert(actualOutput != expectedOutput)
  }
}

