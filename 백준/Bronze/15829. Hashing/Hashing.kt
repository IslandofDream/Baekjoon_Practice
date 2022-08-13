import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val str = readLine()

    var go = 0
    var expo = 1L
    var sum = 0L
    for(w in str) {
        if(go==0)
            expo=1L
        else
            expo=(expo*31)%1234567891
        sum=(sum+(w.toInt()-96)*expo)%1234567891
        go++
    }

    print("${sum%1234567891}")

}