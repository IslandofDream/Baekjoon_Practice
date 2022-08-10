fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val cards = readLine()!!.split(" ").map { it.toInt() }
    var sum = 0
    for (i in 0..n - 3) {
        for (j in i + 1..n - 2) {
            for (k in j + 1..n - 1) {
                if (cards[i] + cards[j] + cards[k] in (sum + 1)..m) sum = cards[i] + cards[j] + cards[k]
            }
        }
    }
    print(sum)
}