public class Hello {
    public static void main(String arg[])
    {
        //TODO primitive DataType
        int valueInt=10;
        boolean valueBool=true;
        float valueFloat=0.1f;
        double doubleValue= 0.0;
        short shortValue=30;
        byte byteValue= 31;
        String hello="Java Hello";

        //TODO print
        for (int i=0; i<=2;i++)
        {
            System.out.println();
            System.out.println(hello+"\nint "+valueInt+"\nbool "+valueBool+"\nfloat "+valueFloat+"\nbyte "+byteValue+"\nshort "+shortValue+"\ndouble "+doubleValue);
        }
    }
}
