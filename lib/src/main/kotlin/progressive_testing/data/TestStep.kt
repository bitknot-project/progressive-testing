package progressive_testing.data

data class TestStep(
    val name: String,
    val request: Request,
    val expectedResponse: ExpectedResponse?
)
