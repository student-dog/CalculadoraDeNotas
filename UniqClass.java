/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OnLyI;

import java.util.Scanner;

/**
 *
 * @author bonil
 */
public class UniqClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Honestamente queria tomarlo de otra forma, con una interfaz, me parece que podria haber quedado bien con paneles
        int numEstudiantes;

        System.out.print("Ingresa el número de estudiantes: ");
        numEstudiantes = scanner.nextInt();

        double[] notasMatematicas = new double[numEstudiantes];
        double[] notasEspanol = new double[numEstudiantes];
        double[] notasIngles = new double[numEstudiantes];

        // Se piden las notas de todas las materias, teniendo en cuenta el valor de cada estudiante y see pide por individual
        System.out.println("Ingresa las notas de matemáticas:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            notasMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("Ingresa las notas de español:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            notasEspanol[i] = scanner.nextDouble();
        }

        System.out.println("Ingresa las notas de inglés:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            notasIngles[i] = scanner.nextDouble();
        }

        // Aqui se calcula el promedio, se toman los valores totales y se divide por el numero de estudiantes que exista
        System.out.print("Ingresa la materia (matematicas/espanol/ingles): ");
        String materia = scanner.next();

        switch (materia.toLowerCase()) {
            case "matematicas":
                double sumaMatematicas = 0;
                for (int i = 0; i < numEstudiantes; i++) {
                    sumaMatematicas += notasMatematicas[i];
                }
                System.out.println("Promedio de matemáticas: " + sumaMatematicas / numEstudiantes);
                break;

            case "espanol":
                //Suma hasta el numero indicado para luego operar como tal
                double sumaEspanol = 0;
                int i = 0;
                while (i < numEstudiantes) {
                    sumaEspanol += notasEspanol[i];
                    i++;
                }
                //Aunque honestamente depende un poco de la institucion, 
//                se suele tomar de otras formas, almenos en la mia lo toman a partir de la suma total del 
//                final del periodo y lo hacen por estudiante, no por salon, si es para la 
//                nota individual no funcionaria, esto es mas general
                
                
                System.out.println("Promedio de español: " + sumaEspanol / numEstudiantes);
                break;

            case "ingles":
                double sumaIngles = 0;
                int j = 0;
                do {
                    sumaIngles += notasIngles[j];
                    j++;
                } while (j < numEstudiantes);
                System.out.println("Promedio de inglés: " + sumaIngles / numEstudiantes);
                break;

            default:
                System.out.println("Materia no reconocida.");
                break;
}

    }  
        
        
        
    }
    

