import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().split("")
    val sb = StringBuilder()
    n.sortedDescending().forEach {
        sb.append(it)
    }
    print(sb)
}
