package day01

import org.junit.Assert
import org.junit.Test
import root.TestInit

class Day01Part1Test : TestInit() {
    private val day01Part1 = Day01Part1()

    @Test
    fun sampleTest() {
        val score = getScore(day01Part1, "Day01Test1Data.txt")
        Assert.assertEquals(7, score)
    }

    @Test
    fun bigSampleTest() {
        val score = getScore(day01Part1,"Day01Test2Data.txt")
        print(score)
        Assert.assertTrue(true);
    }
}