plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

dependencies {
    implementation(project(":entity:dummy"))
    implementation(project(":shared:dummy"))
}