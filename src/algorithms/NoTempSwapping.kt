package algorithms

import java.util.*

/**
 * Created By Naseef M Abdus Sattar on 11/22/2017 at 12:55 PM
 */
class NoTempSwapping
{
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>)
        {
            var x: Int
            var y: Int

            val d = Scanner(System.`in`)

            println("Enter your value of x: ")
            x = d.nextInt()

            println("Enter your value of y: ")
            y = d.nextInt()

            println("Before swapping; x = " + x + " y = " + y)

            x = x + y
            y = x - y
            x = x - y

            println("After swapping; x = " + x + " y = " + y)
        }
    }

}
