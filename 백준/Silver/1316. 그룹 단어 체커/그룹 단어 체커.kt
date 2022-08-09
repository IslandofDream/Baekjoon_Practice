fun main() {
    var char = IntArray(26)
    var count = 0
    var last = 'a'
    for(i in 1..readLine()!!.toInt()){
        char = IntArray(26){0}
        val temp = readLine()!!
        for(x in temp.indices){
            if(x != 0) last = temp[x-1]
            if(char[temp[x].code - 'a'.code] != 0 && last != temp[x]){
               count--
               break
            }else{ char[temp[x].code - 'a'.code] += 1 }
        }
        count++
    }
    print(count)
}