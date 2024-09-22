package p4

fun main(){
    println("Введите длины 3х сторон треугольника (каждое с новой строки):")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if(a == b) println("Треугольник равнобедренный")
    if((a == b) and (a == c)) println("Треугольник равносторонний")
    if((a !== b) and (a !== c)) println("Треугольник разносторонний")

    if((a > c) and (a > b)) tr(a, b, c)
    else if((c > b) and (c > a)) tr(c, b, a)
    else if((b > a) and (b > c)) tr(b, c, a)
}

fun tr(a: Int, b: Int, c: Int){
    if((c*c) > ((a*a) + (b*b))) println("Треугольник тупоугольный")
    if((c*c) == ((a*a) + (b*b))) println("Треугольник прямоугольный")
    if((c*c) < ((a*a) + (b*b))) println("Треугольник остроугольный")
}