fun main(){
    val iphone = MobilePhone1("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone1("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone1("Android", "Huawei", "Mate X S")
    println( mateXS.chargeBattery(25))
}

class MobilePhone1(osName: String, brand: String, model: String){

    private var battery = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}