import java.io.BufferedReader
import java.io.InputStreamReader

fun main() =with(BufferedReader(InputStreamReader(System.`in`))){
    val(n,m) = readLine().split(" ").map { it.toBigInteger() }
    val num1 = readLine().toBigInteger()
    val num2 = readLine().toBigInteger()
    println("${num1 *num2}")
}
