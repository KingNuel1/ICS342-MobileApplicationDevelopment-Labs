package com.ics342.labs

import com.squareup.moshi.Json

// Add the data classes here.
data class Data(
    @Json(name = "id")val id: Int,
    @Json(name = "give_name")val giveName: String,
    @Json(name = "family_name")val familyName: String,
    @Json(name = "age")val age: Int
)