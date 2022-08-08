import kotlin.collections.ArrayDeque
fun main() {
    val n = readLine()!!.toInt()
    val cards = ArrayDeque<Int>(n)
    var count = 1
    for(i in 1..n){
        cards.add(i)
    }
    while(cards.size != 1){
        if(count % 2 == 1){
            cards.removeFirst()
        }else{
            cards.add(cards.first())
            cards.removeFirst()
        }
        count++
    }
    print(cards.first())
}