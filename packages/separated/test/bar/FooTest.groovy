package bar

import org.junit.jupiter.api.*

class FooTest {
    @Test
    void "nothing"() {
        def foo = new Foo()        

        def something = foo.doSomething()

        assert something == 42
    }
}
