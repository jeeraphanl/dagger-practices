package com.naversaybugs.sampledagger.models.entities

class House(private val id: String,
            private val name: String,
            private val thumb: String) {
    
    override fun toString(): String {
        return "$id House $name thumb $thumb."
    }
}