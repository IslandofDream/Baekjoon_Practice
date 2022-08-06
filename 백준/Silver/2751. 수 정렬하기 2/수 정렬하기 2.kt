import java.lang.StringBuilder

fun main(){
    val count = readLine()!!.toInt()
    val nums = IntArray(count)
    var i = 0
    while (i != count){
        nums[i] = readLine()!!.toInt()
        i++
    }
    val sb = StringBuilder()
    val bw = System.out.bufferedWriter()
    nums.sorted().forEach{
        sb.append("${it}\n")
    }
    bw.write(sb.toString())
    bw.close()
}
