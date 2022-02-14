import org.junit.jupiter.api.*

class DeserializerTest {

    private def receivedDeserialized

    private def incrementerMock
    private def sut

    @BeforeEach
    void "setup"() {
        incrementerMock = [increment: { int number -> 
            receivedDeserialized = number }] as Incrementer

        sut = new Deserializer(incrementerMock)
    }

    @Test
    void "deserialize 1 on one line"() {
        def line = "1\n"

        sut.deserialize(line)

        assert receivedDeserialized == 1
    }

    @Test
    void "deserialize 2 on one line"() {
        def line = "2\n"

        sut.deserialize(line)

        assert receivedDeserialized == 2
    }

    @Test
    void "deserialize 3 on one line"() {
        def line = "3\n"

        sut.deserialize(line)

        assert receivedDeserialized == 3
    }

    @Test
    void "deserialize 1 on one line without newline"() {
        def line = "1"

        sut.deserialize(line)

        assert receivedDeserialized == 1
    }

    @Test
    void "deserialize non-numbers does not call increment"() {
        def garbage = "lkajdfoiaer"

        sut.deserialize(garbage)

        assert !receivedDeserialized
    }

    @Test
    void "deserialize NULL does not call increment"() {
        sut.deserialize(null)

        assert !receivedDeserialized
    }
}
