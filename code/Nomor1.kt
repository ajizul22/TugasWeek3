fun main() {
    var x = 10
    var y = 20

    println("= before =")
    println("variable x: $x")
    println("variable y: $y")

    val temp = x
    x = y
    y = temp

    println("= after =")
    println("variable x: $x")
    println("variable y: $y")
}