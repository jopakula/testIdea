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