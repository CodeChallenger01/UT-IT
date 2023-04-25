package com.knoldus.validator

import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends AnyFlatSpec {

  val userValidator = new UserValidator

  "userIsValid" should "return true if exists" in {
    val user = User("Manish", "Mishra", 23, 28000, "Intern", "Knoldus", "knoldus@gmail.com")
    val actualOutput = userValidator.userIsValid(user)
    val expectedOutput = true
    assertResult(expectedOutput) {
      actualOutput
    }
  }

  "userIsValid" should "not return false if exists" in {
    val user = User("Manish", "Mishra", 21, 18000, "Intern", "Knoldus", "knoldus@gmail.com")
    val actualOutput = userValidator.userIsValid(user)
    println(actualOutput)
    val expectedOutput = false
    assert(expectedOutput != actualOutput)
  }

  "userIsValid" should "return false if Company not exists" in {
    val user = User("Manish", "Mishra", 22, 58000, "Intern", "Google", "google.com.com")
    val actualOutput = userValidator.userIsValid(user)
    val expectedOutput = false
    assertResult(expectedOutput) {
      actualOutput
    }
  }

  "userIsValid" should "not return true if Company not exists" in {
    val user = User("Manish", "Mishra", 20, 98000, "Intern", "Google", "google.com.com")
    val actualOutput = userValidator.userIsValid(user)
    val expectedOutput = true
    assert(expectedOutput != actualOutput)
  }

  "userIsValid" should "return true for other user" in {
    val user = User("Roni", "Mishra", 23, 108000, "Intern", "Philips", "philips123@gmail.com")
    val actualOutput = userValidator.userIsValid(user)
    val expectedOutput = true
    assertResult(expectedOutput) {
      actualOutput
    }
  }

  "userIsValid" should "not return false for different user" in {
    val user = User("Roni", "Mishra", 21, 18000, "Intern", "Philips", "philips123@gmail.com")
    val actualOutput = userValidator.userIsValid(user)
    val expectedOutput = false
    assert(expectedOutput != actualOutput)
  }

}
