#!/usr/bin/env groovy
"ls -1".execute().text.readLines()
    .findAll { it.endsWith("groovy") }
    .each { println it }
