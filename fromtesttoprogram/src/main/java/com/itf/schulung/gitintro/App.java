package com.itf.schulung.gitintro;

public class App 
{
    public static void main( String[] args )
    {
       RationaleZahl x = new RationaleZahl(5,6);
       RationaleZahl y = new RationaleZahl(1,4);
       RationaleZahl z = x.add(y);
       System.out.println(z);
       
       RationaleZahl a = new RationaleZahl(1, 4);
       RationaleZahl b = new RationaleZahl(1, 2);
       RationaleZahl c = a.multiply(b);
//       r.kuerze();
//       System.out.println(r);
    }
}
