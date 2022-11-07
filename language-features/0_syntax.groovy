//start with "Hello World" in Java
//add items to list of strings
//print each of them
//simplify to groovy
class Person {

    String name

    Person(String name) {
        this.name = name
    }
}

def l = [ "Lars", "Richard", "Alex", "Martina", "Ralf", "Ahmet", "Antonio"]

l.collect { new Person(it) }
    .each { println it.name }

def m = [name: "Georg", occupation: "Java Dev"]
//def m2 = Map.of("name", "Georg", "occupation", "Java Dev")
println m.name
println m["occupation"]
