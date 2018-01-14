package edu.knoldus

class Operations {

  def colatz(number: Int, list: List[Int]): List[Int] = {
    number match {
      case num if num >= 0 && num < 100 => computeInner(number, list)
      case _ => throw new RuntimeException("Enter Number in Range of 1 to 100")
    }
  }

  private def computeInner(number: Int, list: List[Int]): List[Int] = {
    for {lst <- list if lst == number} yield list
    number match {
      case 1 => list
      case num if num % 2 == 0 => computeInner(number / 2, number :: list)
      case _ => computeInner((3 * number + 1) / 2, number :: list)
    }
  }
}





