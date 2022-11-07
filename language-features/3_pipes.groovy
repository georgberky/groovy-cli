#!/usr/bin/env groovy

//TODO:
// - show traditional Java: System.in.readLines()
// - show Groovy's System.in.eachLine
// - show Groovy's System.in.filterLine
System.in.filterLine { it.contains(args[0]) }
    .each { println it }
