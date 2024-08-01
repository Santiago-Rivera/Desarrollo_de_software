package Universidad.Leccion;

public class Main {
    public static void main(String[] args) {
        Pajaro tucan = new Pajaro("Gallo");
        tucan.comer();
        tucan.volar();
        System.out.println(tucan.cantar("ave"));
    }
}