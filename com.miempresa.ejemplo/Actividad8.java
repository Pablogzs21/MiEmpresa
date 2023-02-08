import java.util.Random;

public class Actividad8 {
  public static void main(String[] args) {
    Random random = new Random();
    char letra = (char) (random.nextInt(26) + 'a');
    System.out.println("Letra generada: " + letra);

    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
        
      System.out.println("La letra generada " + letra + " es una vocal");
      
    } else {
      System.out.println("La letra generada " + letra + " es una consonante");
    }
  }
}
