fun main(){
    println(points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")))
    println(points(listOf("0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4")))
    println(points(listOf("1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4")))
}

fun points(games: List<String>): Int {
    var score = 0
    games.forEach { game ->
        val elements = game.split(":")
        val first = elements.first()
        val second = elements.last()
        when{
            first > second -> score+= 3
            first < second -> score+= 0
            else -> score+= 1
        }
    }
    return score
}