fun main() {
    val (x, y, w, h) = readLine()!!.split(" ").map { it.toInt() }
    val diff = listOf(x, w - x, y, h - y)
    print(diff.minOrNull())
}
