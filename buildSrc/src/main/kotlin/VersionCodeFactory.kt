class VersionCodeFactory {

    fun generate(sem: SemVersion): Int {
        val part1 = sem.major * 1000000
        val part2 = sem.minor * 1000
        val part3 = sem.patch

        return part1 + part2 + part3
    }
}

