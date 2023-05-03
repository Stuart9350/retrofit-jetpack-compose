# retrofit-jetpack-compose

# About
A repository for demonstrating the process of fetching of data from an API serve to an Android Project

# latest-updates

1. change plugin

```
plugins {
// version '1.8.0' to version '1.7.20'
id 'org.jetbrains.kotlin.android' version '1.7.20' apply false
}
```

1. used dependencies in build.gradle(Module : app)

```
dependencies{

    implementation "com.squareup.retrofit2:retrofit:2.9.0"
//    implementation "com.squareup.okhttp3:okhttp3:5.0.0-alpha.2"
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

    implementation "io.coil-kt:coil-compose:1.3.2"

    implementation 'androidx.core:core:1.12.0-alpha03'

    constraints {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.8.0") {
            because("kotlin-stdlib-jdk7 is now a part of kotlin-stdlib")
        }
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.0") {
            because("kotlin-stdlib-jdk8 is now a part of kotlin-stdlib")
        }
    }

}
```

1. add this part of code in gradle.properties

```
android.nonTransitiveRClass=true
android.suppressUnsupportedCompileSdk=UpsideDownCake
android.enableJetifier=true
```

API LINK USED = "https://jsonplaceholder.typicode.com/posts"
