class q3 {

    def toUpper(input: String): String = input.toUpperCase

    def toLower(input: String): String = input.toLowerCase

    def formatNames(name: String)(formatter: String => String): String = formatter(name)

    def main(args: Array[String]): Unit = {
      val names = List("Benny", "Niroshan", "Saman", "Kumara")

      names.foreach { name =>
        val formattedNameUpper = formatNames(name)(toUpper)
        val formattedNameLower = formatNames(name)(toLower)
        println(formattedNameUpper)
        println(formattedNameLower)
        println()
      }
    }
  }


