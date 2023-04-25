package com.knoldus.request

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class CompanyImplTest extends AnyFlatSpec {
  val companyImpl = new CompanyImpl(new CompanyValidator)

  "create Company" should "return company name if company exists" in {
    val company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    val actualOutput = companyImpl.createCompany(company)
    val expectedOutput = Some("Knoldus")
    expectedOutput shouldBe actualOutput
  }

  "create Company" should "not return company name if company not exists" in {
    val company = Company("Google", "google@gmail.com", "Noida")
    val actualOutput = companyImpl.createCompany(company)
    val expectedOutput = Some("Google")
    assert(actualOutput != expectedOutput)
  }

  "create Company" should "return none if company not exists" in {
    val company = Company("Google", "google@gmail.com", "Noida")
    val actualOutput = companyImpl.createCompany(company)
    val expectedOutput = None
    expectedOutput shouldBe actualOutput
  }

  "create Company" should "not return company if company not exists" in {
    val company = Company("Google", "google@gmail.com", "Noida")
    val actualOutput = companyImpl.createCompany(company)
    val expectedOutput = Some("Google")
    assert(expectedOutput != actualOutput)
  }

  "create Company" should "return other company name if other company exists" in {
    val company = Company("Philips", "philips123@gmail.com", "Noida")
    val actualOutput = companyImpl.createCompany(company)
    val expectedOutput = Some("Philips")
    expectedOutput shouldBe actualOutput
  }

  "create Company" should "not return other company name if other company not exists" in {
    val company = Company("Google", "philips123@gmail.com", "Noida")
    val actualOutput = companyImpl.createCompany(company)
    val expectedOutput = Some("Google")
    assert(actualOutput != expectedOutput)
  }

  "create Company" should "return none company if email id is not verified" in {
    val company = Company("Philips", "google@gmail.com", "Noida")
    val actualOutput = companyImpl.createCompany(company)
    val expectedOutput = None
    assertResult(expectedOutput) {
      actualOutput
    }
  }

  "create Company" should "not return company if email id verified" in {
    val company = Company("Google", "philips123@gmail.com", "Noida")
    val actualOutput = companyImpl.createCompany(company)
    val expectedOutput = Some("Google")
    assert(actualOutput != expectedOutput)
  }
}
