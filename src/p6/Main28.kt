package p6

fun main() {
    println("Введите длину массива: ")
    val n = readln().toInt()
    val list = arrayListOf<Int>()

    for(i in 0 until n){
        println("Введите число")
        list.add(readln().toInt())
    }

    println(list)
}