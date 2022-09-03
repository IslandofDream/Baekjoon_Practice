import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val nums = MutableList<Int>(n){0}
    val sb = StringBuilder()
    repeat(n){
        nums[it] = readLine().toInt()
    }
    nums.sorted().forEach { 
        sb.append("$it\n")
    }
    print(sb)
}