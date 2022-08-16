import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    var result =  1
    for(i in 1..1000000000){
        result += i*6
        if(result >= n){
            if(n == 1) {
                result = 1
                break
            }
            result = i+1
            break
        }
    }
    println("$result")

}