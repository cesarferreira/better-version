import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

// Required since Gradle 4.10+.
repositories {
    jcenter()
    maven(url = "http://jcenter.bintray.com/")
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}


dependencies {
    testImplementation("junit:junit:4.12")
    testImplementation("org.amshove.kluent:kluent:1.47")
}
