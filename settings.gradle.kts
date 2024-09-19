pluginManagement {
    repositories {
        google {
            google()
            mavenCentral()
            gradlePluginPortal()
        }

    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "LAB-WEEK-05"
include(":app")
 