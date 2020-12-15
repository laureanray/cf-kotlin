fun main(args: Array<String>) {
    val q: Int? = readLine()?.toInt()
    for (i in 0 until q!!) {
        val (x: Int, y: Int) = readLine()!!
            .split(' ')
            .map { input-> input.toInt() }
            .sorted()

        println("1 ${x - 1} ${y - x + 1}")
    }
}