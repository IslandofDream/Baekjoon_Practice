fun main() {
    val n = readLine()!!.toInt()
    var count = 0
    for(i in 666..100000000){
        if(i.toString().contains("666")) count ++
        if(count == n){
            print(i)
            break
        }
    }
}