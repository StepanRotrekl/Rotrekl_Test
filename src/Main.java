//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] pole = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Hodnoty v poli:");

        for (int i = 0; i < pole.length; i++) {
            System.out.print(pole[i] + " ");
        }
        System.out.println();

        System.out.println("Hodnoty v opecnem poradi:");
        for (int i = pole.length - 1; i >= 0; i--) {
            System.out.println(pole[i] + " ");
        }


    }
}