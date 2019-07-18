class Array {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        /* Instantiating different array types */
        boolean b[] = new boolean[10];//1 bit
        byte b2[] = new byte[10];//8 bits
        char c[] = new char[10];//16 bits
        short s[] = new short[10];//16 bits
        int i[];// 32 bits
        long l[] = new long[10];//64 bits
        float f[] = new float[10];//32 bits
        double d[] = new double[10];//64 bits

        /* Can't print un-initialized variable */
        //System.out.println(x);
        i = new int[10];
        System.out.println(b);//[Z@6d06d69c
        System.out.println(b2);//[B@7852e922
        System.out.println(c);//
        System.out.println(s);//[S@4e25154f
        System.out.println(i);//[I@6d06d69c
        System.out.println(l);//[J@5c647e05
        System.out.println(f);//[F@33909752
        System.out.println(d);//[D@55f96302

        for(int i2=0; i2<i.length; i2++){
            System.out.println(b[i2]);//false
            System.out.println(b2[i2]);//0
            System.out.println(c[i2]);//
            System.out.println(s[i2]);//0
            System.out.println(i[i2]);//0
            System.out.println(l[i2]);//0
            System.out.println(f[i2]);//0.0
            System.out.println(d[i2]);//0.0
        }
        //Passing and Getting array to a method
        printIntArray(i);
        for(int i2=0; i2<i.length; i2++){
            changeArrayValue(i,i2,i2);
        }
        printIntArray(i);
        int newArray[] = new int[10];
        newArray = doubleArray(i);
        printIntArray(i);
        System.out.println("newArray:");
        printIntArray(newArray);
        i[3] = 123;
        System.out.println(newArray[3]);//Pass by reference
    }
    public static int[] doubleArray(int[] input) {
        for(int i = 0; i < input.length; i++) {
            input[i] = input[i] * 2;
        }
        return input;
    }
    public static void changeArrayValue(int[] input,int location, int value) {
        input[location] = value;
    }
    public static void printIntArray(int[] input) {
        for(int i2=0; i2<input.length; i2++){
            System.out.println("int value at "+ i2 + ": " + input[i2]);
        }
    }
}