fun main() {
    var dic = mutableListOf<String>()
    for(i in 0 until readLine()!!.toInt()){
        dic.add(readLine()!!)
    }
    dic.sort() //아스키코드로 정렬
    val comparator : Comparator<String> = compareBy{it.length}
    dic.sortWith(comparator) // 이후 length순으로 정렬
    dic = dic.toSet().toMutableList()
    for(i in dic.indices){
        println(dic[i])
    }
}