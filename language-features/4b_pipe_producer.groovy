#!/usr/bin/env groovy
import java.util.stream.IntStream

def namedPipe = "namedPipe" as File
def autoFlush = true
def pipe = new PrintWriter(new FileWriter(namedPipe), autoFlush)

IntStream.range(0, Integer.MAX_VALUE).each { i-> 
    pipe.println("${i}")
    sleep 1000
}

