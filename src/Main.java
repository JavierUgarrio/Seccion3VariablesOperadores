import java.util.Scanner;

public class Main {
    
    public static void main(String []args){
        System.out.println("Hola Mundo");
        
        String nombre = "Javier";
        
        int edad = 24;
        
        int a, b, c;
        a=2;
        b=5;
        c=9;
        
        System.out.println("Hola " + nombre + " tienes "+ edad);
        System.out.println(a + b+ c);
        
        //Nueva forma de definir variables
        var primerNombre = "Joselito";
        var segundoNombre = " De Miguel";
        var miNombre = primerNombre + segundoNombre;
        System.out.println(miNombre);
        System.out.println("corrigiendo git");
        System.out.println("segunda correcion");
        
        float numeroDecimal =1.3f;
        double numeroDecimal2 = 123.453;
        byte numeroByte = 25;
        
    //Operadores de asignacion

    int numero1 = 9;
    int numero2 =8;
    int numero3 =83;
    int numero4 =21;
    int numero5 =3;
    //Suma de asignacion
    numero1 += 4;
    System.out.println(numero1);
    
    //Resta de asignacion
    numero2 -=6;
    System.out.println(numero2);
    
    //Multiplicacion en asignacion
    numero3 *=5;
    System.out.println(numero3);
    
    //Division en asignacion
    numero4 /=3;
    System.out.println(numero4);
    
    //Modulo en asignacion
    numero5%=4;
    System.out.println(numero5);
          
   /**
    * Operadores Relacionales
        Igualdad                ==	a == b => false
        Distintos               !=	a != b => true
        Mayor que               >	a > b => false 
        Menor que               <	a < b => true
        Mayor o Igual que 	>=	a >= b => false
        Menor o Igual que	<=	a <= b => true
    
    */
   
   //Igualdad
    int x = 5;
    int y = 3;
    
    if(x == y) {
        System.out.println("x es igual a y");
    } else {
        System.out.println("x es diferente a y");
    }
    
    
    //Distintos
    int a1 = 5;
    int b1 = 3;
    if(a1 != b1) {
       System.out.println("a es diferente a b");
    } else {
        System.out.println("a es igual a b");
    }
    
    //Mayor que
    int p = 5;
    int q = 3;
    if(p > q) {
        System.out.println("p es mayor que q");
    } else {
        System.out.println("p no es mayor que q");
    }
    
    //Menor que
    int m = 5;
    int n = 3;
    if(m < n) {
        System.out.println("m es menor que n");
    } else {
        System.out.println("m no es menor que n");
    }
    
    /*
    Not     !       !true = false
    And     &&      true && true = true 
                    true && false = false
                    false && true = false 
                    false && false = false
    Or      ||      true || true = true 
                    true || false = true
                    false || true = true 
                    false || false = false
    */
    
    //Operador Not
    boolean x1 = true;
    boolean y1 = !x1; // y es false
    
    //Operador OR
    
    int a2 = 5;
    int b2 = -3;
    if(a2 > 0 || b2 > 0) {
        System.out.println("a2 o b2 son mayores que cero");
    } else {
        System.out.println("a2 y b2 no son mayores que cero");
    }
    
    //Operador AND
    
    int x3 = 5;
    int y3 = 3;
    if(x3 > 0 && y3 > 0) {
        System.out.println("x3 e y3 son mayores que cero");
    } else {
        System.out.println("x3 o y3 no son mayores que cero");
    }
    
    
    //Entrada de datos desde el teclado
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Introduzca su nombre");
    String introduceNombre = teclado.nextLine();
    System.out.println("Introduzca su edad");
    int introduceEdad = teclado.nextInt();
    System.out.println("Introduzca una palabra");
    char caracter1 = teclado.next().charAt(1);
    System.out.println("Su nombre " + introduceNombre);
    System.out.println("Su edad " + introduceEdad);
    System.out.println("el caracter 1 es: " + caracter1);
    
    /*
        next(): Lee una palabra (una secuencia de caracteres delimitada por espacios en blanco) desde la fuente de entrada y devuelve una cadena.
        nextLine(): Lee una línea completa (una secuencia de caracteres delimitada por un salto de línea) desde la fuente de entrada y devuelve una cadena.
        nextInt(): Lee un entero desde la fuente de entrada y devuelve un valor int.
        nextDouble(): Lee un número de punto flotante desde la fuente de entrada y devuelve un valor double.
        nextFloat(): Lee un número de punto flotante desde la fuente de entrada y devuelve un valor float.
        nextBoolean(): Lee un valor booleano desde la fuente de entrada y devuelve un valor boolean.
        nextByte(): Lee un valor byte desde la fuente de entrada y devuelve un valor byte.
        nextShort(): Lee un valor short desde la fuente de entrada y devuelve un valor short.
        nextLong(): Lee un valor long desde la fuente de entrada y devuelve un valor long.
        nextBigInteger(): Lee un valor BigInteger desde la fuente de entrada y devuelve un objeto BigInteger.
        nextBigDecimal(): Lee un valor BigDecimal desde la fuente de entrada y devuelve un objeto BigDecimal.
        close(): Cierra la fuente de entrada asociada con el objeto Scanner y libera cualquier recurso asociado. Es recomendable cerrar un objeto Scanner una vez que ya no sea necesario para evitar fugas de memoria.
    */
    
    
    /* 
    Ejercicio supersencillo
    
    Introducir por teclado los numeros y realizar un suma
        
    */
        Scanner numeroTeclado = new Scanner(System.in);
        System.out.println("Por favor, introduce el primer numero");
        int primerNumero = numeroTeclado.nextInt();
        System.out.println("Por favor, introduce el segundo numero");
        int segundoNumero = numeroTeclado.nextInt();
        int sumaTotal = primerNumero + segundoNumero;
        System.out.println("la suma de ambos numeros es: " + sumaTotal);
    
    
     /* 
    Ejercicio supersencillo
    
    Introducir por teclado EL PRECIO DE LA VENTA DE UN BOLI y QUE SALGA EL TOTAL DEL VALOR DEL BOLI (VALOR +IVA)
    */    
       Scanner teclado2 = new Scanner(System.in);
       
        System.out.println("Por favor, introduce el valor del boli");
        double valorBoli = teclado2.nextDouble();
        double porcentajeIva = valorBoli * 0.21;
        double valorBruto = valorBoli + porcentajeIva;
        System.out.println("el valor bruto del boli es: " + valorBruto);
      
    }
    
}
