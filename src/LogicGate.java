public class LogicGate {

    public static void main (String[] args ) {

        boolean isAnd = true;
        boolean isOr = false;
        boolean isNot = true;
        boolean isNand = false;
        boolean isNor = true;
        boolean isXor = true;
        boolean isXnor =true;

        int a = 6;
        Integer b = 300;
        Double f;
        String firstString = "abcdef";
        String secondString = "ghijk"+ 4 +"lmno"+ 0.0;

        System.out.println(firstString.concat(secondString));
        System.out.println(b.toBinaryString(a));
        System.out.println(secondString.substring(0,5));


        String z ="Aku";
        String hh = "kuat";
        boolean isStr = z.equals(hh);
        int zLength = z.length();

        System.out.println(isStr);
        System.out.println(zLength);
    }

}
