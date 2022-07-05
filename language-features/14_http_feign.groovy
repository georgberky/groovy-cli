#!/usr/bin/env groovy
@Grab('io.github.openfeign:feign-core:11.9')
@Grab('io.github.openfeign:feign-httpclient:11.9')
@Grab('io.github.openfeign:feign-gson:11.9')
import feign.*
import feign.gson.GsonDecoder
import com.google.gson.*
import static com.google.gson.FieldNamingPolicy.*

interface SWApi {
    @RequestLine("GET /api/people/{id}/")
    Person person(@Param("id") int id)
}

class Person {
    String name
    String hairColor
    String eyeColor
}

def client = Feign.builder()
    .decoder(new GsonDecoder(
        new GsonBuilder()
            .setFieldNamingPolicy(LOWER_CASE_WITH_UNDERSCORES)
            .create()
    ))
    .target(SWApi, "https://swapi.dev")

def person = client.person(1)

println person.name
println person.hairColor
println person.eyeColor
