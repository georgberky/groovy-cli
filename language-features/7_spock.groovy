#!/usr/bin/env groovy
@Grab('org.spockframework:spock-core:1.1-groovy-2.4')
import spock.lang.*
//create test Specification
//show given when then
//show tables for data driven testing
//show @Unroll with #parameters
class MySpecification extends Specification {

    @Unroll
    def "my test addition #a + #b = #expectedResult"() {

        when:
        def result = a + b

        then:
        result == expectedResult

        where:
        a | b | expectedResult
        1 | 1 | 2
        2 | 2 | 4
    }
}
