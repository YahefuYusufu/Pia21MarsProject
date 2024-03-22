package com.example.pia21marsproject.smartHome


open class SmartDevice(val name: String, val category: String ) {

    var deviceStatus = "online"

    class SmartTVDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory)

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun turnOn() {

        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}




fun main() {
    val smartTvDevice = SmartDevice(name = "Smart TV", category = "TV")
    println("The name of Devise: ${smartTvDevice.name}")
    smartTvDevice.turnOff()
    smartTvDevice.turnOn()
}