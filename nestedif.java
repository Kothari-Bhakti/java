/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhakti;

/**
 *
 * @author b24-066
 */
public class nestedif {
    public static void main(String[] args)
    {
        // nested if statement 
        int a=18; // initialization a = 18
        double w =65.5; //initialization w= 65.5
        if(a >=18)// 18>=18
        {
            if(w>=50.0)// 65.5 >=50.0
            {
                System.out.println("you are eligible to donate blood");
            }
            else
            {
                System.out.println("you must weigh at least 50 kg to donate blood");
            }
        }
        else
        {
            System.out.println("you must be at least 18 years old to donate blood");
        }       
    }
    
}
