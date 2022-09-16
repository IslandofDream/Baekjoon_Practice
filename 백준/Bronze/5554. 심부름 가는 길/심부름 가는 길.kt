import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var sum = 0
    repeat(4){
        sum += readLine().toInt()
    }
    println(sum/60)
    println(sum%60)
}
