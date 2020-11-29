fun main() {

    var x = 10
    var y = 20

    println("= before =")
    println("variable x: $x")
    println("variable y: $y")

    x += y
    y = x - y
    x -= y

    println("= after =")
    println("variable x: $x")
    println("variable y: $y")

}