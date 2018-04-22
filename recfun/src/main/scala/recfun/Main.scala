package recfun

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
    def pascal(c: Int, r: Int): Int =
      if (c==0 || r==c) 1 else pascal(c-1,r-1) + pascal(c,r-1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      if (chars.isEmpty == true) true

      def balanceCheck(chars:List[Char],index:Int): Int = {
        if (chars.isEmpty==true || index <0) index
        else
            if (chars.head == "(")  balanceCheck(chars.tail,index+1)
            if (chars.head==")") balanceCheck(chars.tail,index-1)
            else balanceCheck(chars.tail,index)
      }
      if (balanceCheck(chars,0) !=0) false
      else true
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {


    }
  }
