package day01

import root.IPuzzle
import java.io.File

class Day01Part1() : IPuzzle {

    override fun solvePuzzle(file : File) : Int {
        var start = Int.MAX_VALUE
        var count = 0
        file.forEachLine {
            run {
                if (it.toInt().minus(start) > 0) count++
                start = it.toInt()
            }
        }
        return count
    }
}