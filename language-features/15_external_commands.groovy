#!/usr/bin/env groovy
//TODO:
// - write command in String
// - call execute on it
// - get its text
// - use readLines
// - findAll that endsWith groovy
// - print each

"ls".execute().text.readLines()
    .findAll { it.contains("groovy") }
    .each { println it }
