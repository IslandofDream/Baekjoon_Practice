import java.util.*

fun main() = with(Scanner(System.`in`)) {
    while(hasNextLine()){
        val arr = nextLine().split(" ")
        if(arr[0].toInt() == 0 && arr[1].toInt() == 0) System.exit(0)
        else if(arr[0].toInt() <= arr[1].toInt()) println("No")
        else println("Yes")
    }
}