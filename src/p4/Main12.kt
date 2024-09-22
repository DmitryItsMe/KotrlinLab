package p4

fun main(){
    println("Выберите страну \n(США/Россия/Япония): ")
    val n = readln();

    when(n){
        "США" -> println("Американцы")
        "Россия" -> println("Русские")
        "Япония" -> println("Японцы")
        else -> println("Неверные данные")

    }
}