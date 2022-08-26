import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine().toInt()){
        val com = readLine().split(" ")
        var num = com[0].toFloat()
        com.forEach {
            when(it){
                "@" -> num *= 3
                "%" -> num += 5
                "#" -> num -= 7
            }
        }
        println(String.format("%.2f",num))
    }
}