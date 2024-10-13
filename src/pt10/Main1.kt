package pt10

fun main(){
    println("Введите число: ")
    val n = readln().toInt()
    println(lsss(n))
}

fun lsss(n: Int): List<Int>{
    var list = arrayListOf<Int>()
    if(n == 0) return list
    else {
        for(i in n downTo 1){
            list.add(i)
        }
    }
    return list
}