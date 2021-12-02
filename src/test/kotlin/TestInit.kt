package root

import util.TestUtil
import java.io.File

open class TestInit {

    protected fun getScore(puzzle : IPuzzle, filename : String) = puzzle.solvePuzzle(File(TestUtil.FILE_PATH + filename))

}