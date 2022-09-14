import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val S = readLine()
    val dic = mutableListOf<String>()
    repeat(S.length){
        dic.add(S.substring(it until S.length))
    }
    dic.sorted().forEach {
        println(it)
    }
}