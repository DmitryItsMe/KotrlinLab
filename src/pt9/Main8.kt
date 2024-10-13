package pt9

fun main(){
    val r = (1..100).random()
    while(true){
        println("Угадайте число: ")
        var s = readln().toInt()
        if(s == r) {
            println("Вы угадали число!")
            break
        }
        else{
            println("Вы не угадали число..")
            if(s < r) println("Загаданое число БОЛЬШЕ $s")
            else println("Загаданое число МЕНЬШЕ $s")
        }
    }
}