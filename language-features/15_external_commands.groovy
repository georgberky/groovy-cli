#!/usr/bin/env groovy

// write command as a string
// execute
// text
// read lines
// find all that end with groovy
// print each

"ls -1".execute().in.eachLine { //stream
    if(it.contains("groovy")) {
        println it
    }
}
