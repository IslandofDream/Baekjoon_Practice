import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val array = readLine().split(" ").map { it.toLong()}
    print((array[0]+array[1])*(array[0]-array[1]))
}
