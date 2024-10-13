package p8

fun main() {
    println("Введите строку: ")
    var s = readln()
    println(p41(s))
}

fun p41(n: String): Int{
    var n1 = 0
    for(i in 0 until  n.length){
        if((n.get(i) == 'а') or (n.get(i) == 'е') or
            (n.get(i) == 'ё') or (n.get(i) == 'и') or
            (n.get(i) == 'о') or (n.get(i) == 'у') or
            (n.get(i) == 'ы') or (n.get(i) == 'э') or
            (n.get(i) == 'ю') or (n.get(i) == 'я')) n1++
    }
    return n1
}