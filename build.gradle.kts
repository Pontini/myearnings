buildscript{

    val kotlin_version by extra(Lib.Kotlin.version)
    val compose_version by extra("1.0.1")

    repositories{
        google()
        mavenCentral()
    }
    dependencies{

        classpath("com.android.tools.build:gradle:7.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.42")
    }
}
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
tasks.create<Delete>("clean"){
    delete(rootProject.buildDir)
}
