public class Frigorifero {
    private int capienza;
    private String classe;

    public Frigorifero(int capienza, String classe) {
        this.capienza = capienza;
        this.classe = classe;
    }

    public double calcolaPrezzo() {
        double moltiplicatore = 0;
        if (classe.equals("A")) {
            moltiplicatore = 5;
        } else if (classe.equals("A+")) {
            moltiplicatore = 1.5;
        } else if (classe.equals("A++")) {
            moltiplicatore = 2;
        }
        return 5 * capienza * moltiplicatore;
    }

    public static void main(String[] args) {
        Frigorifero frigo1 = new Frigorifero(500, "A");
        Frigorifero frigo2 = new Frigorifero(400, "A+");
        System.out.println("Prezzo frigo1: " + frigo1.calcolaPrezzo());
        System.out.println("Prezzo frigo2: " + frigo2.calcolaPrezzo());
    }
}