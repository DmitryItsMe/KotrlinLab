package p8

fun main(){
    println("Ведите минуты и FPS (каждое с новой строки)")
    val m = readln().toInt()
    val f = readln().toInt()
    println(fmf(m, f))
}

fun fmf(m: Int, f: Int):Int{
    return m*60*f
}