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

        flatDir {
            dirs("Z:/MarcoScherzer-Projects/MGridBuilder_AndroidVersion/mgridbuilder_androidversion/build/outputs/aar")
        }
    }
}

rootProject.name = "MSimpleHttpServerAndroidApp"
include(":app")

