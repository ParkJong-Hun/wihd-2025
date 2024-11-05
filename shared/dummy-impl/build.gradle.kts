plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android.namespace = "co.kr.parkjonghun.wihd2025.shared.dummyimpl"

android {
    compileSdk = 35

    defaultConfig {
        minSdk = 24
        targetSdk = 35
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}