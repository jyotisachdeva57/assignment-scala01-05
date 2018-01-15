package edu.knoldus

class Operations {
  
def colatz(number: Int, list: List[Int]): List[Int] = {
    number match {
      case num if num >= 0 && num < 100 => compute(number, list,Nil)
      case _ => throw new RuntimeException("Enter Number in Range of 1 to 100")
    }
  }

  private def contain(list: List[Int], num: Int): Boolean = {
    list match {
      case Nil => false
      case head :: _ if head == num => true
      case head :: Nil if head != num => false
      case _ :: tail => contain(tail, num)
    }
  }


  private def compute(numb: Int, list: List[Int], temp: List[Int]): List[Int] = {
    numb match {
      case n if contain(list, n) => list
      case 1 => temp ::: list.toSet.toList
      case n if n % 2 == 0 => compute(numb / 2, list, numb :: temp)
      case _ => compute((3 * numb + 1) / 2, list, numb :: temp)
    }
  }
  
}





