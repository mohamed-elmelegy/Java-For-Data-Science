/*
package lambdabetterstring;

import java.util.function.BiPredicate;

/**
 *
 * @author moham
 */
public class LambdaBetterString {

    public static void main(String[] args) {
        LambdaBetterString.BetterStringCaller bsc = new LambdaBetterString().new BetterStringCaller();
        String res = bsc.betterString("Mohamed", "mohamed", (s1, s2) -> s1.length() > s2.length());
        System.out.println("Mohamed" + " & " + "mohamed" + " `equlas` comparision result is " + res);
        
        
        /*______________________________________________*/
        
        String str = "Melegy";
        LambdaBetterString k = new LambdaBetterString();
        System.out.println(k.onlyAlpha("Melegy"));
        
    }
    
    public Boolean onlyAlpha(String str) {
        return ((str != null)
                && (!str.isBlank())
                && (str.chars().allMatch(Character::isLetter)));
    }
    
    
    public class BetterStringCaller {

        /**
         *
         * @param s1
         * @param s2
         * @param checker
         * @return
         */
        public String betterString(String s1, String s2, BiPredicate<String, String> checker) {
            String res;
            if(checker.test(s1, s2))
                res = s1;
            else
                res = s2;
            
            return res;
        }
    }
    
}
