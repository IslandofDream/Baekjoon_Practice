fun main() {
var case = 1
    while(true) {
        val (l, p, v) = readLine()!!.split(" ").map { it.toInt() }
        if(l == 0 &&p == 0 &&v ==0) break

        if(v%p > l)
            println("Case ${case}: ${v/p*l + l}")
        else
            println("Case ${case}: ${v/p*l + v%p}")
        case++
    }
}