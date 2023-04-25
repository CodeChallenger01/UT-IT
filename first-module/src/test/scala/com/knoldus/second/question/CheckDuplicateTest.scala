package com.knoldus.second.question

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CheckDuplicateTest extends AnyFlatSpec with Matchers {

  val checkDuplicate = new CheckDuplicate

  /* Test case for integer type */
  "check Duplicate for numeric" should "returns empty if list is empty" in {
    val list = List()
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String is empty No Duplicate elements"
    expectedOutput shouldBe actualOutput
  }

  "check Duplicate for numeric" should "not returns list contain duplicate element" in {
    val list = List()
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String Containing duplicate element"
    assert(expectedOutput != actualOutput)
  }

  "check Duplicate for numeric" should "returns the no duplicate element if it has only one element" in {
    val list = List(1)
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String doesn't contain duplicate element"
    expectedOutput shouldBe actualOutput
  }

  "check Duplicate for numeric" should "not returns the  duplicate element if it has only one element" in {
    val list = List(1)
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String contain duplicate element"
    assert(expectedOutput != actualOutput)
  }

  "check Duplicate for numeric" should "returns no duplicate element" in {
    val list = List(1, 2, 3, 4, 5)
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String doesn't contain duplicate element"
    expectedOutput shouldBe actualOutput
  }

  "check Duplicate for numeric" should "not returns the duplicate element" in {
    val list = List(1, 2, 3, 4, 5)
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"No Duplicate elements"
    assert(expectedOutput != actualOutput)
  }

  "check Duplicate for numeric" should "returns the duplicate element if contain" in {
    val list = List(1, 2, 3, 4, 5, 1)
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String Containing duplicate element"
    expectedOutput shouldBe actualOutput
  }

  "check Duplicate for numeric" should "not returns the duplicate element if not contain" in {
    val list = List(1, 2, 3, 4, 5, 1)
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String not Containing duplicate element"
    assert(expectedOutput != actualOutput)
  }

  /* FOR STRING TYPE*/
  "check Duplicate for string" should "returns empty if list is empty" in {
    val list = List()
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String is empty No Duplicate elements"
    expectedOutput shouldBe actualOutput
  }

  "check Duplicate for string" should "not returns list contain duplicate element" in {
    val list = List()
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String Containing duplicate element"
    assert(expectedOutput != actualOutput)
  }

  "check Duplicate for string" should "returns the no duplicate element if it has only one element" in {
    val list = List("Manish")
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String doesn't contain duplicate element"
    expectedOutput shouldBe actualOutput
  }

  "check Duplicate for string" should "not returns the  duplicate element if it has only one element" in {
    val list = List("Ravi")
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String contain duplicate element"
    assert(expectedOutput != actualOutput)
  }

  "check Duplicate for string" should "returns no duplicate element" in {
    val list = List("Manish", "Ravi", "Jitendra", "Akhil", "Ajit")
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String doesn't contain duplicate element"
    expectedOutput shouldBe actualOutput
  }

  "check Duplicate for string" should "not returns the duplicate element" in {
    val list = List("Manish", "Ravi", "Jitendra", "Akhil", "Ajit")
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"No Duplicate elements"
    assert(expectedOutput != actualOutput)
  }

  "check Duplicate for string" should "returns the duplicate element if contain" in {
    val list = List("Manish", "Ravi", "Jitendra", "Manish", "Ajit")
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String Containing duplicate element"
    expectedOutput shouldBe actualOutput
  }

  "check Duplicate for string" should "not returns the duplicate element if not contain" in {
    val list = List("Manish", "Ravi", "Jitendra", "Manish", "Ajit")
    val actualOutput = checkDuplicate.checkDuplicate(list)
    val expectedOutput = s"String not Containing duplicate element"
    assert(expectedOutput != actualOutput)
  }
}
