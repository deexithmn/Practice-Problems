//Given a digit string, return all possible letter combinations that the number could represent
//Input:Digit string "23"
//        Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].



package com.company;

import java.util.*;

public class DigitString {
    public String inString = new String();
    public static void digiStrCombi(String str) {
        String strInput[] = str.split("");
        int[] inChar = new int[strInput.length];
        for (int i = 0; i < strInput.length; i++) {
            inChar[i] = Integer.parseInt(strInput[i]);
        }
        HashMap<Integer, String> dialAlpha = new HashMap<>();
        List<String> get_chars = new ArrayList<String>();
        dialAlpha.put(1, new String(" "));
        dialAlpha.put(2, new String("abc"));
        dialAlpha.put(3, new String("def"));
        dialAlpha.put(4, new String("ghi"));
        dialAlpha.put(5, new String("jkl"));
        dialAlpha.put(6, new String("mno"));
        dialAlpha.put(7, new String("pqrs"));
        dialAlpha.put(8, new String("tuv"));
        dialAlpha.put(9, new String("wxyz"));
        int count = inChar.length;
        int m = 0;
        int n=0;
        String[] temp = new String[inChar.length];
        for(int i=0;i<inChar.length;i++){
        for (Map.Entry<Integer, String> iterator : dialAlpha.entrySet()) {
            if (inChar[i] == iterator.getKey()) {
                temp[m] = iterator.getValue();
                get_chars.add(temp[m]);
                m++;
            }
        }}
        for(int i=0;i<get_chars.size();i++){
            for(int j=0;j<get_chars.get(i).length();j++){
                if(i>=(get_chars.size()-1)){
                    continue;}
                else{
                for(int k =0;k<get_chars.get(i+1).length() ;k++){
                    if(i>=(get_chars.size()-1)){
                        continue;
                    }else {
                System.out.println(get_chars.get(i).charAt(j)+""+get_chars.get(i+1).charAt(k));
            }}}
        }}}

    public static void main(String[] args){
        Scanner S= new Scanner(System.in);
        System.out.println("Kindly enter the digits who's alphabet combination needs to be printed");
        try {
        String inString = S.nextLine();
        if(inString.length()<3){
        digiStrCombi(inString);}
        else { throw new StringIndexOutOfBoundsException("'"+inString+"is longer than 2");}
        }catch (StringIndexOutOfBoundsException e){

            System.out.println("U didnt enter 2 digits");
        }
}}
