package p4

fun main(){
    println("Выберите способ оплаты \n(наличные/карта/PayPal): ")
    val n = readln();

    when(n){
        "наличные" -> println("Вы выбрали оплату наличными")
        "карта" -> println("Вы выбрали оплату картой")
        "PayPal" -> println("Вы выбрали оплату PayPal")

        else -> println("Неверные данные")

    }
}