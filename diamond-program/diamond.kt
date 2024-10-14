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

    if(evennumber) {
      for(i in 0 until number - number + 1) {
        var spaceCount: Int = number / 2 - i
        var starPoint: Int = 1

        for(i in 1..<spaceCount) {
          print("  ")
          }

        for(i in 0 until starPoint) {
          print("  *")
          }

          println("")

        for(i in 1..<number / 2 + 1) {
          var spaceCount: Int = number / 2 - i
          var starCount: Int = 2 * (i + 1) - 2

            for(i in 0..<spaceCount) {
              print("  ")
            }

            for(i in 0 until starCount) {
              print(" *")
            }

            println("")
        }

        for(i in 0..<number / 2 - 1) {
          var spaceCount: Int = i + 1
          var starCount: Int = number - 2 * (i + 1)

          for(i in 0..<spaceCount) {
            print("  ")
          }

          for(i in 0 until starCount) {
            print(" *")
          }

          println("")
        }

        for(i in 0..<number - number + 1) {
          var spaceCount: Int = number / 2 - i
          var bottomStar: Int = 1

          for(i in 1..<spaceCount) {
            print("  ")
          }

          for(i in 0 until bottomStar) {
            print("  *")
          }

          println("")
        }
       }
    } else {
       for(i in 0..<number / 2 + 1) {
        var oddspaceCount: Int = number / 2 - i
        var oddstarCount: Int = 2 * i + 1

        for(i in 0..<oddspaceCount) {
          print(" ")
        }

        for(i in 0 until oddstarCount) {
          print("*")
        }

        println("")
       }
    }

    scanner.close()
  }
}
