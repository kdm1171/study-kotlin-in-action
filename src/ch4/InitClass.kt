package ch4

open class User(val nickname: String)

class TwitterUser(nickname: String) : User(nickname)

class User2 constructor(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }
}

class User3(
    val nickname: String,
    val isSubscribed: Boolean = true
)

open class ClassWithDefaultConstructor

class SubClass : ClassWithDefaultConstructor()

class Secretive private constructor()
