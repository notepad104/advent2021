package day01

import org.junit.Assert
import org.junit.Test
import root.TestInit

class Day01Part2Test : TestInit() {
    private val day01Part2 = Day01Part2()

    @Test
    fun sampleTest() {
        val score = getScore(day01Part2, "Day01Test1Data.txt")
        Assert.assertEquals(5, score)
    }

    @Test
    fun bigSampleTest() {
        val score = getScore(day01Part2,"Day01Test2Data.txt")
        print(score)
        Assert.assertTrue(true);
    }
}