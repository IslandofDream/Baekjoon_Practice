fun main() {

    fun isPrime(n: Int): Boolean {
        if (n == 0 || n == 1) return false
        var i = 2
        while (i * i <= n) {
            if (n % i++ == 0) return false
        }
        return true
    }

    while (true) {
        val num = readLine()!!.toInt()
        if (num == 0) break
        var a = 2
        var b = num - 2
        while (!isPrime(a) || !isPrime(b)) {
            if (a == num - 2) break
            a++
            b--
        }
        if(a == num -2) println("Goldbach's conjecture is wrong.")
        else println("$num = $a + $b")
    }
}