package `5`

fun main() {
    println("Введите число: ")
    val n1 = readln().toInt();

    var c = 0;
    var nc = 0;
    for(i in 1..n1 ){
        if(i % 2 == 0) c += i
        else nc += i
    }
    println("Сумма четных чисел: $c")
    println("Сумма нечетных чисел: $nc")
}