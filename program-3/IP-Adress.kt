import java.util.Arrays

fun main() {
println(validIPAddress("12:12:12:1"))
}

// fun  to  Validate IP Address

fun validIPAddress(IP: String): Boolean {
    val ipv4 = IP.split("\\.".toRegex()).toTypedArray()
    val ipv6 = IP.split(":".toRegex()).toTypedArray()
    if (IP.chars().filter { ch: Int -> ch == '.'.toInt() }.count() == 3L) {
        for (s in ipv4) {
            if (s.length == 0 || s.length > 3) return false
            if (s[0] == '0' && s.length != 1) return false
            for (ch in s.toCharArray()) if (!Character.isDigit(ch)) return false
            if (Integer.parseInt(s) > 255) return false
        }
        return true
    }
    if (IP.chars().filter { ch: Int -> ch == ':'.toInt() }.count() == 7L) {
        for (s in ipv6) {
            if (s.length == 0 || s.length > 4) return false
            for (ch in s.toCharArray()) if (!Character.isDigit(ch) && (ch < 'a' || ch > 'f') && (ch < 'A' || ch > 'F')) return false
        }
        return true
    }
    return false
}
