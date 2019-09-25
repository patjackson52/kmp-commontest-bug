package com.joyable.mock

expect class PlatformLogger() {
    fun debug(msg: String)
}

object Logger {
    val platformLogger = PlatformLogger()

    fun debug(msg: String) {
        platformLogger.debug(msg)
    }
}
