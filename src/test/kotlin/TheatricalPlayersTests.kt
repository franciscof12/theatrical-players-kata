import kotlin.test.Test
import kotlin.test.assertEquals

class TheatricalPlayersTests {
    @Test
    fun `welcome to the theatrical players Kata!`() {
        val name = "User"

        val greeting = greeting(name)

        assertEquals("Welcome to the theatrical players Kata, User!", greeting)
    }
}