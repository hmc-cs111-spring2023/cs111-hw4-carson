import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class CollatzSpec extends AnyFunSuite with Matchers:

// write tests here!
    test ("1") {collatz(1) should be (4)}
    test ("2") {collatz(6) should be (3)}
    test ("3") {collatz(7) should be (22)}
    test ("4") {collatz(2) should be (1)}
    test ("5") {collatz(42) should be (21)}
    test ("6") {collatz(101) should be (304)}
    test ("7") {collatz(100) should be (50)}

end CollatzSpec
