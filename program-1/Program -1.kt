
import java.util.Arrays

fun main() {
    print(sortString1("Hello world"))
}
fun sortString1(str: String): String {
    val charArray = str.toCharArray()
    Arrays.sort(charArray)
    val sb = StringBuilder()
    var i = 0
    while (i < charArray.size) {
        var count = 1
        while (i + 1 < charArray.size && charArray[i] == charArray[i + 1]) {
            count++
            i++
        }
        sb.append(charArray[i])
        sb.append(count)
        i++
    }
    return sb.toString()
}