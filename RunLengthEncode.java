package runlengthencode;

/**
 *
 * @author lucasmalave
 */

import java.util.Scanner;

public class RunLengthEncode 
{
    
    public static String encoder(String str)
    {
        StringBuilder test = new StringBuilder();
        
        int count = 1;
        
        char prev = str.charAt(0);
        
        for(int i = 1; i < str.length(); i++)
        {
            char curr = str.charAt(i);
            
            if(curr == prev)
                count++;
            else
            {
                if(count > 4)
                {
                    test.append("/");
                    test.append(String.format("%02d", count));
                    test.append(prev);
                } 
                else
                {
                    for(int j = 0; j < count; j++)
                        test.append(prev);
               }
                
                count = 1;
            }
            
            prev = curr;
        
        }
        
        if(count > 4)
        {
            test.append("/");
            test.append(String.format("%02d", count));
            test.append(prev);
        }
        else
        {
            for(int j = 0; j < count; j++)
                test.append(prev);
        }
        
        return test.toString();
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a string: ");
        
        String word = input.nextLine();
        
        if(word == null || word.length() == 0)
            System.out.println("The string is empty.");
        
        System.out.println(encoder(word));
    }
}