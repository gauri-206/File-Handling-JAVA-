/*
    Write a java program which accept file name from user and write data in that new file
*/

import java.io.*;
import java.util.*;

class WriteFile
{
    public static void main(String arg[])
    {
        try
        {
            FileWriter obj = new FileWriter("Demo.txt");

            obj.write("India is my country ");
            obj.close();

            System.out.println("Successfully written in file...!");
        }
        catch(IOException a)
        {
            System.out.println("An error occured..");
            a.printStackTrace();
        }

    }
}