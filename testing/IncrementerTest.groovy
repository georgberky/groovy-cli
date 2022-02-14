import org.junit.jupiter.api.*

class IncrementerTest {

    private def sut

    @BeforeEach
    void "setup"() {
        sut = new Incrementer()
    }

    @Test
    void "increment 1"() {
        assert sut.increment(1) == 2 
    }

    @Test
    void "increment 2"() {
        assert sut.increment(2) == 3 
    }

    @Test
    void "increment 3"() {
        assert sut.increment(3) == 4
    }
}

