package com.hacker.Earth;
import java.util.*;

public class Substrings {

        public static void main(String[] args) throws Exception {
            //Scanner
            Scanner scanner = new Scanner(System.in);
            List<String> l1=new ArrayList<>();
            List<String> l2=new ArrayList<>();
            String s=scanner.next();
            String t=scanner.next();
            List<Integer> l3=new ArrayList<>();

            for(int i=0;i<=s.length();i++){
                for(int j=i+1;j<=s.length();j++){
                    l1.add(s.substring(i, j));
                }
            }

            for(int k=0;k<=t.length();k++){
                for(int l=k+1;l<=t.length();l++){
                    l2.add(t.substring(k,l));
                }
            }

            for(int n=0;n<l2.size();n++)
            {
                if(s.startsWith(l2.get(n))){
                    l3.add((l2.get(n)).length());
                }
                else if(s.endsWith(l2.get(n))){
                    l3.add((l2.get(n)).length());
                }
            }
            Collections.sort(l3);
            System.out.print(l3.get(l3.size()-1));
        }
    }












