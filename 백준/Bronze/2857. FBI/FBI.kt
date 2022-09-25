import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    repeat(5) {
        if (readLine().contains("FBI")) sb.append("${it+1} ")
    }
    if(sb.isEmpty()) print("HE GOT AWAY!")
    else print(sb)
}