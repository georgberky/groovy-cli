import org.junit.jupiter.api.*

class PipeConsumerTest {

    @Test
    void "consumer increments text from stdin"() {
        def process = "./pipe_consumer.groovy".execute()
        def stdin = new PrintStream(process.getOutputStream(), true)
        def stdout = process.getInputStream()

        stdin.println("1")
        stdin.println("2")
        stdin.println("3")
        stdin.close()

        assert stdout.readLines() == ["2", "3", "4"]
    }
}
