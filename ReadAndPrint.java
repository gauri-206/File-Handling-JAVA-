/*
    Write a java program which accept file name from user and read the data from 
    that file and print it on screen
*/

import java.io.*;
import java.util.*;

class ReadAndPrint
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        String fileName = sobj.nextLine();

        try
        {
           FileReader robj = new FileReader(fileName);

           BufferedReader BRobj = new BufferedReader(robj);
           String line;

           System.out.println("Content of the file are: ");

           while ((line = BRobj.readLine()) != null)
           {
               System.out.println(line);
           }

           robj.close();
           BRobj.close();
           
        }
        catch(IOException a)
        {
            System.out.println("An error occured..");

        }

        sobj.close();
    }
}