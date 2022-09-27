
apply {
    from("$rootDir/android-base.gradle")
    from("$rootDir/hilt.gradle")
}

plugins {
    id("de.mannodermaus.android-junit5")
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.pokedexConstants))
    "implementation"(project(Modules.pokedexDataSource))
    "implementation"(project(Modules.pokedexDomain))
    "implementation"(project(Modules.pokedexViewState))

    "testImplementation"(project(Modules.coreDatastoreTest))
    "testImplementation"(project(Modules.pokedexDataSourceTest))
    "testImplementation"(AndroidTestDependencies.test_arch_core)
    "testImplementation"(AndroidTestDependencies.coroutines_test)

    "testImplementation"(TestDependencies.jupiter_engine)
    "testImplementation"(TestDependencies.jupiter_api)
    "testImplementation"(TestDependencies.jupiter_params)
    "testImplementation"(TestDependencies.junit4)

    "implementation"(Kotlin.coroutines_core)
    "implementation"(Kotlin.coroutines_android)
    "implementation"(Square.mock_web_server)
}