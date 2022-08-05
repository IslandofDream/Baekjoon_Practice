fun main() {
    val num = readLine()!!.toCharArray().sortedDescending()
    if(num.last() == '0' && num.sumOf { it.code} % 3== 0) print(num.joinToString(""))
    else print(-1)
}