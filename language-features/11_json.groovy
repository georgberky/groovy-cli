#!/usr/bin/env groovy
import groovy.json.JsonSlurper

def input = new FileReader("planet.json" as File)
def planet = new JsonSlurper().parse(input)

println planet.name
println planet.terrain
planet.residents.each { println it }
