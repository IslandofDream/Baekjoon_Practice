import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var(h,m)=readLine().split(" ").map { it.toInt() }
    val min = readLine().toInt()

    h += min/60
    m += min%60
    if(m >=60){
        h +=1
        m -= 60
    }
    if(h>=24) h -= 24 
    print("$h $m")
}
