package Java.CheckSomething;


public class check {
    public static void main(String[] args) {
        String h = "Hello";
        char[] ar = h.toCharArray();
        System.out.println(ar[1]);
        System.out.println(h.length());
        ar[3] = 0;
        System.out.println(ar);
        //h = null;
        //System.out.println(h.length());
        h = "145.89";
        ar = h.toCharArray();
        ar[2] = 0;
        float a = Float.parseFloat(h);
        String b = String.valueOf(ar);
        System.out.println(a);
        h="";
        System.out.println(h.length());
        System.out.println(h);
        System.out.println(ar);

    }
}
