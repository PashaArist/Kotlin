package bot

import java.util.Scanner


val scanner = Scanner(System.`in`)

fun main() {
    greet("Спайк", "2022")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Привет! меня зовут ${assistantName}.")
    println("Я был создан в ${birthYear}.")
    println("Пожалуйста, напомни своё имя.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("Какое у тебя замечательное имя, ${name}!")
}

fun guessAge() {
    println("Давай я попробую угадать твой возраст.")
    println("Введи остатки от деления твоего возраста на 3,5 и 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Ваш возраст равен ${age}; это хорошее время, чтобы начать программировать!")
}

fun count() {
    println("Теперь я докажу вам, что могу считать до любого числа, которое вы хотите.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    val option1 = 1
    val option2 = 2
    val option3 = 3
    val option4 = 4
    println("Давай проверим ваши знания в области программирования.")
    println("Какая функция служит точкой входа приложения?")
    println("1.start")
    println("2.new")
    println("3.main")
    println("4.public")
    var num = readln().toInt()
    while (num != option3) {
        println("Пожалуйста, попробуйте снова.")
        num = readln().toInt()
    }
}

fun end() {
    println("Поздравляю, хорошего дня!")
}