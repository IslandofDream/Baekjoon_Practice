import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (r,s) = readLine().split(" ").map { it.toInt() }
    print("${s*2-r}")
}