fun main() {
    val (n, s) = readLine()!!.split(" ").map { it.toInt() }
    val nums = readLine()!!.split(" ").map { it.toInt() }
    var total = 0

    fun bt(par: Int, next: Int) {
        if(par == n) {
            if (next == s) {
                total++
            }
            return
        }
        bt(par + 1, next)
        bt(par + 1, next + nums[par])
    }
    bt(0, 0)
    if(s == 0) total--
    print(total)
}