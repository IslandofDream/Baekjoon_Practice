fun main() {
    val n = readLine()!!.toInt()
    val num = IntArray(n+1)
    num[1] = 0
    num[0] = 0
    for(i in 2..n){
        num[i] = num[i - 1] + 1
        if(i%2 == 0) num[i] = Math.min(num[i],num[i / 2] + 1)
        if(i%3 == 0) num[i] = Math.min(num[i],num[i / 3] + 1)
    }
    println(num[n])
}

