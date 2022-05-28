fun main() {

    for (x in 0..9) {
        for (y in 0..9) {
            println("Result = ${x * y}")
        }
    }
    var x = 0
    for (y in 0..9) {
        x += y
    }

    println("$x")
}