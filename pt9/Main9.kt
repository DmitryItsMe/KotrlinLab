package pt9

fun main(){
    println("Введите длину пароля: ")
    val n = readln().toInt()
    println(pass(n))
}

fun pass(n: Int): String{
    val cha = arrayListOf('*','.','/','$','>','@','!','&',',','[',')')
    var pasw = ""
    for(i in 1 .. n){
        val r = (0..2).random()
        when(r){
            0 -> pasw += (0..9).random()
            1 -> pasw += ('A'..'Z').random()
            2 -> pasw += cha.random()
        }
    }
    return pasw
}