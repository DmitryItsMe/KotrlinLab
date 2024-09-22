package `5`

fun main() {
    println("Введите число: ")
    val n1 = readln().toInt();
    println("Введите число: ")
    val n2 = readln().toInt();

    var i = 0
    if(n1 > n2)  i = n2
    else i = n1

    while(i >= 1){
        if((n1 % i == 0) && (n2 % i == 0)) {println(i); break;}
        i--
    }

}