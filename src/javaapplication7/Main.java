/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ntanasis Periklis and Chatzipetros Mike
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {


    System.out.println("Type the folder path and press 'Enter.'");


    String string = "";
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);

        // read in user input

    try
    {

        string = reader.readLine();

    }
    catch(Exception e){}
    //System.out.println("You typed: " + string);

        // wait for user to type 'Enter' so console window won't dissapear

    
        int count;
        File[] files;
        File folder= new File(string);
        String[] fiiles,a,filess,b;
        a=string.split(File.separator);
        try
        {
            files = folder.listFiles();
            fiiles = new String[files.length];
        
            for(int i=0;i<files.length;i++)
            {
                if(!files[i].isHidden())
                {
                    fiiles[i] = files[i].toString();
                    filess=fiiles[i].split(File.separator);

                    for(int j=0;j<filess.length;j++)
                    {
                        count=0;
                        for(int y=0;y<a.length;y++)
                        {
                            if(filess[j].equals(a[y]))
                            {
                                count++;
                                break;
                            }
                        }
                        if(count==0)
                        {
                            if(filess[j].contains("."))
                            {
                                b=filess[j].split("\\.");
                                System.out.println(b[0]);
                            }
                            else System.out.println(filess[j]);
                        }
                    }
                }
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("The folder is empty or doesn't exist");
        }
    }

}
