package assaigntest;

public class Swapping {
    public static void main(String[] args) {
        String s1 = "Sai Ram";
        String s2 ="Sreekanth";
        System.out.println("Before swapping of string: " +s1+" " +s2);
        s1=s1+s2;
        s2= s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("After swapping of string: " +s1+" "+s2);
    }
}
