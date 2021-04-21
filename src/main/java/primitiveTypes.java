public class primitiveTypes {
    public static  void main (String[] args){
        int i = 30000;
        byte b = 125;
        short s = 26000;
        long l = 15000000000L;
        float f = 5.99f;
        double d = 19.99d;
        boolean bool = true;
        char w = 'C';

        System.out.println("    Primitive types in Java:");
        System.out.println("Primitive type: 'int'    | Size (bits): 32| Stores whole numbers from -2,147,483,648 to 2,147,483,647                         | Example:" + i);
        System.out.println("Primitive type: 'byte'   | Size (bits):  1| Stores whole numbers from -128 to 127                                             | Example:" + b);
        System.out.println("Primitive type: 'short'  | Size (bits): 16| Stores whole numbers from -32,768 to 32,767                                       | Example:" + s);
        System.out.println("Primitive type: 'long'   | Size (bits): 64| Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | Example:" + l);
        System.out.println("Primitive type: 'float'  | Size (bits): 32| Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits           | Example:" + f);
        System.out.println("Primitive type: 'double' | Size (bits): 64| Stores fractional numbers. Sufficient for storing 15 decimal digits               | Example:" + d);
        System.out.println("Primitive type: 'boolean'| Size (bits):  1| Stores 'true' or 'false' values                                                   | Example:" + bool);
        System.out.println("Primitive type: 'char'   | Size (bits): 16| Stores a single character/letter or ASCII values                                  | Example:" + w);
    }
}