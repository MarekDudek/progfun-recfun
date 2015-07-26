package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r)
      1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def balance(chars: List[Char], opening: Int, closing: Int): Boolean = {

      if (chars.isEmpty)
        opening == closing
      else {

        def oneIfTrue(value: Boolean) =
          if (value) 1 else 0

        val newOpening = opening + oneIfTrue(chars.head == '(')
        val newClosing = closing + oneIfTrue(chars.head == ')')

        if (newClosing > newOpening)
          false
        else
          balance(chars.tail, newOpening, newClosing)
      }
    }

    balance(chars, 0, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
