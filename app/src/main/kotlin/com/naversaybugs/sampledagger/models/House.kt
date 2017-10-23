package com.naversaybugs.sampledagger.models

class House(private val name: String, private val isAlive: Boolean) {
    
    override fun toString(): String {
        return "House $name alive $isAlive."
    }
}