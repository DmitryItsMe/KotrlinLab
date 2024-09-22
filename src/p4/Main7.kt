package p4

fun main(){
    println("Напишите строку из символов '*' (до 5 символов): ")
    val n = readln()

    when(n){
        "*" -> println(1)
        "**" -> println(2)
        "***" -> println(3)
        "****" -> println(4)
        "*****" -> println(5)

        else -> println("Невернные данные")

    }
}