package bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bingo {

    public static void main(String[] args) {

        Object arr[] = new Object[5];
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 1; i < 26; i++) {           // element will be in range (1,25)
            list.add(i);
        }

        Collections.shuffle(list);
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.format("%3s     ", list.get(j * 5 + k));

            }
            System.out.println();
        }

        int x = 1;
        String input = "";
        while (x < 26) {

            System.out.println("===============");

            Scanner sc = new Scanner(System.in);
            System.out.println("Try number " + x);
            System.out.print("Enter the number (press \"n or N\" to end the game): ");
            input = sc.nextLine();
            if ("n".equals(input) || "N".equals(input)) {
                break;
            } else {
                int in = Integer.parseInt(input);
                int index = list.indexOf(in);

                boolean check = list.contains(in);

                if (check == false) {
                    System.out.println(in + " Number is already removed try another");
                } else {
                    list.set(index, " X ");
                    for (int j = 0; j < 5; j++) {
                        for (int k = 0; k < 5; k++) {
                            //System.out.format("%3s     ", list.get(j * 5 + k));
                            System.out.format("%3s     ", list.get(j * 5 + k));
                            
                        }
                        System.out.println();
                    }
                    x++;
                }
            }
        }
        System.out.println("Thank You ... :)");
    }
}
