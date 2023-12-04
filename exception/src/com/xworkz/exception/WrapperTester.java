package com.xworkz.exception;

public class WrapperTester
{
    public static void main(String[] args)
    {
/*        int i=10;

//        creating object for integer class
//        using literals
        Integer age=i;
//        using new keyword
        Integer age1=new Integer(i);

        System.out.println(age1);

//        boxing
        age=age1;

//        unboxing
        age1=age;

        char ch='a';
        Character ch1=ch;
        Character ch2=new Character(ch);
        System.out.println(ch1);
        System.out.println(ch2);

        boolean bool=false;
        Boolean bool1=bool;
        Boolean bool2=new Boolean(bool);
        System.out.println(bool1);
        System.out.println(bool2);

        float f=3.14f;
        Float f1=f;
        Float f2=new Float(f);
        System.out.println(f1);
        System.out.println(f2);

        short s=1;
        Short s1=s;
        Short s2=new Short(s);
        System.out.println(s1);
        System.out.println(s2);

        double d=2.4455;
        Double d1=d;
        Double d2=new Double(d);
        System.out.println(d1);
        System.out.println(d2);

        byte b=1;
        Byte b1=b;
        Byte b2=new Byte(b);
        System.out.println(b1);
        System.out.println(b2);

        long l=242424;
        Long l1=l;
        Long l2=new Long(l);
        System.out.println(l1);
        System.out.println(l2);

//        parsing
        String contact="1234567890";
        long number=Long.parseLong(contact);
        System.out.println(number);

        String age3="60";
         int age4=Integer.parseInt(age3);
        System.out.println(age4);

        String pi="3.14";
        float pi1=Float.parseFloat(pi);
        System.out.println(pi1);

        String abc = "1.22222";
        double abc2=Double.parseDouble(abc);
        System.out.println(abc2);

        String e="1";
        byte ee=Byte.parseByte(e);
        System.out.println(ee);

        String g="123";
        short gg=Short.parseShort(g);
        System.out.println(gg);*/

        String num="123456ABC";

        try{
            System.out.println(Long.parseLong(num));
        } catch (NumberFormatException nf) {
            nf.printStackTrace();
        }


    }
}
