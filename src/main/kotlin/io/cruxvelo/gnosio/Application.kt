package io.cruxvelo.gnosio

import io.cruxvelo.gnosio.plugins.configureRouting
import io.cruxvelo.gnosio.plugins.configureSecurity
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSecurity()
    configureRouting()
}
