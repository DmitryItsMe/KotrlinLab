package pt9

fun main(){
    println("Введите число: ")
    val n = readln().toInt()
    for(i in 1 .. n){
        if(prost(i) == true) println(i)
    }
}

fun prost(n: Int): Boolean{
    if(n == 1) return false
    else{
        for(i in 2 until n){
            if(n%i==0) return false
        }
        return true
    }
}