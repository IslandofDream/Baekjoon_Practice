import java.util.*

    fun main()= with(Scanner(System.`in`)) {
        print(pivo(nextInt()))
    }

    fun pivo(num: Int): Int {
        if (num == 0)
            return 0
        else if (num == 1)
            return 1
        else{
            return pivo(num - 1) + pivo(num - 2)
        }
    }
