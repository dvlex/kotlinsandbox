plugins {
    kotlin("jvm") version "1.8.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    // Add here your libraries, i.e, Koin
    // implementation("org.jetbrains.kotlin:kotlin-delegates:1.8.10")
}

application {
    mainClass.set("MainKt") // Principal class
}

tasks.wrapper {
    gradleVersion = "7.6"
}
