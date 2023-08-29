import org.junit.jupiter.api.Test

// add a class
// add a test method with @Test
// show Strings as method names
// show power assert

class MyJunit5Test {
    @Test
    void "a method name can be a string in Groovy"() {
        assert 1 + 1 == 3
    }
}
