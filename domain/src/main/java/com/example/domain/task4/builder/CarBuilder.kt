package com.example.domain.task4.builder

import com.example.domain.task4.model.Car

class CarBuilder {

    private var brand: String = ""
    private var model: String = ""
    private var color: String = ""

    fun setBrand(brand: String): CarBuilder {
        this.brand = brand
        return this
    }

    fun setModel(model: String): CarBuilder {
        this.model = model
        return this
    }

    fun setColor(color: String): CarBuilder {
        this.color = color
        return this
    }

    fun build(): Car {
        return Car(brand, model, color)
    }

}