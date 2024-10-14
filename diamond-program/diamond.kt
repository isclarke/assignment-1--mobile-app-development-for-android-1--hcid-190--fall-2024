import java.util.Scanner

fun main() {
 Diamond()
}

class Diamond {
  init {
    val scanner = Scanner(System.`in`)
    println("Enter a positive number")
    val number: Int = scanner.nextInt()

    val evennumber = number % 2 == 0

    if (evennumber) {
       for (i in 0 until number - number + 1) {
        var spaceCount: Int = number / 2 - i
        var starPoint: Int = 1
       }
    } else {
      println("that's an odd number!")
    }

    scanner.close()
  }
}
