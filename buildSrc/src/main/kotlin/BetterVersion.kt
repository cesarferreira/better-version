class BetterVersion {
    companion object {

        fun versionCode(major: Int, minor: Int, patch: Int): Int {
            return VersionCodeFactory().generate(SemVersion(major, minor, patch))
        }

        fun versionCode(sem: SemVersion): Int {
            return versionCode(sem.major, sem.minor, sem.patch)
        }

        fun versionName(major: Int, minor: Int, patch: Int): String {
            return "$major.$minor.$patch"
        }

        fun versionName(sem: SemVersion): String {
            return "${sem.major}.${sem.minor}.${sem.patch}"
        }
    }
}
