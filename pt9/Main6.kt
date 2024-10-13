package pt9

fun main(){
    println("Введите 5 строк (каждоку с новой строки)")
    var list = arrayListOf<String>()
    for(i in 1 .. 5){
        var s = readln()
        list.add(s)
    }
    println(list.sorted())
}