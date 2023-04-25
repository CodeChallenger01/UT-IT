package com.knoldus.second.question

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FactorialOfNumberTest extends AnyFlatSpec with Matchers {

  val factorialOfNumber = new FactorialOfNumber

  "find factorial" should "return 1 if number is less than 1" in {
    val (number, acc) = (0, 1)
    val actualOutput = factorialOfNumber.findFactorial(number, acc)
    val expectedOutput = "1"
    expectedOutput shouldBe actualOutput
  }

  "find factorial" should "not return any number other than 1" in {
    val (number, acc) = (0, 1)
    val actualOutput = factorialOfNumber.findFactorial(number, acc)
    val expectedOutput = "10"
    assert(expectedOutput != actualOutput)
  }

  "find factorial" should "return 120" in {
    val (number, acc) = (5, 1)
    val actualOutput = factorialOfNumber.findFactorial(number, acc)
    val expectedOutput = "120"
    expectedOutput shouldBe actualOutput
  }

  "find factorial" should "not return any number other than result" in {
    val (number, acc) = (5, 1)
    val actualOutput = factorialOfNumber.findFactorial(number, acc)
    val expectedOutput = "100"
    assert(expectedOutput != actualOutput)
  }

  "find factorial" should "return 1 if number is negative" in {
    val (number, acc) = (-190, 1)
    val actualOutput = factorialOfNumber.findFactorial(number, acc)
    val expectedOutput = "1"
    expectedOutput shouldBe actualOutput
  }

  "find factorial" should "return 720 if number is 6" in {
    val (number, acc) = (6, 1)
    val actualOutput = factorialOfNumber.findFactorial(number, acc)
    val expectedOutput = "720"
    expectedOutput shouldBe actualOutput
  }

  "find factorial" should "not return any number other than 720 if number is 6" in {
    val (number, acc) = (6, 1)
    val actualOutput = factorialOfNumber.findFactorial(number, acc)
    val expectedOutput = "1720"
    assert(actualOutput != expectedOutput)
  }
}
