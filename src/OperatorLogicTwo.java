public class OperatorLogicTwo {
    public static void main(String[] args){

        boolean isAnd = true;
        boolean isOr = false;
        boolean isNot = true;
        boolean isNand = false;
        boolean isNor = true;
        boolean isXor = true;
        boolean isXnor =true;

        //Boolean logic
        isAnd = (5==5) &&   (4 != 3 );
        System.out.println("Hasil AND : "+isAnd);
        isOr = (5==5)  || (4==3);
        System.out.println("Hasil Or : "+isOr);
        isNot = !(5==5 && 4==2 || 5==7 ) ;
        System.out.println("Hasil Not : "+isNot);
        isNand = !(false || true);
        System.out.println("Hasil Nand : "+isNand);
        isNor = !(false || true);
        System.out.println("Hasil Nor : "+isNor);
        isXor = true ^ true;
        System.out.println("Hasil Xor : "+isXor);
        isXnor = !(true ^ false);
        System.out.println("Hasil Xnor : "+isXnor);
    }
}
