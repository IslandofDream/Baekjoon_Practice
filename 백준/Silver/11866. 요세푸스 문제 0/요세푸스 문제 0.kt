fun main() {
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    val count = MutableList(n){i->i+1}
    val result = mutableListOf<Int>()
    var index = k-1
    while(count.size != 1){
            result.add(count[index])
            count.removeAt(index)
            index = (index + k-1) % count.size
    }
    result.add(count[0])
    print(result.joinToString(", ","<",">"))

}