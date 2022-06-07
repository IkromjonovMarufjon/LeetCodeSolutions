package uz.xsoft.january

import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader


fun main() {
    val path = "D:\\test\\"
    compliler("$path*.java")
    run(path + "Test")
}

private val clas = """
    public class Test {
        public static void main(String[] args) {
            Sample sample = new Sample();
            check(sample.max(2,30),30);
            check(sample.max(56,30),56);
            check(sample.max(2,3),2);
        }

        static void check(Object ob1, Object ob2) {
            if (!ob1.equals(ob2)) {
                throw new IllegalArgumentException("Extected: " + ob1 + " Result: " + ob2);
            }
        }
    }
""".trimIndent()

private fun compliler(path: String) {
    val process = Runtime.getRuntime().exec("javac $path")
    val r = BufferedReader(InputStreamReader(process.errorStream))
    var line: String?
    while (true) {
        line = r.readLine()
        if (line == null) {
            break
        }
        println(line)
    }
}

private fun run(path: String) {
    val process = ProcessBuilder("java", "Test")
        .directory(File("D:\\test"))
        .start()
//    val process = Runtime.getRuntime().exec("java -cp . $path")
    val r = BufferedReader(InputStreamReader(process.errorStream))
    var line: String?
    while (true) {
        line = r.readLine()
        if (line == null) {
            break
        }
        println(line)
    }
}