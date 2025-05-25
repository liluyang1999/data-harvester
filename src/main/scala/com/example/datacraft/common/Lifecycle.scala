package com.example.datacraft.common

object Lifecycle extends Enumeration {

    type Lifecycle = Value

    val devl, prod: Lifecycle = Value

    def fromName(value: String): Lifecycle = Lifecycle.withName(value)

    def getFullName(value: Lifecycle): String = {
        value match {
            case Lifecycle.devl => "development"
            case Lifecycle.prod => "production"
        }
    }

}
