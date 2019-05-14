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
    idea
    java
}
