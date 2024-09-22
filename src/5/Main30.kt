package `5`

fun main() {
    println("Введите число: ")
    var n1 = readln().toInt();
    var d = ""

    while(n1 > 0){
        if(n1 % 2 == 0) d += "0"
        else d += "1"
        n1 /= 2
    }

    var res = ""
    var l = d.length - 1
    while(l >= 0){
        res += d.get(l)
        l--
    }
    println(res)
}