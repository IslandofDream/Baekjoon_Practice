import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine().toInt()){
        val (n,m) =readLine().split(" ").map { it.toInt() }
        var count = 0
        for(i in n..m){
            var temp = i
            if(temp == 0) count++
            while (temp >= 1 ){
                if(temp %10 == 0) count++
                temp /= 10
            }
        }
        println(count)
    }
}
