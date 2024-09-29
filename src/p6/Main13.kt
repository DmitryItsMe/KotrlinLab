package p6

fun main() {
    var list = arrayListOf<Int>()

    for(i in 0 .. 20){
        list.add((0..100).random())
    }
    println(list)
}