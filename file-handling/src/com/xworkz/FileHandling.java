// creating a file using File class
package com.xworkz;

import java.io.File;
import java.io.IOException;

public class FileHandling
{
    public static void main(String[] args) {


        try {
            File file = new File("C:\\file handling\\resume1.pdf");
//            boolean file=new File("C:\\file handling\\resume1.pdf");

            if(file.createNewFile())
            {
                System.out.println("file created -" + file.getName());;
            }else {
                System.out.println("file already exists");
            }


        }catch (IOException e){
            System.out.println("io exception");
        }

        }

}
