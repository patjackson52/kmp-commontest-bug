package com.joyable.mock

actual class PlatformLogger actual constructor() {
    actual fun debug(msg: String) {
        println(msg)
    }
}
