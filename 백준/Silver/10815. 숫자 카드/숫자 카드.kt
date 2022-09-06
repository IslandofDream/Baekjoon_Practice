import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    var start : Int
    var end : Int
    var mid : Int
    var FLAG : Boolean

    val n = IntArray(readLine().toInt())
    readLine().split(" ").map { it.toInt() }.sorted().forEachIndexed { index, i ->
        n[index] = i
    }

    val m = IntArray(readLine().toInt())
    readLine().split(" ").map { it.toInt() }.forEachIndexed { index, i ->
        m[index] = i
    }

    for(i in m){
        FLAG = false
        start = 0
        end = n.size - 1
        while (start <= end){
            mid = (start + end)/2
            if(n[mid] == i){
                FLAG = true
                break
            }
            else if(n[mid] < i) start = mid + 1
            else end = mid-1
        }
        if(FLAG) sb.append("1 ")
        else sb.append("0 ")
    }
    print(sb)
}