package day02

import root.IPuzzle
import java.io.File

class Day02Part1 : IPuzzle {

    override fun solvePuzzle(file: File): Int {
        var hor = 0
        var dep = 0

        file.forEachLine {
            run {
                val pat = it.split(" ")[0]
                val dist = it.split(" ")[1].toInt()
                when (pat) {
                    "forward" -> hor += dist
                    "down" -> dep += dist
                    "up" -> dep -= dist
                }
            }
        }
        return (hor * dep)
    }
}