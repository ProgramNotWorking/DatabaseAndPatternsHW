package com.example.data.entities.flower_type

sealed class FlowerType {
    data object Rose : FlowerType()
    data object Tulip : FlowerType()
    data object Sunflower : FlowerType()
    data object Daisy : FlowerType()
    data object Lily : FlowerType()
    data object Orchid : FlowerType()
    data object Lavender : FlowerType()
    data object Peony : FlowerType()
    data object Daffodil : FlowerType()
    data object Iris : FlowerType()
}