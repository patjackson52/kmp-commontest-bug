package com.joyable.mock

import java.util.logging.Level
import java.util.logging.Logger

actual class PlatformLogger actual constructor() {
    actual fun debug(msg: String) {
        Logger.getAnonymousLogger().log(Level.INFO, msg)
    }
}
