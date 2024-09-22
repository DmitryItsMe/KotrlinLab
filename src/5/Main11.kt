package `5`

fun main() {
    println("Введите строку: ")
    val s1 = readln()
    println("Введите строку: ")
    val s2 = readln()
    var l = s2.length-1
    var s = ""
    while(l >= 0){
        s += s2.get(l)
        l--
    }
    if(s == s1) println("Являются анаграммами")
    else println("Не являются анаграммами")
}