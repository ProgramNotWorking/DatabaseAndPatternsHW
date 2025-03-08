package com.example.domain.task4.factory

import com.example.domain.task4.model.Car

class SportCar : ICar {
    override fun assembleTheCar(): Car {
        return Car(
            "Porsche",
            "911",
            "Green"
        )
    }
}