#!/usr/bin/env groovy
//show simple string matching using ==~
//readLines lorem.txt
//grep
//print

assert "foobar" =~ /oo/ 
assert "foo123\\ " =~ /\d+\\\s/

