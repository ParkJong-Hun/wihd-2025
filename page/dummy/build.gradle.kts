plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

dependencies {
    implementation(project(":widget:dummy"))
    implementation(project(":feature:dummy"))
    implementation(project(":entity:dummy"))
    implementation(project(":shared:dummy"))
}