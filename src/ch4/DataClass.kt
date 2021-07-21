package ch4
/*

class Client(
    val name: String,
    val postalCode: Int
) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client) {
            return false
        }
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}
*/

data class Client(
    val name: String,
    val postalCode: Int
)


fun main(args: Array<String>) {
    val client = Client("jade", 30300)
    val client2 = Client("jade", 30300)

    println(client)

    println(client == client2)


    val processed = hashSetOf(Client("jade", 30300))
    println(processed.contains(Client("jade", 30300)))

    val jade = Client("jade", 30300)
    println(jade.copy(postalCode = 10100))

}

