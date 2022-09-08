import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    val nums= readLine().split(" ").map { it.toInt() }
    nums.sorted().forEach { sb.append("$it ") }
    print(sb)
}