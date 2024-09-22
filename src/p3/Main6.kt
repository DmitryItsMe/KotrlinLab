package p3

fun main() {
    println("Введите год:")
    val y = readln().toInt()

    if(y % 100 == 0){
        if(y % 400 == 0) println("Год високосный")
        else println("Год невисокосный")
    }
    else if((y % 4 ==0) and !(y % 100 == 0)) println("Год високосный")
    else println("Год невисокосный")

}

