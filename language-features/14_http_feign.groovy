#!/usr/bin/env groovy
@Grab('io.github.openfeign:feign-core:11.9')
@Grab('io.github.openfeign:feign-httpclient:11.9')
@Grab('io.github.openfeign:feign-gson:11.9')
import feign.*
import feign.gson.GsonDecoder

interface SWApi {
    @RequestLine("GET /api/people/{id}/")
    Person person(@Param("id") int id)
}

class Person {
    String name
    String hair_color
    String eye_color
}

def client = Feign.builder()
    .decoder(new GsonDecoder())
    .target(SWApi, "https://swapi.dev")

def person = client.person(1)

println person.name
println person.hair_color
println person.eye_color
