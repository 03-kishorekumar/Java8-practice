package com.practice.functionalinterface;


@FunctionalInterface
interface Maximum
{
//    int findMax(int a, int b);

//    boolean isEven(int num);

//    String reverse(String rev);

//    int add(int a, int b);

//    int square(int a);

//    boolean palindrome(String str);

    String length(String str);

}


public class maximum
{
    public static void main(String[] args)
    {

//        Maximum max = (a,b) -> a>b ? a : b;
//        System.out.println(max.findMax(10, 20));


//        Maximum max = num -> num % 2 == 0;
//        System.out.println(max.isEven(10));


//        Maximum max  = new Maximum() {      // Anonymous class
//            @Override
//            public String reverse(String rev) {
//                StringBuilder sb = new StringBuilder();
//                for (int i = rev.length() - 1; i >= 0; i--) {
//                    sb.append(rev.charAt(i));
//                }
//
//                return sb.toString();
//            }
//
//        };
//
//        System.out.println(max.reverse(""));


//        Maximum max = rev -> new StringBuilder(rev).reverse().toString();
//        System.out.println(max.reverse("Ravi"));


//        Maximum max = (a,b) -> a+b;
//        System.out.println(max.add(1,2));


//        Maximum max = a -> a * a;
//        System.out.println(max.square(5));


//        Maximum max = str -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
//        System.out.println(max.palindrome("racecar"));

        Maximum max = str -> str.length() + "";
        System.out.println(max.length("Ravi"));

    }
}
