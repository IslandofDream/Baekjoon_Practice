fun main() {
    val bottles = readLine()!!.split(" ").map{it.toInt()}
    println("${bottles.sum()*5}")
}