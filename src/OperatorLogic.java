public class OperatorLogic {
    public static void main(String[] args){

        short dataFirst = 457;
        double doubleData = dataFirst;
        char dataSecond = 'L';
        long longData = dataSecond;
        int dataThird = 456;
        float floatData = dataThird;
        byte dataFourth = 127;
        long longDataSecond = dataFourth;
        float dataFifth = 565.3f;
        double doubleDataSecond = dataFifth;

        System.out.println("Float ke Double : "+ doubleDataSecond );
        System.out.println("Short ke Double : "+ doubleData );
        System.out.println("Char ke Long : "+ longData );
        System.out.println("Int ke Float : "+ floatData );
        System.out.println("Byte ke Long : "+ longDataSecond );

    }
}
