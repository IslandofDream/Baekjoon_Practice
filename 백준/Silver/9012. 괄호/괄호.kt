fun main() { 9012

    for(i in 1..readLine()!!.toInt()){
        var b1 = 0
        var b2 = 0
        var flag = true
        readLine()!!.forEach {
            if(it == '(') b1++
            else if(it == ')')
                if(b1-b2 <= 0)
                    flag = false
                else
                    b2++
        }
        if(b1 == b2 && flag) println("YES") else println("NO")

    }
}