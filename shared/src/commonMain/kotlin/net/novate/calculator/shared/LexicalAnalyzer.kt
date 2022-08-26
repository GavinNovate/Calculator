package net.novate.calculator.shared

/**
 * 词法分析器
 *
 * @since 2022/8/26
 */
class LexicalAnalyzer {

//    fun analysis(input: String): List<Token> {
//
//    }

}

fun main() {
    println(pickNumber("1.2.0+5"))
}


fun pickNumber(input: String): Pair<NumberToken?, String> {
    var alreadyExistsDecimalPoint = false
    val number = input.takeWhile {
        if (alreadyExistsDecimalPoint) {
            it in '0'..'9'
        } else {
            if (it == '.') {
                alreadyExistsDecimalPoint = true
                true
            } else it in '0'..'9'
        }
    }
    return number.takeIf { it.isNotEmpty() }?.let { NumberToken(it) } to input.drop(number.length)
}

fun pickPlus(input: String): Pair<PlusToken?, String> = pickChar(input, '+').mapFirst { PlusToken }

fun pickMinus(input: String): Pair<MinusToken?, String> = pickChar(input, '-').mapFirst { MinusToken }

fun pickChar(input: String, target: Char): Pair<Char?, String> {
    return if (input.startsWith(target)) {
        target to input.drop(1)
    } else {
        null to input
    }
}

fun <A, B, C, D> Pair<A, B>.map(a: (A) -> C, b: (B) -> D) = a(first) to b(second)

fun <A, B, C> Pair<A, B>.mapFirst(a: (A) -> C): Pair<C, B> = a(first) to second

interface Token {
}

data class NumberToken(val number: String) : Token

object PlusToken : Token

object MinusToken : Token

object TimesToken : Token

object DivToken : Token

object LeftBracketToken : Token

object RightBracketToken : Token