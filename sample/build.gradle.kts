plugins {
    id("com.android.application")
    id("sample")
    kotlin("android")
    kotlin("android.extensions")
}

val version = SemVersion(3, 1, 133)

android {
    compileSdkVersion(29)
    buildToolsVersion = "29.0.2"

    defaultConfig {
        applicationId = "cesarferreira.betterversion"

        minSdkVersion(21)
        targetSdkVersion(29)


        versionCode = BetterVersion.versionCode(version)
        versionName = BetterVersion.versionName(version)

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.core:core-ktx:1.1.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
}
