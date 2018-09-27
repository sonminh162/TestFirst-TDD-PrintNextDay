package com.company;

public class Demo {
    public static int add(int a, int b ){
        return a+b;
    }
    public static int printNextDay(int a,int b,int c){
        int[] month;
        month = new int[]{1,3,5,7,8,10,12};
        for(int index : month)
        {
           if(b == index) {
               if(a == 31) return (a=1);
               return a+1;
           }
        }
        if((c%4)==0){
            if(b==2){
                if(a==29)return a = 1;
                return a+1;
            }
        }
        if(a==30) return a = 1;
        return a + 1;
    }
}
