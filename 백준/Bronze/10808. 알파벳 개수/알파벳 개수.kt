import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val al = IntArray(26)
    val sb = StringBuilder()
    readLine().forEach {
        al[(it-97).toInt()] = al[(it-97).toInt()]+1
    }
    al.forEach {
        sb.append("$it ")
    }
    print(sb)
}