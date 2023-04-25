package com.knoldus.second.question

import com.typesafe.scalalogging.Logger

class CheckDuplicate {
  private val loggers = Logger(getClass)
  loggers.info("To check the duplicate element in list")

  def checkDuplicate[T](list: List[T]): String = list match {
    case Nil => s"String is empty No Duplicate elements"
    case _ :: Nil => s"String doesn't contain duplicate element"
    case head :: _ if list.count(li => li == head) > 1 => s"String Containing duplicate element"
    case _ :: tail => checkDuplicate(tail)
  }

  loggers.info("Duplicate elements checked Successfully")
}
