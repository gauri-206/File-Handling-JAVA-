/*
    Write a java program which accept file name from user and create that new file
*/

import java.io.*;
import java.util.*;

class CreateFile1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        String fileName = sobj.nextLine();
        
        File obj = new File(fileName);

        try
        {
            if(obj.createNewFile())
            {
                System.out.println("File Created...!");
            }
            else
            {
                System.out.println("The file is already created...");
            }
        }
        catch(IOException a)
        {
            System.out.println("An error occured..");
            a.printStackTrace();
        }
        
        sobj.close();
    }
}