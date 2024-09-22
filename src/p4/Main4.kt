package p4

fun main(){
    println("Введите час суток: ")
    val n = readln().toInt()

    when(n){
        1 -> println("Ночь")
        2 -> println("Ночь")
        3 -> println("Ночь")
        4 -> println("Ночь")
        5 -> println("Ночь")
        6 -> println("Утро")
        7 -> println("Утро")
        8 -> println("Утро")
        9 -> println("Утро")
        10 -> println("Утро")
        11 -> println("Утро")
        12 -> println("День")
        13 -> println("День")
        14 -> println("День")
        15 -> println("День")
        16 -> println("День")
        17 -> println("День")
        18 -> println("Вечер")
        19 -> println("Вечер")
        20 -> println("Вечер")
        21 -> println("Вечер")
        22 -> println("Вечер")
        23 -> println("Вечер")
        24 -> println("Ночь")
        else -> println("Неверное время")

    }
}
