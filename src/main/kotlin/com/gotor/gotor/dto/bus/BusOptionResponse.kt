package com.gotor.gotor.dto.bus

data class BusOptionResponse(
    val departTime: String,
    val arrivalTime: String,
    val price: String,
    val from: String,
    val to: String,
)