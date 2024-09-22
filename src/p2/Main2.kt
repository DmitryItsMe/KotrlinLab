package p2

fun main() {
    println("Введите трезначное число")
    var n = readln().toInt()
    var s = 0;
    var s1 = 0;
    var sum = 0;
    var prz = 1;
    while(n > 0){
        if(n%10==1) s1++
        sum += n%10
        prz *= n%10
        n /= 10
        s++
    }
    println("Число десяткво: $s")
    println("Число единиц: $s1")
    println("Сумма цифр $sum")
    println("Произведение цифр $prz")
}