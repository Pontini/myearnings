plugins {
    id("com.android.library")
    id("kotlin-kapt")
    kotlin("android")
    kotlin("android.extensions")
    id("dagger.hilt.android.plugin")
    id("kotlin-android")
}
apply(from = "$rootDir/ktlint.gradle")

android {
    compileSdk = 31

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Lib.AndroidX.Compose.version
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    defaultConfig {
        minSdk = 29
        targetSdk = 31
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(mapOf("path" to ":app:features:profile:publ")))
    implementation(project(mapOf("path" to ":app:features:share:publ")))
    implementation(project(mapOf("path" to ":app:features:share:publAndroid")))
    implementation(project(mapOf("path" to ":app:design_system")))

    implementation("org.jetbrains.kotlin:kotlin-stdlib:${rootProject.extra["kotlin_version"]}")

    implementation(Lib.AndroidX.Compose.composeUi)
    implementation(Lib.AndroidX.Compose.materialCompose)
    implementation(Lib.AndroidX.Compose.toolingPreview)
    implementation("androidx.compose.ui:ui:${rootProject.extra["compose_version"]}")
    implementation("androidx.compose.material:material:${rootProject.extra["compose_version"]}")
    implementation("androidx.compose.ui:ui-tooling-preview:${rootProject.extra["compose_version"]}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${rootProject.extra["compose_version"]}")
    debugImplementation(Lib.AndroidX.Compose.tooling)
    implementation(Lib.AndroidX.Compose.activityCompose)

    implementation(Lib.Core.ktx)
    implementation(Lib.AndroidX.AppCompat.appcompat)
    implementation(Lib.Material.material)
    implementation(Lib.AndroidX.Lifecycle.runtime)

    implementation(Lib.Kotlin.stdlib)

    api(Lib.HiltDagger.hilt)
    debugImplementation("androidx.compose.ui:ui-tooling:${rootProject.extra["compose_version"]}")
    debugImplementation("androidx.compose.ui:ui-test-manifest:${rootProject.extra["compose_version"]}")
    kapt(Lib.HiltDagger.compiler)

    implementation(Lib.Room.runtime)
    kapt(Lib.Room.compiler)

    implementation(Lib.Gson.converterGson)

    implementation("androidx.hilt:hilt-navigation-compose:1.0.0-alpha03")

    implementation("androidx.navigation:navigation-compose:2.4.0-alpha09")

}
