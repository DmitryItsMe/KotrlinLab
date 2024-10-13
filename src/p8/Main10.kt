package p8

fun main(){
    println("Ведите строку и число (каждое с новой строки)")
    val s = readln()
    val n = readln().toInt()
    ret(s, n)
}

fun ret(s: String, n: Int){
    for (i in 0 until n) print(s)
}