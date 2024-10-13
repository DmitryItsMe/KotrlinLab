package p8

fun main(){
    println("Ведите prob, prize, pay (каждое с новой строки)")
    val prob = readln().toInt()
    val prize = readln().toInt()
    val pay = readln().toInt()
    println(prz2(prob, prize, pay))
}

fun prz2(prob: Int, prize: Int, pay: Int):Boolean{
    if(prob*prize > pay) return true
    else return false
}
