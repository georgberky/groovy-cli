#!/usr/bin/env groovy
import java.util.zip.*
import groovy.xml.XmlSlurper

def xmlInput = new ZipFile("standard.xml.zip" as File)
def site = new XmlSlurper().parse(
    xmlInput.getInputStream(new ZipEntry("standard.xml"))
)

site.regions.children().each {
    println it.name()
}

// show the contents of the zip file
// show the problem with regions 
// show how to read the file into the slurper
// show how to access XML objects
// print all region names
