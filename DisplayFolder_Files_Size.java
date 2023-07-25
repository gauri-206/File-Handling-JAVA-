/*
    Accept folder name from user and display all the names of files
    from that folder along with sizes. 
*/

import java.io.*;
import java.util.*;

class DisplayFolder_Files_Size
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

            if(files != null && files.length >0)
            {
                System.out.println("Files in the folder are: ");

                for(File file: files)
                {
                    if(file.isFile())
                    {
                        System.out.println(file.getName() + " : " + file.length() + " bytes");
                    }
                }
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
