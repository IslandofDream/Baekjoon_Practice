import java.io.BufferedReader
import java.io.InputStreamReader

fun main() =with(BufferedReader(InputStreamReader(System.`in`))){
    val total = readLine().toInt()
    var temp = 0
    for(i in 1..readLine().toInt()){
        val (price, count) = readLine().split(" ").map { it.toInt() }
        temp += price * count
    }
    if(temp == total) print("Yes") else print("No")
}