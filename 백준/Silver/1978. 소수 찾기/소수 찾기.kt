fun main() {
    val n = readLine()!!.toInt()
    val nums = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    for(i in nums){
        if(isPrime(i)) count ++
    }
    print(count)
}

fun isPrime(n: Int): Boolean {
    if (n == 0 || n == 1) return false
    var i = 2
    while (i * i <= n) { if (n % i++ == 0) return false }
    return true
}