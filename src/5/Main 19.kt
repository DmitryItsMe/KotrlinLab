package `5`

fun main() {

    val n = arrayOf(4, 7, 35, 46, 1, 24, 9, 21)


    val l = n.size
    for (i in 0 until l - 1) {
        for (j in 0 until l - i - 1) {
            if (n[j] > n[j + 1]) {
                val temp = n[j]
                n[j] = n[j + 1]
                n[j + 1] = temp
            }
        }
    }

    for(i in 0 until n.size){
        print("${n[i]} ")
    }
}