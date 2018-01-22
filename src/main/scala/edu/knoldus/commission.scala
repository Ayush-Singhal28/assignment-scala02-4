package edu.knoldus

abstract class Commission {

}

case class ClientSideCommission(val value: Int) extends Commission

case class StreetSideCommission(val value: Int) extends Commission

class TotalCommission {

  def getTotalCommission[T](data : List[T]) : String = {
    def sumOfList[T](data: List[T], sum: Int): Int = {
      data match {
        case head :: tail => head match {
          case StreetSideCommission(value) => sumOfList(tail, value + sum)
          case ClientSideCommission(value) => sumOfList(tail, value + sum)
        }
        case Nil => sum
      }
    }
    sumOfList(data, 0)
  }

  implicit def display(value: Int): String = {
    s"sum is $value"
  }
}





