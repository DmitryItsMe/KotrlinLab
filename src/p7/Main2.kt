package p7

fun main() {
    println("Введите слово: ")
    var s = readln()
    if(s == s.reversed()) println("Это слово полиндром")
    else println("Слово не полиндром")
}