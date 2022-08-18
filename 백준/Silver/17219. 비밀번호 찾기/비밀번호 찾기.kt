import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    val (n,m) = readLine().split(" ").map { it.toInt() }
    val password = HashMap<String, String>(n)
    for(i in 1..n) {
        val (k, v) = readLine().split(" ")
        password[k] = v
    }
    for(i in 1..m){
        sb.append("${password[readLine()]}\n")
    }
    print(sb)
}