package p4

fun main(){
    println("Выберите группу крови \n(A/B/AB/O): ")
    val n = readln();

    when(n){
        "A" -> println("Можно перелить O, A")
        "B" -> println("Можно перелть O, B")
        "AB" -> println("Можно перелть O, A, B, AB")
        "O" -> println("Можно перелть O")

        else -> println("Неверные данные")

    }
}