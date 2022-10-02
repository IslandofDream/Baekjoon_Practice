import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        val com = readLine()
        if (com == "# 0 0") break
        val input = com.split(" ")
        if (input[1].toInt() > 17 || input[2].toInt() > 79)
            println("${input[0]} Senior")
        else
            println("${input[0]} Junior")
    }
}
