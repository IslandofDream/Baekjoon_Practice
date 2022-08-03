import java.io.BufferedReader
import java.io.InputStreamReader

fun main() =with(BufferedReader(InputStreamReader(System.`in`))){
    for(i in 1..readLine().toInt()){
        val temp = readLine().length
        if(temp in 6..9)
            println("yes")
        else
            println("no")
    }
}
