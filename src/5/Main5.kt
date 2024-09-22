package `5`

fun main() {
    println("Введите число: ")
    val n = readln().toInt();
    var c = true;
    for (i in 2 ..n-1) {
        if(n % i == 0) c = false;
    }
    if(c == true) println("Число простое")
    else println("Число непростое")
}