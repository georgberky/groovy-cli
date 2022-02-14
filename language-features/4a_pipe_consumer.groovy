#!/usr/bin/env groovy
def namedPipe = "namedPipe" as File
def pipe = namedPipe.newReader()

pipe.eachLine { println it }

