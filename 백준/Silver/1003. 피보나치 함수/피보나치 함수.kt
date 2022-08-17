import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val fibo = IntArray(41)
    val sb = StringBuilder()
    fibo[0] = 0
    fibo[1] = 1
    for(i in 2..40){
        fibo[i] = fibo[i-2] + fibo[i-1]
    }
    for(i in 1..readLine().toInt()){
        val n = readLine().toInt()
        if(n == 0) sb.append("1 0\n")
        else sb.append("${fibo[n-1]} ${fibo[n]}\n")
    }
    print(sb)
}