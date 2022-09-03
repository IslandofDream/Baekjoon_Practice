import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.text.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val sb = StringBuilder()
    repeat(n){
        val nums = readLine().split(" ").map { it.toInt() }.sortedDescending()
        sb.append("${nums[2]}\n")
    }
    print(sb)
}
