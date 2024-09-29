package p6

fun main() {
    var list = arrayListOf<Int>(1)
    println("Введите число")
    val n = readln().toInt()
    println("Введите количество")
    val l = readln().toInt()

    for(i in 0 until l){
        list.add(list.last()+n)
    }

    println(list)
}