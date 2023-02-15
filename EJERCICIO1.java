package Ejerrcicio1;
import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO1{
    public static void main(String[] args) {
//visulialización por pantalla del menu
        System.out.println("*********************************************");
        System.out.println("*                    MENU                   *");
        System.out.println("*********************************************");
        System.out.println("*                                           *");
        System.out.println("*            1. Lectura de 5 números        *");
        System.out.println("*            2. Orden Inverso               *");
        System.out.println("*            3. Medias y Contador           *");    
        System.out.println("*            4.Contador Caracteres          *");
        System.out.println("*            5.Invertir Texto               *");
        System.out.println("*            6.Texto sin espacios           *");
        System.out.println("*            7.Concatenar 2 cadenas         *");
        System.out.println("*            8.Solo 1 vocal                 *");
        System.out.println("*            9.Cadena en ASCII              *");
        System.out.println("*                                           *");
        System.out.println("*********************************************");
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la opción deseada: ");
        // declaración de variable de tipo entero para almacenaR la opción elegida por el usuario
        int eleccion = sc.nextInt();
        //Declaración condicional switch donde en cada caso se ejecutará el metodo correspondiente segun la opción elegida
        switch(eleccion){

            case 1:
            //Llamada al metodo sin parametos 
                Leer5numeros ();
                break;

            case 2:
                //Llamada al metodo sin parametos 
                ordenInverso();
                break;

            case 3:
                //Llamada al metodo sin parametos 
                mediasContador();
                break;

            case 4:
                //Declaración de una variable de tipo String donde se almacenara el texto 
                String texto = "";
                  //Visualización por pantalla del resultado donde hago una llamada al metodo para obtener el resultado
                System.out.println("El numero de caracteres es de : " + contadorCaracteres(texto));
                break;

            case 5:
                //Declaración de una variable de tipo String donde se almacenara el texto introducido por teclado
                String text = "";
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Introduzca el texto: ");
                //Lo introducido por teclado se almacena en la variable
                text = sc1.nextLine();
                //Visualización por pantalla del resultado donde hago una llamada al metodo para obtener el resultado
                System.out.println("El texto normal es: " + text + "\n" + "El texto invertido es: " + invertirTexto(text));
                break;

            case 6:
                //Declaración de una varable de tipo String donde se almacenara el texto introducido por teclado
                String texto1 = "";
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Introduzca el texto: ");
                texto1 = sc2.nextLine();
                  //Visualización por pantalla del resultado donde hago una llamada al metodo para obtener el resultado
                System.out.println("El texto normal es: " + texto1 + "\n" + "El texto sin espacios es: " + sinEspacios(texto1));
                break;
            case 7:
                //Declaración de una variable de tipo String donde se almacenara el texto introducido por teclado
                String cadena1 = "";
                //Declaración de una variable de tipo String donde se almacenara el texto introducido por teclado
                String cadena2 = "";
                Scanner scan1 = new Scanner(System.in);
                System.out.print("Introduzca la primera cadena: ");
                cadena1 = scan1.nextLine();
                Scanner scan2 = new Scanner (System.in);
                System.out.print("Introduzca la segunda cadena: ");
                cadena2 = scan2.nextLine();
                //Declaración de una variable de tipo String que me almacenará el resultado obtenido de lo que me devuelva el metodo con 2 parametros
                String resultado = Concatenacion(cadena1,cadena2);
                //visualizo por pantalla el resultado
                System.out.println(resultado);
                break;
            case 8:
                //Declaración de una varable de tipo String donde se almacenara el texto introducido por teclado
                String frase = "";
                //Declaración de una varable de tipo char donde se almacenara el caracter introducido por teclado
                char vocal;
                Scanner s1 = new Scanner (System.in);
                System.out.print("Introduzca la frase: ");
                frase = s1.nextLine();
                Scanner s2 = new Scanner (System.in);
                System.out.print("Introduzca la vocal: ");
                vocal = s2.next().charAt(0);
                //Llamada al metodo pasandole 2 parametros
                solo1vocal(frase, vocal);
                break;

            case 9:
                //Declaración de una varable de tipo String donde se almacenara el texto introducido por teclado
                String cadenaa = "";
                Scanner scaa = new Scanner (System.in);
                System.out.print("Introduzca la frase: ");
                cadenaa = scaa.nextLine();
                //Llamada al método pasandole un parametro 
                enASCII(cadenaa);
                break;
            //caso en el que el usuario no elige niguna de las opciones
            default:
                break;

        }
        
    }

    //metdode que Lee 5 números y muestra en el mismo orden introducido. Los 5 números se deben almacenar en un array.
    public static void Leer5numeros () {
        //Declaracion de un array de tipo entero e inicializado.
        int [] almacen = new int [5];
        //Bucle for que me recorre en 5 ocasiones donde leera el numero por teclado y lo introduce en el array
        for (int indice=0; indice < 5; indice ++){
            Scanner sc = new Scanner (System.in);
            System.out.print("Introduzca un numero entero: ");
            int numero = sc.nextInt();
            almacen[indice] = numero;
        }
        //Visualizo por pantalla el contenido del array
       System.out.println("Los numeros seleccionados son: " + Arrays.toString(almacen));
    }

    //metodo que lee 5 números y los mostra en orden inverso al introducido.
    public static void ordenInverso(){
        //Declaracion de un array de tipo entero e inicializado.
        int [] almacen = new int [5];
        //Bucle for que me recorrerá  el array  de manera inversa e ira introduciendo en  5 ocasiones los  numeros introducidos por teclado.
        for (int indice = 4; indice >= 0; indice --){
            Scanner scan = new Scanner(System.in);
            System.out.print("Introduzca un numero entero: ");
            int numero = scan.nextInt();
            almacen[indice] = numero;
        }
        //Visualizo por pantalla el contenido del array
        System.out.println("Los numeros seleccionados son: " + Arrays.toString(almacen));

    }

    //Metodo que lee 5 números por teclado y a continuación realiza la media de los números positivos, la media de los negativos y contar el número de ceros que se han introducido por teclado.
    public static void mediasContador(){
       //Declaraciones de varaibles de tipo entero donde se iran guardando los distintos resultados
        int contadorCeros = 0;
        int sumaPos = 0;
        int sumaNeg = 0;
        int contPos = 0;
        int contNeg = 0;
        //Bucle for parar ir introduciendo los numeros hasta i veces.
        for(int i =0; i <= 4; i ++){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca un numero entero: ");
        int numero = sc.nextInt();
        //Condicional para confirmar si el numero es igual a 0 , positivo o negativo.
        if (numero == 0 ){
            contadorCeros ++;
        } else if (numero > 0){
            sumaPos = sumaPos + numero;
            contPos ++;
        } else {
            sumaNeg = sumaNeg + numero;
            contNeg++ ;
        }

        }
        //evitar conflictos a la hora de hacer 0/0 y los indeterminados
        if (contPos == 0) {
            contPos = 1;
        }
        if (contNeg == 0){
            contNeg =1;
        }

        System.out.println("La media de numeros positivos es de: "+ sumaPos/contPos + "\n" + "La media de numeros negativos es de : " + sumaNeg/contNeg + "\n" + "El numero de ceros es de : " + contadorCeros);
                
    }

    //Metodo que reciba como parámetro un texto y devuelva la cantidad de caracteres que incorpora el texto.
    public static int contadorCaracteres(String text){
        //Declaracion variable de tipo entero e inicializado
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el texto: ");
        text = sc.nextLine();
        //Bucle for para recorrer el caracter por caracter el texto
        for(int indice = 0; indice <= text.length(); indice ++){ 
            //incremento contador
            contador ++;
        }
        //devuelvo la variable que me almacenaba el resultado
        return contador;
    }

    //Metodo que reciba como parámetro un texto y devuelva el texto invertido.
    public static String invertirTexto(String tex){
        //Declaración de una variable de tipo String para almacenar el resultado
        String CadenaReves = "";
        //Bucle for que me recorrera el texto de manera inversa y cada caracter lo almacena en la variable declarada
        for(int indice= tex.length()-1; indice >= 0 ; indice --){
            //El método charAt() de String devuelve en un nuevo String el carácter UTF-16 de una cadena. Para evitar conflictos
            CadenaReves += tex.charAt(indice);
        }
        //Devuelvo el resultado.
        return CadenaReves;
    }
    
    // Metodo que recibe como parámetro un texto y lo devuelva sin espacios en blanco.
    public static String sinEspacios(String textoo){
        //Declaración de una variable de tipo String para almacenar el resultado
        String cadenaSinESP = "";
        //Variable de tipo char que me comprobara caracter por caracter cual es
        char verificacion ;
        //Bucle for que me recorre el texto,cada caracter lo paso a char mediante otro metodo(charAt)
        for (int indice = 0 ; indice < textoo.length(); indice ++){
            verificacion = textoo.charAt(indice);
            //Verifico si el caracter es un espacio mediante una condición
            if (verificacion != ' '){
                cadenaSinESP += verificacion;
            }
        }
        //devolución
        return cadenaSinESP;
       // return textoo.replaceAll(" " ,""); otra posibilidad
    }


    // metodo que recibe como parámetro dos cadenas y las devuelva concatenadas.
    public static String Concatenacion(String cad1, String cad2){

        return (cad1 + cad2);
    }


    //metodo que recibe como parámetro una cadena y una vocal, el método sustituye todas las vocales de la cadena por la vocal que se ha pasado como parámetro (no devuelve nada).
    public static void solo1vocal(String cad3, char voc){
        //Declaración de una variable de tipo String para almacenar el resultado
        String cadenaresul = "";
        //Variable de tipo char que me comprobara caracter por caracter cual es
        char confirmacion;
        //Bucle for que me recorre el texto,cada caracter lo paso a char mediante otro metodo(charAt)
        for (int indice = 0; indice < cad3.length(); indice ++){
            confirmacion = cad3.charAt(indice);
            //llamo al metodo esVocal para ver si el caracter es vocal pasandole por parametro el caracter mencionado
            if (esVocal(confirmacion) == true){
                //cambio de vocales
                confirmacion = voc;
                //Añado el caracter que es vocal a el resultado
                cadenaresul += confirmacion;
            }
            else{
                //añado el caracter al resultado directamente en el caso de que no sea vocal
                cadenaresul += confirmacion;
            }
        }
        //Visualizo el resultado por pantalla
        System.out.println(cadenaresul);
    }


    //Metodo para saber si un variable de tipo char es vocal,devuelve un valor booleano
    public static boolean esVocal(char voca){
        boolean validacion = true;
        if (voca == 'a' || voca == 'e' || voca == 'i' || voca == 'o' || voca =='u' ){
            validacion = true;
            return validacion;
        }
        else{
            validacion = false;
            return validacion;
        }
    }

    //Metodo que recibe como parámetro una cadena, y muestre el código ASCII de cada uno de los caracteres de la cadena (no devuelve nada el método)

    public static void enASCII(String cadd){
        //Declaración de una variable de tipo String para almacenar el resultado
        String resolt = "";
        //Declaración variable de tipo char sin inicializar
        char letra;
        //Bucle que me recorrera el texto caracter por caracter
        for (int indice = 0; indice < cadd.length(); indice ++){
            //Lo convierto en char
            letra = cadd.charAt(indice);
            //Lo añado a la solución
            resolt += (int) letra;
            System.out.println("EL codigo ASCII de " + letra +" es:" + (int) letra );   
        }
        System.out.println("La frase quedaria en ASCII así: ");
        System.out.println(resolt);
        
    }


}


