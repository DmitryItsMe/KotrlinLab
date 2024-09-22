package p4

fun main(){
    println("Выберите мясо (курица/свиниа/говядина): ")
    val n = readln();

    when(n){
        "курица" -> println("20 минут")
        "свинина" -> println("25 минут")
        "говядина" -> println("30 минут")

        else -> println("Неверные данные")

    }
}