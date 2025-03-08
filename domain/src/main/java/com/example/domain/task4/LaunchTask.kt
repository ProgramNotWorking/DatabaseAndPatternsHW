package com.example.domain.task4

import com.example.domain.task4.builder.CarBuilder
import com.example.domain.task4.factory.CarFactory
import com.example.domain.task4.factory.FamilyCarFactory
import com.example.domain.task4.factory.SportCarFactory

fun main() {
    // Создание с помощью паттерна Builder
    val car = CarBuilder()
        .setBrand("Tesla")
        .setModel("Model S")
        .setColor("White")
        .build()

    println(car)

    // Создание с помощью Fabric
    val sportCarFactory: CarFactory = SportCarFactory()
    val sportCar = sportCarFactory.createCar()

    val familyCarFactory: CarFactory = FamilyCarFactory()
    val familyCar = familyCarFactory.createCar()

    println("Sport car: ${sportCar.assembleTheCar()}")
    println("Family car: ${familyCar.assembleTheCar()}")
}

