import java.util.Arrays

fun main() {
println(sortArrayLinear(intArrayOf(100,180,260,310,40,535,695)))
}

//  fun to Sort a linear Array
fun sortArrayLinear(array: IntArray): IntArray {
    var i = 0
    while (i < array.size) {
        if (array[i] > 0 && array[i] < array.size && array[i] != array[array[i] - 1]) {
            val otherIndex = array[i] - 1
            val temp = array[i]
            array[i] = array[otherIndex]
            array[otherIndex] = temp
        } else {
            i++
        }
    }
    return array
}
