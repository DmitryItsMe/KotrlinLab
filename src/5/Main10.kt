package `5`

fun main() {
    println("Введите число: ")
    var n = readln().toInt();
    var s = 0;
    while(n != 0){
        s += n % 10
        n = n / 10
    }
    println(s)
}