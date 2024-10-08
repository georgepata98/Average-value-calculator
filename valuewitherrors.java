//Algoritm pentru determinarea valorii medii dintr-un sample cu N masuratori x_i care au erorile delta_i
import java.util.Scanner;
import java.util.InputMismatchException;

public class valuewitherrors
{
public static void main(String[] args)
{
  Scanner scanner = new Scanner(System.in);

  System.out.print("Introduceti numarul de masuratori: ");
  int n = scanner.nextInt();  //echivalentul lui cin >> n (cand n este Int=integer)
  double x, delta, numitor = 0, numarator = 0, xi, di;

  for(int i=0; i<n; i++)
  {
    System.out.print("x_" + (i+1) + " = ");
    xi = scanner.nextDouble();
    System.out.print("err_" + (i+1) + " = ");
    di = scanner.nextDouble();
    numarator += xi / Math.pow(di, 2);
    numitor += 1 / Math.pow(di, 2);
  }
  x = numarator / numitor;
  delta = Math.sqrt(1 / numitor);

  System.out.println("Rezultat: " + x + " +/- " + delta);

  scanner.close();
}
}
