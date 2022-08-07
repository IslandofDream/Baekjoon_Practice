fun main() {

    fun isPrime(n: Int): Boolean {
        if (n == 0 || n == 1) return false
        var i = 2
        while (i * i <= n) {
            if (n % i++ == 0) return false
        }
        return true
    }

    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val num = readLine()!!.toInt()
        var a = (num / 2)
        var b = (num / 2)
        while (!isPrime(a) || !isPrime(b)) {
            a--
            b++
        }
        println("$a $b")
    }
}