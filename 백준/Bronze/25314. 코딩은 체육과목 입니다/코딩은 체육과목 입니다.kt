import java.io.BufferedReader
import java.io.InputStreamReader

fun main() =with(BufferedReader(InputStreamReader(System.`in`))){
    val byte = readLine().toInt()
    var str = ""
    for(i in 1..byte/4)
        str += "long "
    println(str + "int")
}
