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

    if (chars.isEmpty)
      true

    def balance(chars: List[Char], open: Int, close: Int): Boolean = {

      if (chars.isEmpty)
        open == close
      else {
        val char = chars.head
        val newOpen = if (char == '(') open + 1 else open
        val newClose = if (char == ')') close + 1 else close
        if (newClose > newOpen)
          false
        else
          balance(chars.tail, newOpen, newClose)
      }
    }

    balance(chars, 0, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
