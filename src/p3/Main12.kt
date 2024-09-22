package p3

fun main() {
    println("Введите двузначное число:")
    val n1 = readln().toInt()

    if((n1/10) > (n1%10)) println("первая цифра больше второй")
    else if((n1/10) < (n1%10)) println("первая цифра меньше второй")
    else println("цифры равны")


}