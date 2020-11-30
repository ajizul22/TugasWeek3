fun main() {

    print("masukan kata: ")
    val words = readLine()!!.toLowerCase()
    printWords(words)

}

fun printWords(words: String) {
    var vocal = ""
    var consonant = ""

    for (i in 0..words.length - 1) {
        if (words[i] == 'a' || words[i] == 'e' || words[i] == 'i' || words[i] == 'o' || words[i] == 'u') {
          vocal += words[i]
        } else consonant += words[i]
    }

    val vocalSort = vocal.toCharArray().sorted()


    for (i in 0..vocalSort.size - 1) {
        println(vocalSort[i].toUpperCase())
    }
    for (i in 0..consonant.length-1) {
        println(consonant[i].toUpperCase())
    }

}