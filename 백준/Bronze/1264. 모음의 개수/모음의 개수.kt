import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val collection = listOf(65,69,73,79,85,97,101,105,111,117)
    var count : Int
    while(true){
        count = 0
        val sen = readLine()
        if(sen == "#") break
        for(x in sen) if (collection.contains(x.code)) count++
        println(count)
    }
}