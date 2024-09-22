package `5`

fun main() {
    println("Введите число: ")
    val n1 = readln().toInt();

    var list = arrayListOf(0)
    for(i in 0 .. n1){
        println("Введите число: ")
        val n = readln().toInt()
        list.add(n)
    }
    list.sort()
    println(list)
}