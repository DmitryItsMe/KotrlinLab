package p6

fun main() {
    var list = arrayListOf(3, 5, 6, 2, 10, 8, 21)
    println(list)
    var s = 0;

    for(i in 0 until list.size){
        s += list[i]
    }

    println(s/list.size)

}