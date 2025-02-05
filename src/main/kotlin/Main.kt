fun main() {
    val myLazyValue: String by lazy {
        println("Computando el valor...")
        "¡Hola, Kotlin!"
    }

    println("Antes de acceder a myLazyValue")
    println("myLazyValue: $myLazyValue")
    println("Accediendo nuevamente a myLazyValue: $myLazyValue")
}
