plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android.namespace = "co.kr.parkjonghun.wihd2025.shared.test"

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

dependencies {
    implementation(libs.junit)
    implementation(libs.androidx.junit)
    implementation(libs.androidx.espresso.core)
    implementation(libs.kotlinx.coroutines.test)
    implementation(libs.mockk)
    implementation(libs.mockk.android)
    implementation(libs.robolectric)
    implementation(libs.turbine)
}