fun main() {
    val n = readLine()!!.toInt()
    val cd = ArrayList<Pair<Int,Int>>(n)
    for(i in 0 until n){
        val (dx,dy)= readLine()!!.split(" ").map { it.toInt() }
        cd.add(Pair(dx,dy))
    }
    cd.sortWith( compareBy ({it.first}, {it.second}))
    for(i in 0 until n){
        println("${cd[i].first} ${cd[i].second}")
    }
}
