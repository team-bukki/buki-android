plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.skptemp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.skptemp"
        minSdk = 26
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    dataBinding {
        enable = true
    }

    viewBinding {
        enable = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // hilt
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-android-compiler:2.48")

    // splashscreen
    implementation("androidx.core:core-splashscreen:1.1.0-alpha02")

    // viewpager2
    implementation("androidx.viewpager2:viewpager2:1.0.0")

    // by viewModels()
    implementation("androidx.activity:activity-ktx:1.8.1")
    implementation("androidx.fragment:fragment-ktx:1.6.2")

    // navigation bar
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.6")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.6")

    // viewpager dots indicator
    implementation("com.tbuonomo:dotsindicator:5.0")

    // cardview
    implementation("androidx.cardview:cardview:1.0.0")
}

kapt {
    generateStubs = true
}