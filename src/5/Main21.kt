package `5`

fun main() {

    println("Введите год: ")
    val y = readln().toInt()
    println("Введите месяц (номер): ")
    val m = readln().toInt()

    when(m){
        1 -> mt31(m, y)
        2 -> mtf(m, y)
        3 -> mt31(m, y)
        4 -> mt30(m, y)
        5 -> mt31(m, y)
        6 -> mt30(m, y)
        7 -> mt31(m, y)
        8 -> mt31(m, y)
        9 -> mt30(m, y)
        10 -> mt31(m, y)
        11 -> mt30(m, y)
        12 -> mt31(m, y)

    }
}

fun mt31(m: Int, y: Int){
    for(i in 1 .. 31) println("$i.$m.$y")

}

fun mt30(m: Int, y: Int) {
    for (i in 1..31) println("$i.$m.$y")
}

fun mtf(m: Int, y: Int) {
    if(y % 100 == 0){
        if(y % 400 == 0) for(i in 1 .. 29) println("$i.$m.$y")
        else for(i in 1 .. 28) println("$i.$m.$y")
    }
    else if((y % 4 ==0) and !(y % 100 == 0)) for(i in 1 .. 29) println("$i.$m.$y")
    else for(i in 1 .. 28) println("$i.$m.$y")
}

