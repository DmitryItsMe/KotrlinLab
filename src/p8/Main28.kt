package p8

fun main() {
    println("Введите число: ")
    val n = readln().toInt()
    println(s28(n))
}

fun s28(n1: Int): List<Int>{
    var list =  arrayListOf<Int>()
    for(i in 1 .. n1){
        list.add(i)
    }
    return list
}