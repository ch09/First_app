

// This programm is for ProblemA TCPC 2021

// const and val
// immutability and concurrency
// immutable variable: it s a variable whose value cannot mutate or change after initialization
// const is for read-only property of a class.
// var and val !!
// val is initialized at the runtime
// For val, the contents can be muted, whereas for const val, the contents cannot be muted
import java.io.File
const val N : Int = 10000; // 1e5 ;
const val MOD : Int = 1000000000;

var t : Int = 0; var n= 0; var k = 0;
fun main(args: Array<String>) {

    // Open the file :: rabbit.in
    // File f = new File("rabbit.in")
    // File("rabbit.in")  // This will create a file under root path
    // Read only file !!

    val lines : List<String> = File("C:\\Users\\walid.chebbi\\IdeaProjects\\First_app\\src\\main\\kotlin\\rabbit.in").readLines()
    lines.forEach {line -> println(line)}
    val bytes : ByteArray = File("C:\\Users\\walid.chebbi\\IdeaProjects\\First_app\\src\\main\\kotlin\\rabbit.in").readBytes()
    bytes.forEach { byte -> println(byte.toInt().toChar()) }




    //Convert data to Int








}

