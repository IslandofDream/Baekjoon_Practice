import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var temp: Long = 0
    val num = readLine()
    for (i in num.indices) {
        temp = (temp * 10 + (num[i] - '0')) % 20000303
    }

    println(temp)
}
