package `5`

fun main() {
    val n = (1..100).random();
    while(true){
        println("Угадайте число от 1 до 100")
        val a = readln().toInt()
        if(a == n){
            println("Вы угадали число!")
            break
        }
        else println("Вы не угадали число")
    }
}
