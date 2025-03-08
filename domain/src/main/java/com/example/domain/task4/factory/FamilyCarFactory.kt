package com.example.domain.task4.factory

class FamilyCarFactory : CarFactory {
    override fun createCar(): ICar {
        return FamilyCar()
    }
}