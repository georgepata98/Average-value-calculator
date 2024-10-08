//Algoritm pentru determinarea valorii medii si erorii dintr-un sample cu N masuratori x_i care NU au erori si NU stim valoarea adevarata, dar valoarea 'cvasiadevarata' se poate estima ca valoarea medie a setului
import java.util.Scanner;
import java.util.InputMismatchException;

public class valuewithouterrors
{
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduceti numarul de masuratori: ");
    int n = scanner.nextInt();
    double xmed = 0, err = 0;
    double[] xi = new double[n];  //array de dimensiunea n

    for(int i=0; i<n; i++)
    {
        System.out.print("x_" + (i+1) + " = ");
        xi[i] = scanner.nextDouble();
        xmed += xi[i];
    }
    xmed = xmed / n;

    for(int i=0; i<n; i++)
    {
        err += Math.pow(xi[i] - xmed, 2);
    }
    err = Math.sqrt(err / (n-1));  //cand se stie valoarea adevarata atunci numitorul lui err este n in loc de n-1, si xmed se inlocuieste cu valoarea adevarata (cea 100% exacta)

    System.out.println("Rezultat: " + xmed + " +/- " + err);

    scanner.close();
}
}
