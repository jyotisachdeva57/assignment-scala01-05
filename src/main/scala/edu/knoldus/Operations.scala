package edu.knoldus

class Operations {

  def colatz(number: Int, list: List[Int]): List[Int] = {
    number match {
      case num if num >= 0 && num < 100 => computeInner(number, list)
      case _ => throw new RuntimeException("Enter Number in Range of 1 to 100")
    }
  }

  private def computeInner(numb: Int, list: List[Int]): List[Int] = {
    for {lst <- list if lst == numb} yield list
    numb match {
      case 1 => list
      case n if n % 2 == 0 => computeInner(numb / 2, numb :: list)
      case _ => computeInner((3 * numb + 1) / 2, numb :: list)
    }
  }
}





