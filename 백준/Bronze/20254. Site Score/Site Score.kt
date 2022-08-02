import java.io.BufferedReader
import java.io.InputStreamReader

fun main() =with(BufferedReader(InputStreamReader(System.`in`))){
    val (ur,tr,uo,to) = readLine().split(' ').map { it.toInt() }
    println((56*ur + 24*tr + 14*uo + 6*to))
}
