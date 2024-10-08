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
        println("that's an even number!")
    } else {
      println("that's an odd number!")
    }

    scanner.close()
  }
}
