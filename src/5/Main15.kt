package `5`

fun main() {

    println("Введите строку: ")
    val s = readln()
    var l = s.length-1
    var st = ""
    while(l >= 0){
        st += s.get(l)
        l--
    }
    if(s == st) println("Полиндром")
    else println("Не полиндром")
}