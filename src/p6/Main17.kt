package p6

fun main() {
    var list = arrayListOf(3, 5, 6, 6, 6, 5, 3)
    var s = 0
    var p = 1
    for(i in 0 until list.size){
        s += list[i]
        p *= list[i]
    }

    println("Сумма: $s")
    println("Произведение: $p")

}