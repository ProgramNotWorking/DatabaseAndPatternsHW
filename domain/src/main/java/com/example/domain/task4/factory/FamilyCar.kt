package com.example.domain.task4.factory

import com.example.domain.task4.model.Car

class FamilyCar : ICar {
    override fun assembleTheCar(): Car {
        return Car(
            "Mitsubishi",
            "Charisma",
            "White"
        )
    }
}