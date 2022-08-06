fun main() {
    val n = readLine()!!.toInt()

    tailrec fun fibo(n: Int , pre:Int, next:Int): Int {
        if (n <= 0) return pre
        return fibo(n - 1, next, pre +next)
    }
    print(fibo(n,0,1))
}
