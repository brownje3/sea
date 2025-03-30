package com.example.sea;

import java.util.*;

public class Practice {
//    public static void main(String[] arg){
//        Scanner scanner = new Scanner(System.in);
//        String order = scanner.nextLine();
//
//        char[] ordered = order.toLowerCase().toCharArray();
//
//        Arrays.sort(ordered);
//
//        System.out.println(ordered);
//    }

    public static void main (String[] args)
    {
//        char[] arr1 = {'a', 'b', 'c', 'd', 'e', 'f'};
//        char[] arr2 = {'b', 'd', 'e', 'h', 'g', 'c'};
//
////        char matched = ' ';
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : arr1) {
//            for (int j = 0; j < arr1.length; j++) {
//                if (c == arr2[j]) sb.append(c);
//            }
//        }
//
//        System.out.println("The matched character is: " + sb);
//        LinkedList<String> strings = new LinkedList<>(List.of(new String[]{"hello", "goodbye"}));
//        LinkedList<String> strings1 = new LinkedList<>(List.of(new String[]{"until", "next", "time"}));
//
//        LinkedList<String> orderedList = new LinkedList<>();
//
//        orderedList.addAll(strings);
//        orderedList.addAll(strings1);
//
//        Collections.sort(orderedList);
//
//        System.out.println(orderedList);

            HashMap<Character, Integer> map = new HashMap<>();
            String s = "Java J2EE Java JSP J2EE";
            int temp = 0;

            char[] letters = s.toCharArray();


            for(char c : letters){
                if(map.containsKey(c)){
                    temp = map.get(c);
                    map.replace(c, temp+1);
                } else {
                    map.put(c, 1);
                }
            }

            System.out.println(map);


    }
}
