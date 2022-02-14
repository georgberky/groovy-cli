#!/usr/bin/env groovy

//traditional, Java-like solution
/*
for(String line : System.in.readLines()) {
    if(line.contains("groovy")) {
        println line
    }
}
*/

//produces a Writable (with an additonal line), so we can print it directly
//println System.in.filterLine { it.contains("groovy") }

//this is the closest equivalent to grep
System.in.eachLine { line->
    if(line.contains("groovy")) {
        println line
    }
}
