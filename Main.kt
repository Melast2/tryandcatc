import java.lang.ClassCastException
import java.lang.Exception


fun main (args: Array<String>) {
    println("Котлин - работа с исключениями")
    var num: Int? = try {
        args[0].toIntOrNull()
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Вызвано исключение ${e.javaClass.simpleName}(;${e.message})")
        null
    }
    println("Исключение перехвачено и программа работает дальше!")
    val num1: Int = try {
        num!!
    } catch (e: NullPointerException) {
        println("Вызвано исключение ${e.javaClass.simpleName}(;${e.message})")
        0
    }
    println("Исключение перехвачено и программа работает дальше!")
    val num2: Int = try {
        0 / num1
    } catch (e: ArithmeticException) {
        println("Вызвано исключение ${e.javaClass.simpleName}(;${e.message})")
        0
    }
    println("Исключение перехвачено и программа работает дальше!")
    try {
        throw ClassCastException()
    }catch (e:ClassCastException){
        println("Вызвано исключение ${e.javaClass.simpleName}(;${e.message})")
    }
    println("Исключение перехвачено и программа работает дальше!")
    try {
        throw Exception()
    }catch (e:Exception){
        println("Вызвано исключение ${e.javaClass.simpleName}(;${e.message})")
    }
    println("Исключение перехвачено и программа работает дальше!")
    try {
        throw NullPointerException()
    }catch (e:NullPointerException){
        println("Вызвано исключение ${e.javaClass.simpleName}(;${e.message})")
    }
    println("Исключение перехвачено и программа работает дальше!")
}