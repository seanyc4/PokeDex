object AndroidTestDependencies{

    const val androidx_test_ext = "androidx.test.ext:junit-ktx:${Versions.androidx_test_ext}"
    const val coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Kotlin.coroutines_core_version}"
    const val espresso_contrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso_core}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
    const val espresso_intents = "androidx.test.espresso:espresso-intents:${Versions.espresso_core}"
    const val idling_resource = "androidx.test.espresso:espresso-idling-resource:${Versions.espresso_idling_resource}"
    const val instrumentation_runner = "com.seancoyle.pokedex.framework.HiltTestRunner"
    const val kotlin_test = "org.jetbrains.kotlin:kotlin-test-junit:${Kotlin.kotlin_version}"
    const val mockk_android = "io.mockk:mockk-android:${Versions.mockk_version}"
    const val mockk = "io.mockk:mockk:${Versions.mockk_version}"
    const val test_rules = "androidx.test:rules:${Versions.test_runner}"
    const val test_runner = "androidx.test:runner:${Versions.test_runner}"
    const val test_core_ktx = "androidx.test:core-ktx:${Versions.test_core}"
    const val test_arch_core = "androidx.arch.core:core-testing:${Versions.test_arch_core}"
    const val test_orchestrator ="androidx.test:orchestrator:${Versions.test_orchestrator}"
}