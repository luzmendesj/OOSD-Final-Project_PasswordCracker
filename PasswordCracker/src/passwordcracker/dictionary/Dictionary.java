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
public class Dictionary {
    
    
    private final ArrayList<String> commonWords;

    public Dictionary() {
        this.commonWords = new ArrayList<>;
    }
    /**
     * Function to fill the Dictionary with the target words.
     * @param wordBank Fills the bank with the desired words.
     */
     
    public static void fillDictionary(ArrayList<String> wordBank)
    {
        this.commonWords = wordBank;
    }
    
}
