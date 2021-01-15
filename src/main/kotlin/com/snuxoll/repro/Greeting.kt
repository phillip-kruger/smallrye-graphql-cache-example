package com.snuxoll.repro

import org.eclipse.microprofile.graphql.Type
import java.util.*

@Type
data class Greeting(
    val id: UUID,
    val text: String
)
