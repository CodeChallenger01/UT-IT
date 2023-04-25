package com.knoldus.first.question

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class InputValidationTest extends AnyFlatSpec with Matchers {

  val inputValidation = new InputValidation

  /* Validating User Name */
  "verify user name" should "validate user name if user name empty" in {
    val userName = " "
    val actualOutput = inputValidation.verifyUserName(userName)
    val expectedOutput = "java.lang.Exception: Not Correct User Name Either it is too sort or too long"
    assertResult(expectedOutput) {
      actualOutput
    }
  }

  "verify user name" should "not return user name if user name empty" in {
    val userName = " "
    val actualOutput = inputValidation.verifyUserName(userName)
    val expectedOutput = "Username :Bhaskar Mishra"
    assert(expectedOutput != actualOutput)
  }

  "verify user name" should "validate user name if user name contain only one word" in {
    val userName = "Manish"
    val actualOutput = inputValidation.verifyUserName(userName)
    val expectedOutput = "java.lang.Exception: Not Correct User Name Either it is too sort or too long"
    assertResult(expectedOutput) {
      actualOutput
    }
  }

  "verify user name" should "not return user name if user name contain only one word" in {
    val userName = "Manish"
    val actualOutput = inputValidation.verifyUserName(userName)
    val expectedOutput = "Username :Bhaskar Mishra"
    assert(expectedOutput != actualOutput)
  }

  "verify user name" should "validate user name if user name contain numeric value" in {
    val actualOutput = inputValidation.verifyUserName("1111 1111")
    val expectedOutput = "java.lang.Exception: Containing Numeric value"
    actualOutput shouldBe expectedOutput
  }

  "verify user name" should "not return user name if user name contain numeric value" in {
    val actualOutput = inputValidation.verifyUserName("1111 1111")
    val expectedOutput = "Username :Bhaskar Mishra"
    assert(expectedOutput != actualOutput)
  }

  "verify user name" should "validate user name if user name contain special character" in {
    val actualOutput = inputValidation.verifyUserName("Manish Mishr@")
    val expectedOutput = "java.lang.Exception: Containing Special Character"
    assertResult(expectedOutput) {
      actualOutput
    }
  }

  "verify user name" should "not return user name if user name contain special character" in {
    val actualOutput = inputValidation.verifyUserName("Manish Mishr@")
    val expectedOutput = "Username :Bhaskar Mishra"
    assert(expectedOutput != actualOutput)
  }

  "verify user name" should "validate user name if user contain 2 word" in {
    val actualOutput = inputValidation.verifyUserName("Manish Mishra")
    val expectedOutput = "Username :Manish Mishra"
    actualOutput shouldBe expectedOutput
  }

  "verify user name" should "not return any user name if user contain 2 word" in {
    val actualOutput = inputValidation.verifyUserName("Manish Mishra")
    val expectedOutput = "Username :Bhaskar Mishra"
    assert(expectedOutput != actualOutput)
  }

  "verify user name" should "validate user name if user contain 3 word" in {
    val actualOutput = inputValidation.verifyUserName("Ram Kishor Bhagel")
    val expectedOutput = "Username :Ram Kishor Bhagel"
    actualOutput shouldBe expectedOutput
  }

  "verify user name" should "not return any user name if user contain 3 word" in {
    val actualOutput = inputValidation.verifyUserName("Manish Mishra")
    val expectedOutput = "Username :Bhaskar Kumar Mishra"
    assert(expectedOutput != actualOutput)
  }

  "verify user name" should "validate user name if user contain more than 3 word" in {
    val actualOutput = inputValidation.verifyUserName("Ram Kishor Bhagel Sharma")
    val expectedOutput = "java.lang.Exception: Not Correct User Name Either it is too sort or too long"
    actualOutput shouldBe expectedOutput
  }

  "verify user name" should "not return any user name if user contain more than 3 word" in {
    val actualOutput = inputValidation.verifyUserName("Ram Kishor Bhagel Sharma")
    val expectedOutput = "Username :Ram Kishor Bhagel Sharma"
    assert(expectedOutput != actualOutput)
  }

  /* Verifying Email ID */

  "verify user email" should "validate user email if email empty" in {
    val actualOutput = inputValidation.verifyEmailId(" ")
    val expectedOutput = "java.lang.RuntimeException: Email is not Appropriate"
    actualOutput shouldBe expectedOutput
  }

  "verify user email" should "not return user email if email empty" in {
    val actualOutput = inputValidation.verifyEmailId(" ")
    val expectedOutput = "Email ID: mm0255275@gmail.com"
    assert(expectedOutput != actualOutput)
  }

  "verify user email" should "validate user email if email is string type" in {
    val actualOutput = inputValidation.verifyEmailId("manishmishra")
    val expectedOutput = "java.lang.RuntimeException: Email is not Appropriate"
    actualOutput shouldBe expectedOutput
  }

  "verify user email" should "not return user email if email is string type" in {
    val actualOutput = inputValidation.verifyEmailId(" ")
    val expectedOutput = "Email ID: mm0255275@gmail.com"
    assert(expectedOutput != actualOutput)
  }

  "verify user email" should "validate user email if email contain @ . but less character between them" in {
    val actualOutput = inputValidation.verifyEmailId("manish.mishra@kn.com")
    val expectedOutput = "java.lang.RuntimeException: less character between @ and . OR email doesn't contain user name"
    actualOutput shouldBe expectedOutput
  }

  "verify user email" should "validate user email if email doesn't contain user name" in {
    val actualOutput = inputValidation.verifyEmailId("@knoldus.com")
    val expectedOutput = "java.lang.RuntimeException: less character between @ and . OR email doesn't contain user name"
    actualOutput shouldBe expectedOutput
  }

  "verify user email" should "not return user email if email doesn't contain user name" in {
    val actualOutput = inputValidation.verifyEmailId("@knoldus.com")
    val expectedOutput = "Email ID: @knoldus.com"
    assert(expectedOutput != actualOutput)
  }

  "verify user email" should "not return user email if email contain @ . but less character between them" in {
    val actualOutput = inputValidation.verifyEmailId("manish.mishra@kn.com")
    val expectedOutput = "Email ID: manish.mishra@kn.com"
    assert(expectedOutput != actualOutput)
  }

  "verify user email" should "validate user email if email not contain .com" in {
    val actualOutput = inputValidation.verifyEmailId("manish.mishra@knoldus")
    val expectedOutput = "java.lang.RuntimeException: Email is not Appropriate"
    actualOutput shouldBe expectedOutput
  }

  "verify user email" should "not return user email if email not contain .com" in {
    val actualOutput = inputValidation.verifyEmailId("manish.mishra@knoldus")
    val expectedOutput = "Email ID: manish.mishra@knoldus"
    assert(expectedOutput != actualOutput)
  }

  "verify user email" should "validate user email if email is correct" in {
    val actualOutput = inputValidation.verifyEmailId("manish.mishra@knoldus.com")
    val expectedOutput = "Email ID: manish.mishra@knoldus.com"
    actualOutput shouldBe expectedOutput
  }

  "verify user email" should "not return other user email if email is correct" in {
    val actualOutput = inputValidation.verifyEmailId("manish.mishra@knoldus.com")
    val expectedOutput = "Email ID: mm0255275@gmail.com"
    assert(expectedOutput != actualOutput)
  }

  "verify user email" should "validate user email if email length greater than 30" in {
    val actualOutput = inputValidation.verifyEmailId("manish.mishra21456@knoldus.com")
    val expectedOutput = "java.lang.RuntimeException: Email is not Appropriate"
    actualOutput shouldBe expectedOutput
  }

  "verify user email" should "not return other user email if email length greater than 30" in {
    val actualOutput = inputValidation.verifyEmailId("manish.mishra21456@knoldus.com")
    val expectedOutput = "Email ID: manish.mishra21456@knoldus.com"
    assert(expectedOutput != actualOutput)
  }

  "verify user email" should "validate user email if email contain special character other than @" in {
    val actualOutput = inputValidation.verifyEmailId("manish.mishra#12@knoldus.com")
    val expectedOutput = "java.lang.RuntimeException: Email is not Appropriate"
    actualOutput shouldBe expectedOutput
  }

  "verify user email" should "not return user email if email contain special character other than @" in {
    val actualOutput = inputValidation.verifyEmailId("manish.mishra#12@knoldus.com")
    val expectedOutput = "Email ID: manish.mishra#12@knoldus.com"
    assert(expectedOutput != actualOutput)
  }

  /* Verifying User Password Is it Weak Or Strong */

  "verify user password" should "validate user password if password is empty" in {
    val userName = "Manish Mishra"
    val actualOutput = inputValidation.verifyUserPassword("Manish@Codder1()", userName)
    println(actualOutput)
    val expectedOutput = "Password :Password has Other Special Character :Manish@Codder1()"
    actualOutput shouldBe expectedOutput
  }

  "verify user password" should "not return  password if password is empty" in {
    val userName = "Manish Mishra"
    val actualOutput = inputValidation.verifyUserPassword(" ", userName)
    val expectedOutput = "Password :Valid Password :Manish@123"
    assert(expectedOutput != actualOutput)
  }

  "verify user password" should "validate user password if password doesn't contain Upper case" in {
    val userName = "Manish Mishra"
    val password = "manish@12"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = s"Password :Password doesn't has Uppercase Letter :$password"
    actualOutput shouldBe expectedOutput
  }

  "verify user password" should "not return  password if password doesn't contain Upper case" in {
    val userName = "Manish Mishra"
    val password = "manish@12"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = "Password :Valid Password :Manish@123"
    assert(expectedOutput != actualOutput)
  }

  "verify user password" should "validate user password if password doesn't contain Lower case" in {
    val userName = "Manish Mishra"
    val password = "MANISH@12"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = s"Password :Password doesn't has Lowercase Letter :$password"
    actualOutput shouldBe expectedOutput
  }

  "verify user password" should "not return  password if password doesn't contain Lower case" in {
    val userName = "Manish Mishra"
    val password = "MANISH@12"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = "Password :Valid Password :MANISH@12"
    assert(expectedOutput != actualOutput)
  }

  "verify user password" should "validate user password if password doesn't contain Number" in {
    val userName = "Manish Mishra"
    val password = "Manish@"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = s"Password :Password doesn't has Number :$password"
    actualOutput shouldBe expectedOutput
  }

  "verify user password" should "not return  password if password doesn't contain Number" in {
    val userName = "Manish Mishra"
    val password = "Manish@"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = "Password :Valid Password :Manish@"
    assert(expectedOutput != actualOutput)
  }

  "verify user password" should "validate user password if password doesn't contain Special Character" in {
    val userName = "Manish Mishra"
    val password = "Manisha12"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = s"Password :Password doesn't has Special Character :$password"
    actualOutput shouldBe expectedOutput
  }

  "verify user password" should "not return  password if password doesn't contain Special Character" in {
    val userName = "Manish Mishra"
    val password = "Manisha12"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = "Password :Valid Password :Manisha12"
    assert(expectedOutput != actualOutput)
  }

  "verify user password" should "validate user password if password contain user name" in {
    val userName = "Manish Mishra"
    val password = "ManishMishra@123"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = s"Password :Password has User Name :$password"
    actualOutput shouldBe expectedOutput
  }

  "verify user password" should "not return  password if password contain user name" in {
    val userName = "Manish Mishra"
    val password = "ManishMishra@123"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = "Password :Valid Password :ManishMishra@123"
    assert(expectedOutput != actualOutput)
  }

  "verify user password" should "validate user password if password has all data" in {
    val userName = "Manish Mishra"
    val password = "MMishra@123"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = s"Password :Valid Password :$password"
    actualOutput shouldBe expectedOutput
  }

  "verify user password" should "not return other password if password has all data" in {
    val userName = "Manish Mishra"
    val password = "MMishra@123"
    val actualOutput = inputValidation.verifyUserPassword(password, userName)
    val expectedOutput = "Password :Valid Password :ManishMishra@123"
    assert(expectedOutput != actualOutput)
  }
}
