package `5`

fun main() {
    println("Введите число: ")
    val n1 = readln().toInt();
    var s = 0.0;


    for(i in 1 .. n1){
        s += 1.0/i
    }
    println(s)
}