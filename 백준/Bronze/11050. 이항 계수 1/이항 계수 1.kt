fun main() {
    val (n,k)= readLine()!!.split(" ").map { it.toInt() }
    var result = 1
    repeat(k){
        result = result * (n-it) / (it+1)
    }
    println(result)
}

