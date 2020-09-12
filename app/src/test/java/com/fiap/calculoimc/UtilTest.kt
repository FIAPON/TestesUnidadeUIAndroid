package com.fiap.calculoimc

import org.junit.Assert.*
import org.junit.Test

class UtilTest {

    @Test
    fun testGetImcResult_90_180_sobrepeso() {
        val result = getImcResult("90", "1.80")

        assertEquals(result.result, Result.SOBREPESO)
    }

    @Test
    fun testGetImcResult_embranco_abiso() {
        val semPeso = getImcResult("", "1.80")
        assertEquals(semPeso.result, Result.BLANK)

        val semAltura = getImcResult("90", "")
        assertEquals(semAltura.result, Result.BLANK)
    }

}