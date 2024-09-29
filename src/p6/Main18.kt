package p6

fun main() {
    var list = arrayListOf(3, 5, 6, 6, 6, 5, 3, 6, 9, 3, 9, 0, 1, 2, 4)
    var i = 0
    while(i < list.size){
        for(j in 1 .. 5){
            print("${list[i]} ")
            i++
        }
        println()
    }
}