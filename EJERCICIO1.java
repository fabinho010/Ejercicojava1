package Ejerrcicio1;
import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO1{
    public static void main(String[] args) {

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

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la opción deseada: ");
        int eleccion = sc.nextInt();

        switch(eleccion){

            case 1:
                Leer5numeros ();
                break;

            case 2:
                ordenInverso();
                break;

            case 3:
                mediasContador();
                break;

            case 4:
                String texto = "";
                System.out.println("El numero de caracteres es de : " + contadorCaracteres(texto));
                break;

            case 5:
                String text = "";
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Introduzca el texto: ");
                text = sc1.nextLine();
                System.out.println("El texto normal es: " + text + "\n" + "El texto invertido es: " + invertirTexto(text));
                break;

            case 6:
                String texto1 = "";
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Introduzca el texto: ");
                texto1 = sc2.nextLine();
                System.out.println("El texto normal es: " + texto1 + "\n" + "El texto sin espacios es: " + sinEspacios(texto1));
                break;
            case 7:
                String cadena1 = "";
                String cadena2 = "";
                Scanner scan1 = new Scanner(System.in);
                System.out.print("Introduzca la primera cadena: ");
                cadena1 = scan1.nextLine();
                Scanner scan2 = new Scanner (System.in);
                System.out.print("Introduzca la segunda cadena: ");
                cadena2 = scan2.nextLine();
                String resultado = Concatenacion(cadena1,cadena2);
                System.out.println(resultado);
                break;
            case 8:
                String frase = "";
                char vocal;
                Scanner s1 = new Scanner (System.in);
                System.out.print("Introduzca la frase: ");
                frase = s1.nextLine();
                Scanner s2 = new Scanner (System.in);
                System.out.print("Introduzca la vocal: ");
                vocal = s2.next().charAt(0);
                solo1vocal(frase, vocal);

            case 9:
                String cadenaa = "";
                Scanner scaa = new Scanner (System.in);
                System.out.print("Introduzca la frase: ");
                cadenaa = scaa.nextLine();
                enASCII(cadenaa);
                break;
            
            default:
                break;

        }
        
    }
    
    public static void Leer5numeros () {
        int [] almacen = new int [5];
        for (int indice=0; indice < 5; indice ++){
            Scanner sc = new Scanner (System.in);
            System.out.print("Introduzca un numero entero: ");
            int numero = sc.nextInt();
            almacen[indice] = numero;
        }
       System.out.println("Los numeros seleccionados son: " + Arrays.toString(almacen));
    }

    public static void ordenInverso(){
        int [] almacen = new int [5];
        for (int indice = 4; indice >= 0; indice --){
            Scanner scan = new Scanner(System.in);
            System.out.print("Introduzca un numero entero: ");
            int numero = scan.nextInt();
            almacen[indice] = numero;
        }
        System.out.println("Los numeros seleccionados son: " + Arrays.toString(almacen));

    }

    public static void mediasContador(){
       
        int contadorCeros = 0;
        int sumaPos = 0;
        int sumaNeg = 0;
        int contPos = 0;
        int contNeg = 0;
        for(int i =0; i <= 4; i ++){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca un numero entero: ");
        int numero = sc.nextInt();
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
    public static int contadorCaracteres(String text){
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el texto: ");
        text = sc.nextLine();
        for(int indice = 0; indice <= text.length(); indice ++){ 
            contador ++;
        }
        return contador;
    }
    public static String invertirTexto(String tex){
        String CadenaReves = "";
        for(int indice= tex.length()-1; indice >= 0 ; indice --){
            CadenaReves += tex.charAt(indice);
        }
        return CadenaReves;
    }
    
    public static String sinEspacios(String textoo){
        String cadenaSinESP = "";
        char verificacion ;
        for (int indice = 0 ; indice < textoo.length(); indice ++){
            verificacion = textoo.charAt(indice);
            if (verificacion != ' '){
                cadenaSinESP += verificacion;
            }
        }
        return cadenaSinESP;
       // return textoo.replaceAll(" " ,""); otra posibilidad
    }
    
    public static String Concatenacion(String cad1, String cad2){

        return (cad1 + " "+ cad2);
    }

    public static void solo1vocal(String cad3, char voc){
        String cadenaresul = "";
        char confirmacion;
        for (int indice = 0; indice < cad3.length(); indice ++){
            confirmacion = cad3.charAt(indice);
            if (esVocal(confirmacion) == true){
                confirmacion = voc;
                cadenaresul += confirmacion;
            }
            else{
                cadenaresul += confirmacion;
            }
        }
        System.out.println(cadenaresul);
    }
    
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

    public static void enASCII(String cadd){
        String resolt = "";
        char letra;
        for (int indice = 0; indice < cadd.length(); indice ++){
            letra = cadd.charAt(indice);
            resolt += (int) letra;
            
        }

        System.out.println(resolt);
        
    }


}


