fun main() {

    for(i in 1..readLine()!!.toInt()) {
        val(h,w,n) = readLine()!!.split(" ").map { it.toInt() }
        if(n%h == 0)
            println("${h*100 + (n/h)}")
        else
            println("${n%h*100 + (n/h)+1}")
    }
}