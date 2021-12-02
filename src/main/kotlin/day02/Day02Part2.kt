package day02

import root.IPuzzle
import java.io.File

class Day02Part2: IPuzzle {

    override fun solvePuzzle(file: File): Int {
        var hor = 0
        var dep = 0
        var aim = 0

        file.forEachLine {
            run {
                val pat = it.split(" ")[0]
                val dist = it.split(" ")[1].toInt()
                when (pat) {
                    "forward" -> {
                        hor += dist
                        dep += dist * aim
                    }
                    "down" -> aim += dist
                    "up" -> aim -= dist
                }
            }
        }
        return (hor * dep)
    }
}