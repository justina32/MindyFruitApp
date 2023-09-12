package com.example.mindyfruitapplication2.contract

data class Fruit(
    val name: String,
    val id: Int,
    val family: String,
    val order: String,
    val genus: String,
    val nutrition: Nutrition
)
data class Nutrition(
    val calories: Int,
    val fat: Float,
    val sugar: Float,
    val carbohydrates: Float,
    val protein: Float
)
