#!/usr/bin/env groovy
@Grab('org.slf4j:slf4j-api:1.7.25')
//@Grab('org.slf4j:slf4j-simple:1.7.25')
@Grab('ch.qos.logback:logback-classic:1.2.3')
import groovy.util.logging.Slf4j

@Slf4j
class SomethingLogging {
    def log() {
        log.info("Hi!")
    }
}

def something = new SomethingLogging()
something.log()
