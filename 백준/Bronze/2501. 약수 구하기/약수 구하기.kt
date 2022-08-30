import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n,k) = readLine().split(" ").map{it.toInt()}
    var count = 0
    for(i in 1..n){
        if(n%i == 0){
            count++
            if(count == k){
                print(i)
                break
            }
        }
    }
    if(count != k) print(0)
}