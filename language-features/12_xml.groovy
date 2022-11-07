#!/usr/bin/env groovy
import java.util.zip.*
import groovy.xml.XmlSlurper

def xmlInput = new ZipFile("standard.xml.zip" as File)
def site = new XmlSlurper().parse(
    xmlInput.getInputStream(new ZipEntry("standard.xml"))
)
//def site = new XmlSlurper().parse("standard.xml" as File)

site.regions.children().collect { [name: it.name(), site: it] }
    .collect { [name: it.name, items: it.site.item.@id ]}
    .each { println "${it.name}: ${it.items.size()}" }

