package bomb.client.module

import de.its.game.client.bomb.BombClient
import de.its.game.client.bomb.ResponseStatus
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BrickModule {

    private val bombClient = BombClient()

    @Test
    fun sendToBomb() {
        val bombResponse = bombClient.unlockAction("brick", this::solvePuzzle)

        assertEquals(bombResponse.status, ResponseStatus.OK)
    }

    private fun solvePuzzle(inputData: String): String {
        return ""
    }

}