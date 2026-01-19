plugins {
    id("org.jetbrains.intellij.platform") version "2.2.1"
}

group = "com.github.saral"
version = "1.0.0"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        webstorm("2024.3")
        instrumentationTools()
    }
}

intellijPlatform {
    pluginConfiguration {
        name = "Botanical Theme"
        ideaVersion {
            sinceBuild = "243"
            untilBuild = provider { null }
        }
    }
}
