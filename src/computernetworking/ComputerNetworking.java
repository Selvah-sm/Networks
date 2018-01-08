/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computernetworking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Selvah
 */
public class ComputerNetworking {

    /**
     * @param args
     */

public static void main(String[]args)
{
    try
        {
            Scanner scan=new Scanner(System.in);
            String o=scan.next();
            scan.close();
            Process p=Runtime.getRuntime().exec("tracert "+o);
            BufferedReader input=new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s="";
            while((s=input.readLine())!=null)
            {
                System.out.println(s);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            }
        }
}

    

