package root

import day01.Day01Part1
import day01.Day01Part2
import day02.Day02Part1
import day02.Day02Part2
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters
import util.TestUtil
import java.io.File

@RunWith(Parameterized::class)
class UnitTest(private val puzzle : IPuzzle, private val filename : String) {

    companion object {
        @JvmStatic
        @Parameters
        fun data() = listOf(
                arrayOf(Day01Part1(), "Day01Test1Data.txt"),
                arrayOf(Day01Part1(), "Day01Test2Data.txt"),
                arrayOf(Day01Part2(), "Day01Test1Data.txt"),
                arrayOf(Day01Part2(), "Day01Test2Data.txt"),
                arrayOf(Day02Part1(), "Day02Test1Data.txt"),
                arrayOf(Day02Part1(), "Day02Test2Data.txt"),
                arrayOf(Day02Part2(), "Day02Test1Data.txt"),
                arrayOf(Day02Part2(), "Day02Test2Data.txt"),
            )
    }

    @Test
    fun sampleTest() {
        val score = getScore()
        print(score)
    }

    private fun getScore() = puzzle.solvePuzzle(File(TestUtil.FILE_PATH + filename))
}