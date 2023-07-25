/*
    Accept folder name from user and create one string which contains name
    of file and its length. 
*/

import java.io.*;
import java.util.*;

class Create_String_NameFile_Length
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the folder name: ");
        String folderName = sobj.nextLine();

        File folder = new File(folderName);

        if( ( folder.exists() ) && (folder.isDirectory()) )
        {
            File[] files = folder.listFiles();

            StringBuilder Result = new StringBuilder();

            if(files != null && files.length >0)
            {
                for(File file: files)
                {
                    if(file.isFile())
                    {
                        Result.append(file.getName()).append(" : ").append(file.length()).append(" bytes\n");
                    }
                }

                System.out.println("Files in the folder with their lengths: ");
                System.out.println(Result.toString());

            }
            else
            {
                System.out.println("The Folder is empty....!!");
            }
        }
        else
        {
            System.out.println("The folder does not exist or is not a directory...");
        }

        sobj.close();
    }
}
