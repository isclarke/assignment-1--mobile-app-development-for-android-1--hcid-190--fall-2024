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
    val spaces = number

    //Create matrix array
    val matrix = Array(number) { IntArray(number) { 0 } }

    //print the matrix with zeros
    println("Printing matrix with deafult value:")
    defaultMatrix(matrix)
  }
}

fun defaultMatrix(matrix: Array<IntArray>) {
  for(row in matrix) {
    for(num in row) {
      print("$num   ")
    }

    println("")
  }
}

fun numberMatrix(matrix: Array<IntArray>) {
  val size = matrix.size
  var count: Int = 1
  for(row in matrix) {
    for(i in 1..size) {
      print("$count   ")
      count++
    }
  }

  println("")
}
