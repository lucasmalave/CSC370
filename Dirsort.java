package dirsort;

/**
 *
 * @author lucasmalave
 */

import java.util.Arrays;

public class Dirsort 
{
    public static void main(String[] args) 
    {
        String[] arr = {"/", "/usr/", "/usr/local/", "/usr/local/bin/", "/games/", "/games/snake/", "/homework/", "/temp/downloads/"};
        
        sortDirs(arr);
        
        System.out.print("{");
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print ("\"" + arr[i] + "\"" + ", ");
        }
        
        System.out.print("}");
    }
    
    {
        String[]  arr = {"/usr/", "/usr/local/", "/bin/", "/usr/local/bin/", "/usr/bin/", "/bin/local/", "/bin/local/"};
        
        sortDirs(arr);
        
        System.out.print("{");
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print ("\"" + arr[i] + "\"" + ", ");
        }
        
        System.out.print("}");
    }
    
    {
        String[]  arr = {"/", "/a/", "/b/", "/c/", "/d/", "/e/", "/f/", "/g/"};
        
        sortDirs(arr);
        
        System.out.print("{");
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print ("\"" + arr[i] + "\"" + ", ");
        }
        
        System.out.print("}");
    }
    
    {
        String[]  arr = {"/", "/a/", "/b/", "/c/", "/d/", "/e/", "/f/", "/g/", "/a/a/", "/b/g/c/", "/g/f/"};
        
        sortDirs(arr);
        
        System.out.print("{");
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print ("\"" + arr[i] + "\"" + ", ");
        }
        
        System.out.print("}");
    }
    
    {
        String[]  arr = {"/a/b/c/d/e/f/g/h/i/j/k/l/m/n/", "/o/p/q/r/s/t/u/v/w/x/y/z/"};
        
        sortDirs(arr);
        
        System.out.print("{");
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print ("\"" + arr[i] + "\"" + ", ");
        }
        
        System.out.print("}");
    }
    
    {
        String[]  arr = {"/a/b/","/ab/cd/","/c/d/","/a/b/c/","/ab/c/d/","/a/bc/d/", "/a/b/cd/"};
        
        sortDirs(arr);
        
        System.out.print("{");
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print ("\"" + arr[i] + "\"" + ", ");
        }
        
        System.out.print("}");
    }
    
    public static void sortDirs(String[] dirs) 
    {
        for (int i = 0; i < dirs.length; i++) 
        {
            int count = -1, x = 0;
            
            while (x >= 0) 
            {
                count++;
                x = dirs[i].indexOf ("/", x);
                
                if (x != -1) 
                    x++;
            }
            
            dirs[i] = Character.toString((char) count) + dirs[i];
        }
        
        Arrays.sort(dirs);
        
        for (int i = 0; i < dirs.length; i++) 
            dirs [i] = dirs[i].substring(1);
    }
}