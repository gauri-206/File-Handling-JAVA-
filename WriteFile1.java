/*
    Write a java program which accept file name from user and write data in that new file
*/

import java.io.*;
import java.util.*;

class WriteFile1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        String fileName = sobj.nextLine();

        try
        {
            FileWriter wobj = new FileWriter(fileName);

            Scanner sobj1 = new Scanner(System.in);
            System.out.println("Enter the data: ");
            while (true) 
            {
                String data = sobj1.nextLine();

                if(data.equalsIgnoreCase("exit"))
                {
                    break;
                }
                wobj.write(data + "\n");
            }

            wobj.close();
            sobj1.close();

            System.out.println("Successfully written in file...!");
        }


        catch(IOException a)
        {
            System.out.println("An error occured..");
            a.printStackTrace();
        }

        sobj.close();

    }
}