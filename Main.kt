import kotlin.random.Random


fun main(args: Array<String>) {
    val arr : Array<String> = arrayOf("Rock", "Paper", "Scissors")
    val computer = gameOfChoice(arr)

    var param_ = input()
    while (param_ =="yes") {
        print("Pick a choice : ")
        val gamer = readLine()
        println("computer, -> $computer")

        if (computer == "Rock") {
            when (gamer) {
                "Rock" -> println("It's a draw")
                "Paper" -> println("You Win")
                "Scissors" -> println("You Lose")
                else -> println("Pick an appopriate choice")
            }
            param_ = input()
        } else if (computer == "Paper") {
            when (gamer) {
                "Paper" -> println("It's a draw")
                "Scissors" -> println("You Win")
                "Rock" -> println("You Lose")
                else -> println("Pick an appopriate choice")
            }
            param_ = input()
        } else {
            when (gamer) {
                "Scissors" -> println("It's a draw")
                "Rock" -> println("You Win")
                "Paper" -> println("You Lose")
                else -> println("Pick an appopriate choice")
            }
            param_ = input()
        }
    }

    println("thanks for playing")


}
fun gameOfChoice(args: Array<String>): String {
    return args[Random.nextInt(args.size)]
}

fun input() : String? {
    print("do you want to play, yes or no : ")
    val param = readLine()
    return param
}
 