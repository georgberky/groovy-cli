#!/usr/bin/env groovy
//TODO 
// - filter lines of lorem.txt
// - use ==~ (whole line)
// - use =~ (contained)

assert "foobar" =~ /oo/ 
assert "foo123\\ " ==~ /^\w+\d+\\\s/

