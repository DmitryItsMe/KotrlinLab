package p8

fun main(){
    println("Ведите n и k (каждое с новой строки)")
    val n = readln().toInt()
    val k = readln().toInt()
    println(nk(n, k))
}

fun nk(n: Int, k: Int):Boolean{
    if(k*k == n) return true
    else return false
}