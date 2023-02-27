package homework2;

/**
 *
 * @author lucasmalave
 */

import java.util.Scanner;

public class Homework2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the size: ");

        int size = input.nextInt();

        int[] nums = new int[size];

        System.out.print("Please enter the " + size + " elements for the users: ");

        for(int i = 0; i < size; i++)
        {
            nums[i] = input.nextInt();
        }

        System.out.print("Enter the minpermission value: ");

        // read minPermission value from users
        int minPermission = input.nextInt();

        // declare empty string
        String test = "";

        // finding the access level
        for(int i = 0; i < size; i++)
        {
            if(nums[i] >= minPermission)
                test += 'A';
            else
                test += 'D';
        }

        System.out.println("Returns: " + test);
    }
}