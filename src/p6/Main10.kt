package p6

fun main() {
    var list = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var s = 0
    for(i in 0 until list.size){
        if(list[i] % 2 == 0) s += list[i]
    }
    println(s)
}