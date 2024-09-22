package `5`


fun main() {

    println("Введите 2 числа (первое меньше второго)")
    println("Первое число: ")
    val n1 = readln().toInt();
    println("Второе число: ")
    val n2 = readln().toInt()

    for(i in n1 .. n2){
        for(j in 2 until i){
            if(i % j == 0) break
            if(j == i-1) println(i)
        }
    }
}