import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val sb = StringBuilder()
    val coordinate = readLine().split(" ").map { it.toInt() }
    val sort = coordinate.toMutableSet().sorted()
    val map = HashMap<Int,Int>(n)

    sort.forEachIndexed { index, i ->
        map[i] = index
    }
    for(i in coordinate)
        sb.append("${map[i]} ")
    print(sb)
}