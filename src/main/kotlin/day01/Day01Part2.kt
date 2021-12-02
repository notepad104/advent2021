package day01

import root.IPuzzle
import java.io.File
import java.util.*

class Day01Part2 : IPuzzle {
    companion object {
        const val SLIDING_WINDOW = 3
    }

    override fun solvePuzzle(file: File): Int {
        val q: Queue<Int> = LinkedList()
        var sum = 0
        var count = 0
        file.forEachLine {
            run {
                val depth = it.toInt()
                val first = if (q.size == SLIDING_WINDOW) q.remove() else Int.MAX_VALUE
                sum += depth
                q.add(depth)
                if (depth.minus(first) > 0) count++
            }
        }
        return count
    }
}