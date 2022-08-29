import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val change = MutableList<Int>((n/5)+1){0}
    for(i in 0..n/5){
        if((n-5*i)%2  == 0) change[i] = i + (n-5*i)/2
        else change[i] = -1
    }
    if(change.all { it == -1 }) print(-1)
    else print(change.filterNot { it == -1 }.minOrNull())
}