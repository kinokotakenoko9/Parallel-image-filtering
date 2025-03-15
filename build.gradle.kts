plugins {
    kotlin("jvm") version "2.1.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    // https://github.com/bytedeco/javacv
    implementation("org.bytedeco:javacv-platform:1.5.11")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}