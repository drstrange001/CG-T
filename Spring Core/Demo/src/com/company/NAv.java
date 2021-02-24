package com.company;

import javax.print.attribute.standard.MediaSize;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class NAv { public void Pass(String arg)
{
    arg = "You've got it in you!!";
}
    public static void main (String[] args)
    {
        NAv test = new NAv();
        String Push = null;
        if(Push!="null")
            System.out.print("Passed");
        else
            System.out.print("Failed");
        test.Pass(Push);
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(1, "Dasd");
        map2.put(2, "dsad");

        System.out.println(map2.get(0));
        System.out.println(map2);
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "Dsad");
//        map.size();
//        String modulus = "1000000007";
//        String binaryRep = "";
//        for(int i = 1; i <= 11; i++){
//            binaryRep += Integer.toBinaryString(i);
//        }
//        System.out.println(new BigInteger(binaryRep, 2).mod(new BigInteger(modulus)).intValue());
    }
}
