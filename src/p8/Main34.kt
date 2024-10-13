package p8

fun main() {
    println("Введите строку: ")
    var s = readln()
    println(p34(s))
}

fun p34(n: String): String{
    var s = ""
    for(i in 0 until  n.length){
        if(n.get(i)!=' ') s += n.get(i) else continue
    }
    return s
}