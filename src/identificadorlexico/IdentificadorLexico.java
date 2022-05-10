/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package identificadorlexico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yunei
 */
public class IdentificadorLexico {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> ref = new ArrayList();

    public static void main(String[] args) {
        fillRefs();
        System.out.print("Ingrese la sentencia:");
        String sentence = sc.nextLine();
        check(clean(sentence.split(" ")));
    }

    public static void fillRefs() {
        ref.add("P");
        ref.add("Q");
        ref.add("R");
        ref.add("∼");
        ref.add("AND");
        ref.add("OR");
        ref.add("(");
        ref.add(")");
        ref.add("[");
        ref.add("]");
        ref.add("->");
        ref.add("<->");
    }

    public static ArrayList<String> clean(String[] arg) {
        ArrayList<String> list = new ArrayList();
        for (String s : arg) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        return list;
    }

    public static void check(ArrayList<String> arg) {
        for (int i = 0; i < arg.size(); i++) {
            if (ref.contains(arg.get(i))) {
                if (ref.indexOf(arg.get(i)) < 2) {
                    System.out.println(arg.get(i) + " identificador");
                    
                } else if (ref.indexOf(arg.get(i)) < 11) {
                    System.out.println(arg.get(i) + " operador");
                    
                }
            } else {
                System.out.println(arg.get(i) + " no se encuentra");
            }
        }
    }

}
