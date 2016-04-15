/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordcracker.dictionary;

import java.util.ArrayList;

/**
 *
 * @author JorgeGabriel
 */
public class RandomWordGenerator {
    
    private ArrayList<Character> CHARBANK;

    
    public static void nextProbableWord()
    {
        
    }

    public RandomWordGenerator() {
        
        String ALPHABET_LOWERCASE = "abcdefghijklmnopqrstuvxyz";
        String ALPHABET_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String NUMBERS = "0123456789";
        
        for (char c : ALPHABET_LOWERCASE.toCharArray())
        {
            this.CHARBANK.add(c);
        }
        for (char c: ALPHABET_UPPERCASE.toCharArray())
        {
            this.CHARBANK.add(c);
        }
        for (char c: NUMBERS.toCharArray())
        {
            this.CHARBANK.add(c);
        }       
    }
    
}
