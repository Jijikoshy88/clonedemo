package com.ust;

import com.ust.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Product p=new Product();
        p.setPid(1);
        p.setPname("jk");
        p.setSal(10000);
        System.out.println("Product Details:");
       
        System.out.println(p.getPid()+" "+p.getPname()+" "+p.getSal());
    }
}

        
