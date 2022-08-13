import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val sb = StringBuilder()
    val prime = BooleanArray(1000001){true}
    prime[0] = false
    prime[1] = false
    for (i in 2..100000) {
        if (prime[i]) { // 소수를 찾으면
            for (j in i+i..1000000 step i) {
                prime[j] = false // 그 배수들은 소수가 아니다
            }
        }
    }

    val (m,n)= readLine()!!.split(" ").map { it.toInt() }
    for(i in m..n){
        if(prime[i]) sb.append("$i\n")
    }
    print(sb)

}