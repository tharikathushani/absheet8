object q1 {
    def calculateInterest(deposit: Double): Double = deposit match {
      case d if d <= 20000 => 0.02 * d
      case d if d <= 200000 => 0.04 * d
      case d if d <= 2000000 => 0.035 * d
      case _ => 0.065 * deposit
    }

    def main(args: Array[String]): Unit = {
      print("Enter the deposit amount: ")
      val depositAmount = scala.io.StdIn.readDouble()
      val interestEarned = calculateInterest(depositAmount)
      println(s"Interest earned in a year: Rs. ${interestEarned.formatted("%.2f")}")
    }
  }


