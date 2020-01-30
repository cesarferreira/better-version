package cesarferreira.betterversion.library

data class SemVersion(
    val major: Int,
    val minor: Int,
    val patch: Int
)

class VersionCodeFactory {

    // 000 0 000 0 000
    // 500500500 // 500.500.500
    // 1000000 // 1.0.0
    // 1001001 // 1.1.1
    fun generate(sem: SemVersion): Int {
        val part1 = sem.major * 1000000
        val part2 = sem.minor * 1000
        val part3 = sem.patch

        return part1 + part2 + part3
    }

    private fun Int.orOne(): Int = if (this == 0) 1 else this
}

