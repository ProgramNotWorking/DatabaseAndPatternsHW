package com.example.domain.task4.factory

class SportCarFactory : CarFactory {
    override fun createCar(): ICar {
        return SportCar()
    }
}