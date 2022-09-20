import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var FLAG = true
    val n = readLine().toInt()
    val queue = MutableList(n) { i -> i + 1 }
    val sb = StringBuilder()

    while (queue.isNotEmpty()){
        if(FLAG){
            sb.append("${queue.removeFirst()} ")
            FLAG = false
        }
        else{
            queue.add(queue.removeFirst())
            FLAG = true
        }
    }
    print(sb)
}