import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()
    val minus = n.split("-").toTypedArray()
    var result = 0
    minus.forEachIndexed { i, _ ->
        val plus = minus[i].split("+").map { it.toInt() }
        plus.forEachIndexed { j, _ ->
            if (i == 0) result += plus[j] else result -= plus[j]
        }
    }
    println(result)
}