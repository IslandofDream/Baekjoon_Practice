fun main() {
    val n = readLine()!!.toInt()
    val info = ArrayList<Pair<Int,String>>(n)
    for(i in 0 until n){
        val (age,name)= readLine()!!.split(" ")
        info.add(Pair(age.toInt(),name))
    }
    info.sortBy { it.first }
    for(i in 0 until n){
        println("${info[i].first} ${info[i].second}")
    }
}
