import java.io.BufferedReader
import java.io.InputStreamReader

fun main() =with(BufferedReader(InputStreamReader(System.`in`))){
    val price = readLine().toInt()
    println("${(price * 0.78).toInt()} ${(price - price * 0.2 * 0.22).toInt()}")
}
