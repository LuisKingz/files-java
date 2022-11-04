/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafiles;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author lfern
 */
public class PracticaFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File arhivos = new File("C:\\Users\\lfern\\Desktop\\práctica");

        String[] F = arhivos.list();
        File niu = new File("C:\\Users\\lfern\\Desktop\\práctica/Calif4B.xlsx");

        for (int i = 0; i < F.length; i++) {
            File doc1 = new File(arhivos, F[i]);
            if (doc1.exists()) {
                if (doc1.isFile()) {
                    System.out.println(F[i] + ": es archivo");
                } else if (doc1.isDirectory()) {
                    System.out.println(F[i] + ": es directorio");
                } else {
                    System.out.println("No se sabe que es...!");
                }
            } else {
                System.out.println("No existe le Archivo");
            }
        }
        System.out.println("-------------");
        for (int i = 0; i < F.length; i++) {
            File doc2 = new File(arhivos, F[i]);
            if (doc2.exists()) {
                if (F[i].equals("CartaWord.docx")) {
                    doc2.delete();
                    System.out.println("Archivo Eliminado");
                } else {
                    System.out.println("Archivo no Eliminado");
                }
                if (F[i].equals("CalificacionesExcel.xlsx")) {
                    doc2.renameTo(niu);
                    System.out.println("se cambio el nombre");
                }
                if (F[i].equals("Acuerdos.txt")) {
                    System.out.println("Ultima hora de modificacion: " + doc2.lastModified());
                }
            }
        }
    }
}
