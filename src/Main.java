//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        float[] scores = {7f, 2.5f,8.9f,10.0f,18.5f};
        Arrays.sort(scores);
        System.out.println("El array ordenado es: ");
        for (int i=0; i<5;i++){
            System.out.print(scores[i]+" ");
        }
        System.out.println();

    }
}