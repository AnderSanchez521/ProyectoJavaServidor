package objetosproyecto;

import java.util.*;

public class ObjetosProyecto {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);        
         int opcion = 0;
        try {
        do{
            System.out.println("MENÚ DE OPERACIONES EN JAVA");
            System.out.println("1- Ejercicio 1");
            System.out.println("2- Ejercicio 2");
            System.out.println("3- Ejercicio 3");
            System.out.println("4- Salir");
            System.out.print("Elija una opción: ");
            
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    try{
                    System.out.println("\nOpción 1");
                    int posiciones;
                    
                    System.out.println("Introduce el número de posiciones: ");
                    posiciones = teclado.nextInt();                    
                    int [] tabla = new int [posiciones];
                    
                    for (int i = 0; i < tabla.length; i++){
                        int valor = 0;
                        System.out.println("Introduce un valor para la posición " + (i+1) + " de " + tabla.length + ": ");
                        valor = teclado.nextInt();
                        if (valor>0 && (valor % 2==0)){
                            tabla[i] = valor;
                        }else{
                            do{
                                System.out.println("ERROR, vuelve a introducir un valor para la posición " + (i+1) + " de " + tabla.length + ": ");
                                valor = teclado.nextInt();
                            }while(valor<0 || (valor % 2!=0));
                            tabla[i] = valor;
                        }                        
                    }                    
                    double menores_1000 = 0;               
                    double media = media_menores1000(tabla);     
                    int contador_mayores = 0;
                    for (int a : tabla){
                        if(a>media){
                           contador_mayores++;  
                        }
                    }                   
                    System.out.println("La media de números menores de 1000 es: " + media);
                    System.out.println("Los datos mayores de la media calculada son: " + contador_mayores + "\n");                   
                    }catch (InputMismatchException e) {
                        System.out.println("Has introducido un dato con formato incorrecto.\n");
                        teclado.next();
                    }                    
                break;
                
                case 2:
                    teclado.nextLine();
                    System.out.println("\nOpción 2");
                    String cadena1;
                    String cadena2; 
                    
                    System.out.println("Introduce la primera cadena: ");
                    cadena1 = teclado.nextLine();
                    System.out.println("Introduce la segunda cadena: ");
                    cadena2 = teclado.nextLine();
                    /*unir cadenas*/
                    System.out.println("El resultado de unir dos cadenas es: "+cadena1 + cadena2 + "\n");
                    /*inicial de cada cadena*/
                    System.out.println("La inicial de " + cadena1 + " es: " + cadena1.charAt(0) + "\n");
                    System.out.println("La inicial de " + cadena2 + " es: " + cadena2.charAt(0) + "\n");
                    /*buscar si una cadena contiene la otra*/
                    if(cadena2.contains(cadena1)){
                        System.out.println("La cadena " + cadena2 + " contiene " + cadena1 + "\n");
                    }else{
                        System.out.println("La cadena " + cadena2 + " NO contiene " + cadena1 + "\n");
                    }
                    /*caracteres en cada cadena*/
                    System.out.println("La cadena " + cadena1 + " tiene " +cadena1.length() +" caracteres.\n");
                    System.out.println("La cadena " + cadena2 + " tiene " +cadena2.length() +" caracteres.\n");
                    /*añadir S al final*/
                    System.out.println("Añadimos 'S' a " + cadena1 + ": " + cadena1.concat("S") + "\n");                                       
                break;
                
                case 3:
                    System.out.println("\nOpción 3");
                    System.out.println("Cuantas NEVERAS desea introducir: ");
                    int i = teclado.nextInt();
                    teclado.nextLine(); // Limpieza de buffer

                    ArrayList<NEVERA> listaNeveras = new ArrayList<>();

                    for (int e = 0; e<i; e++){
                        System.out.println("\nIntroduce los datos de la nevera #"+(e+1));

                        System.out.println("Marca: ");
                        String marca = teclado.nextLine();
                        System.out.println("Color: ");
                        String color = teclado.nextLine();
                        System.out.println("Precio: ");
                        Double precio = teclado.nextDouble();
                        teclado.nextLine(); 
                        System.out.println("Altura(m): ");
                        Double altura = teclado.nextDouble();
                        teclado.nextLine(); 
                        System.out.println("Peso(kg): ");
                        Double peso = teclado.nextDouble();
                        teclado.nextLine(); 
                        System.out.println("Consumo Energético: ");
                        String consumoEnergetico = teclado.nextLine();

                        NEVERA nevera = new NEVERA(consumoEnergetico, marca, color, precio, altura, peso);
                        listaNeveras.add(nevera);
                    }

                    System.out.println("\n--- Datos de las neveras introducidas ---");
                    for (NEVERA nevera : listaNeveras){
                        nevera.verDatos();
                        System.out.println("-------------------------------");
                    }
                            break;
                
                case 4:
                    System.out.println("\nFIN DEL PROCESO");
                break;
                
                default: 
                    System.out.println("La opción no es válida.");      
            }         
        }while(opcion!=4);   
            }catch (InputMismatchException a) {
                        System.out.println("Se ha parado la ejecución por que se ha introducido una letra o un número fuera de rango.\n");
                        
                        teclado.next();
                    }
    }
    public static double media_menores1000(int[] tabla) {
        double suma = 0;
        int contador = 0;
        for (int num : tabla) {
            if (num < 1000) {
                suma += num;
                contador++;
            }
        }
        if(contador>0){
           return suma / contador; 
        }else{
            return 0;
        }      
    }
}
