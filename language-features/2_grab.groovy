#!/usr/bin/env groovy

//TODO: 
// - use @Grab annotation on import
// - use StringUtils joinWith(" ", a, b)

@Grab(
    group='org.apache.commons',
    module='commons-lang3',
    version='3.12.0'
)
//@Grab('org.apache.commons:commons-lang3:3.12.0')
import org.apache.commons.lang3.*

println StringUtils.joinWith("*", "Hello", "World", "foo", "bar")
