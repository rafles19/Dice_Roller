package id.ac.umn.diceroller

class dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }

}