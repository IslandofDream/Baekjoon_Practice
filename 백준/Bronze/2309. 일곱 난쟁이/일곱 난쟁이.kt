import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val dwarfs = mutableListOf<Int>()
    val total : Int
    for(i in 0..8){
        dwarfs.add(i, nextInt())
    }
    total = dwarfs.sum()
    loop@ for(i in 0..8){
        for(j in 0..8){
            if(total - dwarfs[i] - dwarfs[j] == 100 && i != j){
                with(dwarfs) {
                    val temp1 = dwarfs[i]
                    val temp2 = dwarfs[j]
                    remove(temp1)
                    remove(temp2)
                }
                break@loop
            }
        }
    }
    dwarfs.sort()
    for(i in dwarfs)
        println(i)
}
