/*
    Write a java program which accept file name from user and create that new file
*/

import java.io.*;
import java.util.*;

class CreateFile
{
    public static void main(String arg[])
    {
        File obj = new File("Demo.txt");

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

    }
}