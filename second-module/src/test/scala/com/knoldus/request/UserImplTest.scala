package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class UserImplTest extends AnyFlatSpec {
  val userValidator = new UserValidator
  val userImpl = new UserImpl(userValidator)

  "create User" should "return user mail id if exists" in {
    val user = User("Manish", "Mishra", 21, 18000, "Intern", "Knoldus", "knoldus@gmail.com")
    val actualOutput = userImpl.createUser(user)
    val expectedOutput = Some("knoldus@gmail.com")
    expectedOutput shouldBe actualOutput
  }

  "create User" should "not return other user mail id if exists" in {
    val user = User("Manish", "Mishra", 21, 18000, "Intern", "Knoldus", "knoldus@gmail.com")
    val actualOutput = userImpl.createUser(user)
    val expectedOutput = Some("philips123@gmail.com")
    assert(expectedOutput != actualOutput)
  }

  "create User" should "not return user mail id if Company not exists" in {
    val user = User("Manish", "Mishra", 21, 18000, "Intern", "Google", "google.com.com")
    val actualOutput = userImpl.createUser(user)
    val expectedOutput = None
    expectedOutput shouldBe actualOutput
  }

  "create User" should "not return any user mail id if Company not exists" in {
    val user = User("Manish", "Mishra", 21, 18000, "Intern", "Google", "google.com.com")
    val actualOutput = userImpl.createUser(user)
    val expectedOutput = Some("philips123@gmail.com")
    assert(expectedOutput != actualOutput)
  }

  "create User" should "return user mail iD for same employee" in {
    val user = User("Roni", "Mishra", 21, 18000, "Intern", "Philips", "philips123@gmail.com")
    val actualOutput = userImpl.createUser(user)
    val expectedOutput = Some("philips123@gmail.com")
    expectedOutput shouldBe actualOutput
  }

  "create User" should "not return user mail iD for different employee" in {
    val user = User("Roni", "Mishra", 21, 18000, "Intern", "Philips", "philips123@gmail.com")
    val actualOutput = userImpl.createUser(user)
    val expectedOutput = Some("philips@gmail.com")
    assert(expectedOutput != actualOutput)
  }
}
