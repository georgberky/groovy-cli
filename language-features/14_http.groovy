#!/usr/bin/env groovy
@GrabConfig(systemClassLoader=true)
@Grab('org.slf4j:slf4j-simple:1.7.25')
//@Grab('ch.qos.logback:logback-classic:1.2.3')
@Grab('io.github.http-builder-ng:http-builder-ng-apache:1.0.4')
import groovyx.net.http.*
import groovy.json.JsonSlurper

def http = HttpBuilder.configure {
    request.uri = "https://swapi.dev"
    request.accept = "application/json"
    request.headers["User-Agent"] = "HTTPie/1.0.2"
}

def person = http.get {
    request.uri.path = "/api/people/1/"
}

println person.name
println person.hair_color
println person.eye_color
