import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var count = 0
    val num = readLine().toInt()
    readLine().split(" ").map { it.toInt() }.forEach {
        if(it == num)
            count++
    }
    print(count)
}