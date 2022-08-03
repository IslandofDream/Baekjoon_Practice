import java.io.BufferedReader
import java.io.InputStreamReader

fun main() =with(BufferedReader(InputStreamReader(System.`in`))){
    val a = readLine().toBigInteger()
    val b = readLine().toBigInteger()
    val c = readLine().toBigInteger()
    print("${(b-c)/a}")
}