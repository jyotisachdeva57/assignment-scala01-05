package edu.knoldus

import org.apache.log4j.Logger

object MenuLauncher {

  def main(args: Array[String]): Unit = {
    val log = Logger.getLogger(this.getClass) //in code
    val obj = new Operations
    val first = 10
    val second = 17
    val list = obj.colatz(first, Nil)
    log.info(list)
    val b = obj.colatz(second, list)
    log.info(b.toSet.toList)
  }

}
