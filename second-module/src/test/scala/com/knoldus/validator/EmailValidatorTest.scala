package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class EmailValidatorTest extends AnyFlatSpec with Matchers {

  val emailValidator = new EmailValidator

  "emailIdIsValid" should "return false if invalid mail id passed" in {
    val emailId = ""
    val actualOutput = emailValidator.emailIdIsValid(emailId)
    val expectedOutput = false
    expectedOutput shouldBe actualOutput
  }

  "emailIdIsValid" should "not return true if invalid mail id passed" in {
    val emailId = ""
    val actualOutput = emailValidator.emailIdIsValid(emailId)
    val expectedOutput = true
    assert(expectedOutput != actualOutput)
  }

  "emailIdIsValid" should "return false if mail id not validate" in {
    val emailId = "google@gmail.com"
    val actualOutput = emailValidator.emailIdIsValid(emailId)
    val expectedOutput = true
    expectedOutput shouldBe actualOutput
  }

  "emailIdIsValid" should "not return false if mail id not validate" in {
    val emailId = "google@gmail.com"
    val actualOutput = emailValidator.emailIdIsValid(emailId)
    val expectedOutput = false
    assert(expectedOutput != actualOutput)
  }

  "emailIdIsValid" should "return true if mail id validate" in {
    val emailId = "knoldus@gmail.com"
    val actualOutput = emailValidator.emailIdIsValid(emailId)
    val expectedOutput = true
    expectedOutput shouldBe actualOutput
  }

  "emailIdIsValid" should "not return false if mail validate" in {
    val emailId = "knoldus@gmail.com"
    val actualOutput = emailValidator.emailIdIsValid(emailId)
    val expectedOutput = false
    assert(expectedOutput != actualOutput)
  }

  "emailIdIsValid" should "return true if other mail id validate" in {
    val emailId = "philips123@gmail.com"
    val actualOutput = emailValidator.emailIdIsValid(emailId)
    val expectedOutput = true
    expectedOutput shouldBe actualOutput
  }

  "emailIdIsValid" should "not return true if mail id validate" in {
    val emailId = "philips123@gmail.com"
    val actualOutput = emailValidator.emailIdIsValid(emailId)
    val expectedOutput = false
    assert(expectedOutput != actualOutput)
  }
}
