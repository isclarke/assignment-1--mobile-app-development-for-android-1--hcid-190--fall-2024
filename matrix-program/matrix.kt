import java.util.Scanner

fun main() {
  Matrix()
}

class Matrix {
  init {
    val HIGHLIGHT: String = "\u001b[33m"
    val RESET: String = "\u001b[0m"
    val scanner = Scanner(System.`in`)

    println("Enter the size of your matrix")
    val number: Int = scanner.nextInt()
    println ("Your matrix is : $number x $number")

    //Create matrix array
    val matrix = Array(number) { IntArray(number) { 0 } }

    //Print the matrix with zeros
    println("Printing matrix with deafult value:")
    defaultMatrix(matrix, HIGHLIGHT, RESET)

    //Print the matrix with increasing numbers
    println("Printing matrix:")
    numberMatrix(matrix, HIGHLIGHT, RESET)

    //Print the matrix flipped
    println("Printing flipped matrix:")
    swapMatrix(matrix)
  }
}

//Function to get deafult matrix with zeros
fun defaultMatrix(matrix: Array<IntArray>, HIGHLIGHT: String, RESET: String) {
  val size = matrix.size
  val width = (size * size).toString().length
  //Add color of highlight and color of reset strings
  val HIGHLIGHT: String = "\u001b[33m"
  val RESET: String = "\u001b[0m"

  for(size in matrix) {
  for(num in size) {
       print("${HIGHLIGHT}${num.toString().padStart(width + 2)}${RESET} ")
    }

    println("")
  }
}

fun numberMatrix(matrix: Array<IntArray>, HIGHLIGHT: String, RESET: String) {
  val size = matrix.size
  var count: Int = 1
  val width = (size * size).toString().length
  //Add color of highlight and color of reset strings
  val HIGHLIGHT: String = "\u001b[33m"
  val RESET: String = "\u001b[0m"

  for((rowIndex, row) in matrix.withIndex()) {
    for((columnIndex, i) in row.withIndex()) {
      //Test if the index is right to left diagonal
      if(columnIndex == size - 1 - rowIndex) {
      print("${HIGHLIGHT}${count.toString().padStart(width + 2)}${RESET} ")
      }
      //If it's not it doesnt get a highlight
      else {
      print("${count.toString().padStart(width + 2)} ")
      }
      count++
    }
    println("")
  }
}

fun swapMatrix(matrix: Array<IntArray>) {
  val size = matrix.size
  var temp: Int
  val width = (size * size).toString().length

  for(row in 0 until size) {
    for(i in 0 until size) {
      temp = (size * size) - (row * size + i)
      print("${temp.toString().padStart(width + 2)}")
    }
    println("")
  }
}
