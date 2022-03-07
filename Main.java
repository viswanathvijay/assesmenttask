package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public void StringLargestNumber(){
        String b="abc456j890uu8900";
        int n=0,max1=0;
        for(int j=0;j<b.length();j++) {
            if(!(b.charAt(j)>='a'&&b.charAt(j)<='z')||(b.charAt(j)>='A'&&b.charAt(j)<='Z')){
                n = (n*10)+b.charAt(j) - '0';
                if(max1<n)
                    max1=n;
            }
            else{
                n=0;
            }

        }
        System.out.println("Largest number in string ="+max1);
    }
    public String findDuplicate(String a){
        if(a.length()<=1)
            return a;
        if(a.charAt(0)==a.charAt(1))
            return findDuplicate(a.substring(1));
        else
            return a.charAt(0)+findDuplicate(a.substring(1));

    }
    public void countPrint(List<Integer> a,int c){
        a.stream().filter(m->((m>=0&&m<=10)||(m<=100&&m>=90))).limit(c).forEach(j->System.out.println(j));
    }
    public void countLetters(String a){
        for(int i=0;i<a.length();i++){
            int c=0;
            for(int j=i+1;j<a.length();j++) {
                if (a.charAt(i) == a.charAt(j))
                    c++;
            }
            if(c==0){
                for(int m=0;m<a.length();m++)
                    if(a.charAt(i)==a.charAt(m))
                    c++;
                System.out.println(a.charAt(i)+" Number of Count is "+c);
            }


        }
    }
    public static void main(String[] args) {

        Main main = new Main();
        main.StringLargestNumber();
        String org = main.findDuplicate("ayzzbb");
        System.out.println("Find unique element "+org);
        main.countPrint(Arrays.asList(10, 96, 2, 78, 90, 89), 2);
        main.countLetters("vviswa");
    }
}
