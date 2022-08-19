import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val dic = HashMap<String, String>(n)
    val sb = StringBuilder()
    for (i in 1..n) {
        val poketmon = readLine()
        dic[poketmon] = i.toString()
        dic[i.toString()] = poketmon
    }
    for (i in 1..m) {
        sb.append("${dic[readLine()]}\n")
    }
    print(sb)
}