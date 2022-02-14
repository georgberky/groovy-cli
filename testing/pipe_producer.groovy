#!/usr/bin/env groovy
import java.util.stream.*

def numbers = Stream.iterate(0G) { i ->
    i.add(1G)
}

numbers.each {
    println it
    sleep 1000
}
