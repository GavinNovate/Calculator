package net.novate.calculator.shared

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * 词法分析器测试
 *
 * @since 2022/8/26
 */
internal class LexicalAnalyzerKtTest {

    @Test
    fun pickNumberTest() {

        println( pickNumber("1.25+2.25"))
        println( pickNumber("1.25.12+2.25"))
        assertEquals("1.25", pickNumber("1.25+2.25").first?.number)
        assertEquals("1.25", pickNumber("1.25.12+2.25").first?.number)

    }
}