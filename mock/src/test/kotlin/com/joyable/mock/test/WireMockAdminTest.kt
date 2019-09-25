package com.joyable.mock.test

import com.joyable.mock.WireMockAdminGateway
import kotlin.test.Test

class WireMockAdminTest {
    val SERVER = "http://localhost:5252"

    val mockAdminGateway = WireMockAdminGateway(SERVER)

    @Test
    fun addMapping() {
        val mapping = com.joyable.mock.WireMockMapping(
            request = com.joyable.mock.Request(
                method = "GET",
                url = "/some/thing"
            ),
            response = com.joyable.mock.Response(
                status = 200,
                body = "Hello world"
            )
        )

        /*
        runBlocking {
            val response = mockAdminGateway.postMapping(mapping)

            assertNotNull(response)
        }

         */
    }
}
