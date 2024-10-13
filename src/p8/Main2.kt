package p8

fun main(){
    val list = arrayListOf(1, 4, 5, 2, 3, 7, 2)
    println(raz(list))
}

fun raz(list: ArrayList<Int>):Int{
    return list.max() - list.min()
}