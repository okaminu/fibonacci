package lt.okaminu.fibonacci

object Fibonacci extends App {
    println(fibonacci(args(0).toShort))

    def fibonacci(index: Int): Int = index match {
        case 0 | 1 => 1
        case _ => fibonacci(index - 2) + fibonacci(index - 1)
    }
}
