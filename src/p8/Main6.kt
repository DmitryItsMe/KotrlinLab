package p8

fun main(){
    println("Ведите два числа (каждое с новой строки)")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    println(sc(n1, n2))
}

fun sc(n1: Int, n2: Int):Boolean{
    if(n1+n2 < 100) return true
    else return false
}
