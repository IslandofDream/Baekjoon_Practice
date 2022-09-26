import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    if(readLine().toInt()%2 == 0) print("SK")
    else print("CY")
}