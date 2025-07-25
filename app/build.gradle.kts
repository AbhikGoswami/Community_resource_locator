plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.abhik.community_resource_locator"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.abhik.community_resource_locator"
        minSdk = 24
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("androidx.activity:activity:1.8.0")
    implementation("com.google.android.gms:play-services-maps:19.1.0")
    implementation("com.google.firebase:firebase-storage:21.0.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    implementation(platform("com.google.firebase:firebase-bom:33.12.0"))

    implementation ("com.google.firebase:firebase-database:21.0.0")
    implementation ("com.google.firebase:firebase-auth:23.1.0")

    implementation("com.google.firebase:firebase-storage")

    //OlaMap SDK
    implementation(files("libs/OlaMapSdk-1.0.0.aar"))

    //Maplibre
    implementation ("org.maplibre.gl:android-sdk:10.0.2")
    implementation ("org.maplibre.gl:android-plugin-annotation-v9:1.0.0")
    implementation ("org.maplibre.gl:android-plugin-markerview-v9:1.0.0")

    implementation(files("libs/Places-sdk-2.3.9.jar"))

    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation("com.squareup.retrofit2:retrofit:2.11.0")

    implementation ("com.airbnb.android:lottie:6.1.0")


//    implementation ("com.github.adityathakker:typingview:1.1")



}