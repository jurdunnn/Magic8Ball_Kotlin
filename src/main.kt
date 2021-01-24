fun main(args: Array<String>){
    println("Ask away...")

    //User input
    var question = readLine()

    val result: Int = (1..8).random() //random number
    var answer: String = ""
    when(result) {
        1 -> answer = "As I see it, yes."
        2 -> answer = "Ask again later."
        3 -> answer = "Better not tell you now."
        4 -> answer = "Cannot predict now."
        5 -> answer = "Concentrate and ask again."
        6 -> answer = "Don't count on it."
        7 -> answer = "It is certain."
        8 -> answer = "It is decidedly so."
    }
    println(answer)
}

