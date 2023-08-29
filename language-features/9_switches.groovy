#!/usr/bin/env groovy

// show how to add command line options
// add quote option
// add unquote option

import groovy.cli.internal.CliBuilderInternal

def cli = new CliBuilderInternal()

cli.h(longOpt: 'help', 'Show usage information')
cli.q(longOpt: 'quote', 'Quote some text')
cli.u(longOpt: 'unquote', 'Unquote some text')

def options = cli.parse(args)

if (!args || options.h) {
    cli.usage()
    return
}

if(options.q) {
    System.in.readLines()
        .each { println "> ${it}"}
}

if(options.u) {
    System.in.readLines()
        .each { println it.substring(2) }
}
