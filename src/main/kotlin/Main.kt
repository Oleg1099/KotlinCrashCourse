import java.math.BigInteger

// TODO: Вывод данных

//fun main() {
//    // print - выводит бе пробелов!
//    print("Hello World!")
//    print("How are you?") // >>> Hello World!How are you?
//
//    println()
//
//    println("Как твои дела?")  // >>>  Как твои дела?
//    println("Ты где? Не бойся!")   // >>> Ты где? Не бойся!
//}


// TODO: Переменные
// fun main() {
//    // val - неизменяемая переменная, var - изменяемая переменная
////    val hello = "hello"
////    var a = 123
//
//    // Указываем тип переменной принудительно
//    val a: Int = 123
//    println(a)
//    val text: String = "text"
//    println(text)
//    // Работа с большими числами
//    val l = BigInteger("2423423423423423434342342348278927436234786000000000000000000000000000000000000000000000")
//    println(l)
//    val l2: Long = 9_223_372_036_854_775_807L // Максимальное число long
//    println(l2)
//
//
//    // Сложение (конкатенация строк)
//    val name1: String = "Name_"
//    val name2: String = "_namE"
//    val name3 = name1 + name2
//    println(name3)
//
//    val a = 120
//    val b = 10
//    val result = a + b
//    println("Результат: ${a} + ${b} = ${result}")
//}

// TODO: Работа с BigInteger
//fun main() {
//    // Создаем два больших числа
//    val a = BigInteger("123456789012345678901234567890")
//    val b = BigInteger("987654321098765432109876543210")
//
//    // Сложение
//    val sum = a.add(b)
//    println("Сложение: $a + $b = $sum")
//    println(sum)
//
//    // Вычитание
//    val difference = b.subtract(a)
//    println("Вычитание: $b - $a = $difference")
//
//    // Умножение
//    val product = a.multiply(b)
//    println("Умножение: $a * $b = $product")
//
//    // Деление (целочисленное)
//    val quotient = b.divide(a)
//    println("Деление: $b / $a = $quotient")
//
//    // Остаток от деления
//    val remainder = b.remainder(a)
//    println("Остаток от деления: $b % $a = $remainder")
//
//    // Возведение в степень (например, a^3)
//    val power = a.pow(3)
//    println("Возведение в степень: $a^3 = $power")
//}

// TODO: Работа с Long
//fun main() {
//    val a: Long = 1234567890123456789L
//    val b: Long = 987654321098765432L
//
//    // Сложение
//    val sum = a + b
//    println("$a + $b = $sum")
//    println(sum)
//
//    // Вычитание
//    val difference = a - b
//    println("$a - $b = $difference")
//
//    // Умножение
//    val product = a * b
//    println("$a * $b = $product")
//
//    // Деление (целочисленное)
//    val quotient = a / b
//    println("$a / $b = $quotient")
//
//    // Остаток от деления
//    val remainder = a % b
//    println("$a % $b = $remainder")
//
//    // Возведение в степень (используем `toDouble()`, т.к. в Kotlin нет встроенного оператора степени для Long)
//    val exponent = 3
//    val power = Math.pow(a.toDouble(), exponent.toDouble()).toLong()
//    println("$a^$exponent ≈ $power") // Приблизительное значение из-за ограничений Double
//}

// TODO: Null-safety ? !!
/*
Это ситуация, когда мы обращаемся к какому-то полю (объекту класса) который
при этом имеет значение null и таким образом, мы можем попытаться вызвать у него
какой-то метод у объекта этого класса, но из-за того что он null приложение вылитит.
По этому есть переменные которые могут быть null а есть которые не могут.
 */
//fun main() {
//    val greeting: String  // переменная string точно не будет null
//    val greetingNull: String?  // переменная может быть null или нет.
//
//    // В одну строку
//    //println("Enter yuor greeting: ${readlnOrNull().also { greetingNull = it }}")
//
//    println("Введите что-то: ")
//    greetingNull = readLine()
//
//
//    // Размер строки
//    println("Длина строки: ${greetingNull?.length}") // !! вместо ? лучше не ставить!
//}

// TODO: Оператор if и продолжение Null-Safety
//fun main() {
//    val greetingNull: String?
//
//    println("Введите что-то, или оставьте строку пустой: ")
//    greetingNull = readLine()
//
//    if (greetingNull?.isEmpty() == true) {
//        println("Строка пустая!")
//
//    } else if (greetingNull == "Hello World!") {
//        println("В строке присутствует: ${greetingNull}")
//
//    } else if (greetingNull == "yy") {
//        println("В строке присутствует: ${greetingNull}")
//
//    } else {
//        println("Строка не пустая, вот её размер:")
//    }
//
//    println("Длина строки: ${greetingNull?.length}")
//}

// TODO: Оператор элвейс - ?:
//fun main() {
//    // Отрабатывается когда переменная null
//    val greNull: String
//    greNull = readLine()?: "Эта надпись появилась, т.к. ничего не ввели!"
//    println("Тут выводится то, что ввели или не ввели выше! ${greNull}")

//    val greNull: String
//    greNull = readLine().toString()
//    println("Тут выводится то, что ввели или не ввели выше! ${greNull}")
//}

// TODO: Условный оператор when
fun main() {

}
