plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

dependencies {
    implementation(project(":feature"))
    implementation(project(":entity"))
    implementation(project(":shared"))
}