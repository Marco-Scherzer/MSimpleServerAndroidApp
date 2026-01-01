plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.marcoscherzer.msimplehttpserverandroidapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.marcoscherzer.msimplehttpserverandroidapp"
        minSdk = 34
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation("org.bouncycastle:bcprov-jdk15to18:1.70")

    implementation("com.google.code.gson:gson:2.10.1")

    implementation(files("Z:\\MarcoScherzer-Projects\\MSimpleHttpServer\\nativeWrapper\\MSimpleHttpServer.jar"))

    implementation(files("Z:\\MarcoScherzer-Projects\\MGridBuilder_AndroidVersion\\mgridbuilder_androidversion\\build\\outputs\\aar\\mgridbuilder_androidversion-release.aar"))
}


