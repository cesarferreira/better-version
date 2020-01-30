package cesarferreira.betterversion.library

import org.amshove.kluent.shouldEqual
import org.junit.Test

class VersionCodeFactoryTest {

    private val cut = VersionCodeFactory()

    @Test
    fun `Version 0-0-1 should be versionCode 1`() {
        cut.generate(SemVersion(0, 0, 1)) shouldEqual 1
    }

    @Test
    fun `Version 0-1-0 should be versionCode 10`() {
        cut.generate(SemVersion(0, 1, 0)) shouldEqual 1000
    }

    @Test
    fun `Version 1-0-0 should be versionCode 1000000`() {
        cut.generate(SemVersion(1, 0, 0)) shouldEqual 1000000
    }

    @Test
    fun `Version 3-1-0 should be versionCode 3001000`() {
        cut.generate(SemVersion(3, 1, 0)) shouldEqual 3001000
    }

    @Test
    fun `Version 99-99-99 should be versionCode 99099099`() {
        cut.generate(SemVersion(99, 99, 99)) shouldEqual 99099099
    }

    @Test
    fun `Version 99-0-0 should be versionCode 99000000`() {
        cut.generate(SemVersion(99, 0, 0)) shouldEqual 99000000
    }

    @Test
    fun `Version 99-0-500 should be versionCode 99000500`() {
        cut.generate(SemVersion(99, 0, 500)) shouldEqual 99000500
    }

    @Test
    fun `Version 999-521-1 should be versionCode 999521001`() {
        cut.generate(SemVersion(999, 521, 1)) shouldEqual 999521001
    }

    @Test
    fun `Version 999-521-521 should be versionCode 99521521`() {
        cut.generate(SemVersion(99, 521, 521)) shouldEqual 99521521
    }

    @Test
    fun `Version 500-500-500 should be versionCode 500500500`() {
        cut.generate(SemVersion(500, 500, 500)) shouldEqual 500500500
    }
}