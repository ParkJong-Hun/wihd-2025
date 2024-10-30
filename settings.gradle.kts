pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Wihd2025"
include(":app")
include(":page:dummy", ":page:dummy-impl")
include(":widget:dummy", ":widget:dummy-impl")
include(":feature:dummy", ":feature:dummy-impl")
include(":entity:dummy", ":entity:dummy-impl")
include(":shared:dummy", ":shared:dummy-impl")
 