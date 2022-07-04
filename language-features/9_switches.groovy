#!/usr/bin/env groovy
@Grab('info.picocli:picocli-groovy:4.6.3')
@GrabConfig(systemClassLoader=true)
import groovy.cli.commons.CliBuilder

//show how to add command line options
//add unquote option
def cli = new CliBuilder()
cli.h(longOpt: 'help', 'Show usage information')
cli.u(longOpt: 'unquote', 'Unquote the piped text')
cli.q(longOpt: 'quote', 'Quote the piped text')

def options = cli.parse(args)

if (!args || options.h) {
    cli.usage()
    return
}

if (options.u && options.q) {
    println "Use either quote or unquote"
    cli.usage()
    return
}

System.in.eachLine {line ->
    def startsWithQuote = line.startsWith(">")

    if (options.u && startsWithQuote) {
        println line.substring(1).trim()
    } else if (options.q){
        println ">${startsWithQuote ? "" : " "}${line}"
    }
}
