import java.io.BufferedReader
import java.io.InputStreamReader

fun main() =with(BufferedReader(InputStreamReader(System.`in`))){
    val (a,b,c) = readLine().split(" ").map{ it.toInt()}
    val (d,e,f) = readLine().split(" ").map{ it.toInt()}
    println("${d-c} ${e/b} ${f-a}")
}