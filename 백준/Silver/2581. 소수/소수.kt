import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val prime = BooleanArray(10001){true}
    prime[0] = false
    prime[1] = false
    for (i in 2..10000) {
        if (prime[i]) {
            for (j in i+i..10000 step i) {
                prime[j] = false
            }
        }
    }

    val m = readLine().toInt()
    val n = readLine().toInt()
    val primes = mutableListOf<Int>()
    for(i in m..n){
        if(prime[i]) primes.add(i)
    }
    if(primes.isEmpty()) print("-1")
    else print("${primes.sum()}\n${primes[0]}")
}