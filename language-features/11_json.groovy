#!/usr/bin/env groovy
import groovy.json.JsonSlurper

// show planet.json
// read file into JsonSlurper
// print planet name
// print panet.terrain
// print all planet residents

def planet = new JsonSlurper().parse("planet.json" as File)
println planet.name

planet.residents.each {
    println it
}
