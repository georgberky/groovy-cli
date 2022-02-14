#!/usr/bin/env groovy
def deserializer = new Deserializer(new Incrementer())

System.in.eachLine {
   println deserializer.deserialize(it) 
}
