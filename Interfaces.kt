package com.ru.Rushikesh
interface Driveable {
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}

// Class Car which extends the interface
open class Car(override val maxSpeed: Double , open val brandName: String) : Driveable {
    // open so it can be overriden by inhereting classes
    open var range: Double = 0.0

    open fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }

    }
    override fun drive():String{
        println("Drove for $range KM")
        return toString()
    }

    // overridden functions are implicitly open:
    override fun brake() {
        println("The car is breaking")
    }
}
    // In case there is no primary Constructor
class ElectricCar(override val maxSpeed: Double,
                  override val brandName: String,
                  batteryLife: Double) : Car(maxSpeed, brandName) {

    // in KM
    override var range:Double = batteryLife/6

     override fun drive():String {
        println("Overriding the drive of my Car")
        return toString()
    }

    fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }
    override fun brake(){
        println("The electirc car is breaking")
    }
}

fun main(args: Array<String>){
    var audiA3 = Car(200.0, "Audi")
    var teslaS = ElectricCar(250.0, "Tesla", 85.0)


    audiA3.drive()
    teslaS.drive()
    teslaS.drive(200.0)
}

