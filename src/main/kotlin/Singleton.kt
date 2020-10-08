class Player(val name: String, val power: Int)

object PlayingField {

    fun getAllPlayers(): Array<Player> {
        return arrayOf(Player("ali", 55))
    }

    fun isPlayerInGame(player: Player): Boolean {
        return true
    }

}

fun startNewGameTurn() {
    val players = PlayingField.getAllPlayers()
    if (players.size < 2) {
        return println("The game cannot be continued without players")
    }
    for (player in players) {
        nextPlayerTurn(player)
    }
}

fun nextPlayerTurn(player: Player) {
    if (!PlayingField.isPlayerInGame(player)) {
        return println("Current player lost. Next...")
    }
    /* Player actions here */
}

//Nested object
class Player2(val id: Int) {
    object Properties {
        /* Default player speed in playing field - 7 cells per turn */
        val defaultSpeed = 7

        fun calcMovePenalty(cell: Int): Int {
            return 1
        }
    }
    val superSpeed = Properties.defaultSpeed * 2 //14
}

/* prints 7 */

// Objects and nested objects

class Player3(val id: Int) {
    object Properties {
        /* Default player speed in playing field - 7 cells per turn */
        val defaultSpeed = 7

        fun calcMovePenalty(cell: Int): Int {
            return 1
        }
    }

    /* creates a new instance of Player */
    object Factory {
        fun create(playerId: Int): Player3 {
            return Player3(playerId)
        }
    }
}



fun main(args: Array<String>) {
    println(Player2.Properties.defaultSpeed)

    /* prints 7 */
    println(Player3.Properties.defaultSpeed)


/* prints 13 */
    println(Player3.Factory.create(13).id)
}