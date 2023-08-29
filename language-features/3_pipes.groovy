#!/usr/bin/env groovy

// write something like grep
// start with the traditional Java foreach
// transform to something Groovier

System.in.filterLine { it.contains("groovy") }
    .each { println it }
