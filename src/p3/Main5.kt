package p3

fun main() {
    println("Введите длины 3х сторон триугольника (каждое с новой строки):")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()

    if(((n1+n2)<n3) or ((n1+n3)<n2) or ((n3+n2)<n1)) println("Триугольник не существует")
    else println("Триугольник существует")
}