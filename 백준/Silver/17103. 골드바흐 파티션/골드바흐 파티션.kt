fun main() {
    val prime = BooleanArray(1000001) {true}
    prime[0] = false
    prime[1] = false
    for (i in 2..100000) {
        if (prime[i]) {
            for (j in i+i..1000000 step i) {
                prime[j] = false
            }
        }
    }

    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val num = readLine()!!.toInt()
        var count = 0
        var a = (num / 2)
        var b = (num / 2)
        while (a != 1) {
            if(prime[a] && prime[b]){
                count++
            }
            a--
            b++
        }
        println(count)
    }
}
