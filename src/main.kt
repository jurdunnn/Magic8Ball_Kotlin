fun main(args: Array<String>){
        println("Ask away...")

        //User input
        var question = readLine()

        //8 Ball answer
        if(rollDie()) {
            println("This will come true...")
        } else {
            println("This will not come true...")
        }
    }

    fun rollDie(): Boolean{
        val result: Int = (0..6).random() //random number

        if(result > 3) {
            return true // >3 return true
        } else if (result < 3) {
            return false // <3 return true
        } else {
            rollDie() // =3 re-roll
        }
        return false
    }
