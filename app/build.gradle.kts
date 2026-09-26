plugins {
    id("com.android.application")
}
android {
    namespace = "ro.anre.gradii"
    compileSdk = 35
    defaultConfig {
        applicationId = "ro.anre.gradii"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}
