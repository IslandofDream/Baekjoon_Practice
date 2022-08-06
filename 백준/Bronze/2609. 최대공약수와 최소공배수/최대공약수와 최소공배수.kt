fun main() {
    fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val gcd = gcd(a, b)
    println(gcd)
    println(a*b/gcd)
}