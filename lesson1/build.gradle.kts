buildscript {
    extra["kotlin_version"] = "1.3.31"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", "${extra["kotlin_version"]}"))
    }
}

plugins {
    kotlin("jvm")
    idea
    java
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${extra["kotlin_version"]}")
    compile("org.jetbrains.kotlin:kotlin-stdlib:${extra["kotlin_version"]}")
    compile("de.dfki.mary:voice-cmu-slt-hsmm:5.2")
}
