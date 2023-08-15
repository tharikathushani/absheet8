object q2 {
    def main(args: Array[String]): Unit = {
      if (args.length != 1) {
        println("Please provide exactly one integer argument.")
      } else {
        val input = args(0).toInt
        val result = input match {
          case n if n < 0 => "Negative"
          case 0 => "Zero"
          case n if n % 2 == 0 => "Even"
          case _ => "Odd"
        }
        println(result)
      }
    }
  }


