plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android.namespace = "co.kr.parkjonghun.wihd2025.widget.dummyimpl"

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
    implementation(project(":feature:dummy"))
    implementation(project(":entity:dummy"))
    implementation(project(":shared:dummy"))
}