package algorithms

import java.util.Scanner

/**
 * Created by USER on 8/20/2017.
 *
 * Print a sentence in Reverse.
 */
class SentenceInReverse
{
    fun reverseSentence(sentence: String)
    {
        //String st = sentence.trim();
        //System.out.println(st);
        val array = sentence.split("\\s".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (j in array.indices.reversed())
        {
            println(array[j])
        }

    }

    companion object
    {

        @JvmStatic
        fun main(args: Array<String>)
        {
            val s = Scanner(System.`in`)
            val d: String
            println("Enter Sentence ")
            d = s.nextLine()
            val sr = SentenceInReverse()
            sr.reverseSentence(d)
        }
    }
}
