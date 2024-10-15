import java.util.Scanner

fun main() {
  Matrix()
}

class Matrix {
  init {
    val scanner = Scanner(System.`in`)
    println("Enter the size of your matrix")
    val number: Int = scanner.nextInt()
    println ("Your matrix is : $number x $number")
  }
}
