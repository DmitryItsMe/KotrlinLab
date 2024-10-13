package p8

fun main(){
    val list = arrayListOf(1, 4, 5, 2, 3, 0)
    println(sum(list))
}

fun sum(list: ArrayList<Int>):Int{
    return list.sum()
}