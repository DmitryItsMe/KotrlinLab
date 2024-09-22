package `5`

fun main() {
    println("Введите первое число")
    var n1  = readln().toInt()
    println("Введите второе число")
    var n2  = readln().toInt()
    while(true){
        println("умножить или сложить")
        var s = readln()
        when(s){
            "умножить" -> println(n1*n2)
            "поделеить" -> println(n1+n2)
            "стоп" -> break
            else -> continue
        }
    }
}