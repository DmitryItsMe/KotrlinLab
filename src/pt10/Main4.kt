package pt10

fun main(){
    println("Введите число: ")
    val n = readln().toInt()
    var list = arrayListOf<String>()

    for(i in 1 .. n){
        if((i%3==0) and (i%5!=0)) list.add("Физллл");
        else if((i%3!=0) and (i%5==0)) list.add("Бизллл")
        else if ((i%3==0) and (i%5==0)) list.add("ВизллБизлл")
        else list.add(i.toString())
    }

    println(list)
}