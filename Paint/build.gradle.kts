plugins {
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application{
    mainClass="aplicacion.ProgramaPaint"
}
javafx{
    modules("javafx.controls","javafx.fxml")
    version="20"
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("junit:junit:4.13.1")
}

tasks.test {
    useJUnit()
}