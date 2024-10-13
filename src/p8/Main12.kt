package p8

fun main(){
    println("Введите число: ")
    val n = readln().toInt()
    google(n)
}

fun google(n: Int){
    print("g")
    for(i in 0 until n)  print("o")
    print("gle")
}