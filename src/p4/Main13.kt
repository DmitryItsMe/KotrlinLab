package p4

fun main(){
    println("Выберите код ошибки\n(100/200/300): ")
    val n = readln();

    when(n){
        "100" -> println("Неудачное соединение с сервером из-за неверного пароля")
        "200" -> println("Запрос успешно обработан")
        "300" -> println("Нарушение порядка зажигания")
        else -> println("Неверные данные")

    }
}