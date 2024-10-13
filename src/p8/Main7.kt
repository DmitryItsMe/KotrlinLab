package p8

fun main(){
    println("Ведите чило")
    val n1 = readln().toInt()
    println(ifdel(n1))
}

fun ifdel(n1: Int):Boolean{
    if(n1%100 == 0) return true
    else return false
}
