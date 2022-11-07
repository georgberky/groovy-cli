#!/usr/bin/env groovy

/*
    for picocli:

    @Grab('info.picocli:picocli-groovy:4.6.3')
    @GrabConfig(systemClassLoader=true)
    import groovy.cli.commons.CliBuilder
    def cli = new CliBuilder()
*/

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

System.in.eachLine {line ->
    if(options.q) {
        println "> " + line
    }
    else if (options.u) {
        println line.substring(2)
    }
}
