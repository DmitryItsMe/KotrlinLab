package p8

fun main() {
    println("Введите чило: ")
    val n1 = readln().toInt()
    println(chet18(n1))
}

fun chet18(n1: Int): Boolean{
    var b = true
    for(i in 2 until n1){
        if(n1%i==0) {
            b = false
            break;
        }
    }
    return b
}