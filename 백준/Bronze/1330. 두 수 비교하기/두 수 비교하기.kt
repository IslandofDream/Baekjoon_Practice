import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (n,m)= readLine()!!.split(" ").map { it.toInt() }
    if(n>m) println(">")
    else if(n<m) println("<")
    else println("==")
}