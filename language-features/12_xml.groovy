#!/usr/bin/env groovy
import java.util.zip.*
import groovy.xml.XmlSlurper

def xmlInput = new ZipFile("standard.xml.zip" as File)
def site = new XmlSlurper().parse(xmlInput.getInputStream(new ZipEntry("standard.xml")))

site.regions.children().each { region ->
    println region.name()

    region.item.collect { [name: "${it.name.text().trim()}", to: "${it.location.text().trim()}"] }
               .each { println "${it.name} -> ${it.to}" }
}

