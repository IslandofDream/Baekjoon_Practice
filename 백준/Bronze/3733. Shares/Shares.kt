import java.util.*

fun main() = with(Scanner(System.`in`)) {
    while(hasNextLine()){
        val arr = nextLine().split(" ")
        println(arr[1].toInt()/(arr[0].toInt()+1))
    }
}