package com.knoldus.second.question

import com.typesafe.scalalogging.Logger

import scala.util.{Failure, Success, Try}

class FactorialOfNumber {
  private val loggers = Logger(getClass)

  def findFactorial(number: Int, accumulator: Int): String = {
    loggers.info("Finding the factorial of the number ")
    Try {
      loggers.info("Matching with number in try class ")
      number match {
        case value if value <= 1 => accumulator
        case value => findFactorial(number - 1, accumulator * value)
      }
    } match {
      case Success(value) => s"$value"
      case Failure(exception) => s"$exception"
    }
  }
}
