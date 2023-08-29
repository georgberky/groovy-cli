//start with "Hello World" in Java
//add items to list of strings
//print each of them
//simplify to groovy

println "Hello WJAX"

def liste = [ "Georg", "Patrick", "Anja", "Magdalena" ]
liste.each { println it }
liste.collect { "Hello ${it}" }
    .each { println it }

def map = [ "Georg": "Groovy", "Patrick" : "Java", "Anja": "JavaScript", "Magdalena": "C++" ]
map.each { k,v -> 
    println "$k, macht $v"
}
