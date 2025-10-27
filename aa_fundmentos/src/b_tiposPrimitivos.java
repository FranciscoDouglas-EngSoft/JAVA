public class b_tiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos em Java
        byte b = 100;               // 8 bits -> valores de -128 a 127
        short s = 10000;            // 16 bits -> valores de -32.768 a 32.767
        int i = 100000;             // 32 bits -> valores de -2.147.483.648 a 2.147.483.647
        long l = 100000L;           // 64 bits -> valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        float f = 10.5f;            // 32 bits -> valores de -3.40282347E+38 a 3.40282347E+38
        double d = 20.99;           // 64 bits -> valores de -1.79769313486231570E+308 a 1.79769313486231570E+308

        char c = 'A';               // caractere Unicode de 16 bits
        boolean bool = false;       // verdadeiro ou falso

        // Exibição dos valores no console
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
    }
    
}
