package ch4.properties

/*

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    override val nickname: String
        get() = getFacebookName(accountId)

    private fun getFacebookName(accountId: Int): String {
        return "nickname"
    }

}*/

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                    Address was changed for $name:
                    "$field" -> "$value".
                """.trimIndent()
            )
            field = value
        }
}

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val user = User("jade")
    user.address = "Korea"
    user.address = "Seoul"
}
