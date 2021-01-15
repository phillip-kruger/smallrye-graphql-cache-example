package com.snuxoll.repro

import org.eclipse.microprofile.graphql.GraphQLApi
import org.eclipse.microprofile.graphql.Query
import org.eclipse.microprofile.graphql.Source
import java.util.*
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@GraphQLApi
class GreetingResource {

    @Query
    fun greetings(): List<Greeting> =
        greetings

    fun getText(@Source greetings: List<Greeting>): List<String> {
        val x = greetings.map { it.text }
        return x
    }

    companion object {
        val greetings = listOf(
            Greeting(UUID.randomUUID(), "Hello"),
            Greeting(UUID.randomUUID(), "Hola"),
            Greeting(UUID.randomUUID(), "こんにちは")
        )
    }
}