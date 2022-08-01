import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val dis = readLine().toInt()
    if(dis  % 5 == 0)
        print("${dis/5}")
    else
        print("${dis/5 + 1}")
}
