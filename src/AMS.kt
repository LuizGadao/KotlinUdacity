import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}")

    feedTheFish()

    for (i in 1..10) {
        println("Your fortune is: ${getFortuneCookie()}")
    }

    //dayOfWeek()

    /*
    val temperature = 10
    var isHot = temperature > 50
    var message = "You are ${if (isHot) "fried" else "safe" } fish"
    println(message)

    checkHour(Calendar.getInstance().get(Calendar.HOUR_OF_DAY))
    */
}

fun getFortuneCookie(): String {
    val myPhrases = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune")

    print("Enter your birthday: ")
    val birthDay = readLine()
    val birth = birthDay!!.toIntOrNull() ?: 1
    val index = birth % myPhrases.size

    return myPhrases[index]
}

fun feedTheFish() {
    val day = randomDay()
    var food = "pallets"
    println("Today is $day an the fish eat $food")
}

fun randomDay(): String {
    val daysOfWeek = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return daysOfWeek[Random().nextInt(daysOfWeek.size)]
}


fun checkHour(hour: Int) {
    println("Hour: $hour")
    when (hour) {
        in 0..11 -> println("Good morning")
        else -> println("Good night, Kotlin")
    }
}

fun dayOfWeek() {
    print("What day is it today? ")

    val dayN = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when (dayN) {
        Calendar.SUNDAY -> println("Sunday")
        Calendar.MONDAY -> println("Monday")
        Calendar.TUESDAY -> println("Tuesday")
        Calendar.WEDNESDAY -> println("Wednesday")
        Calendar.THURSDAY -> println("thursday")
        Calendar.FRIDAY -> println("Friday")
        else -> println("Saturday")
    }

}