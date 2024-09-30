class Point {
    private String nom;
    private int abscisse;
    private int ordonnee;

    // Constructors
    public Point(String n, int a, int o) {
        abscisse = a;
        ordonnee = o;
        nom = n;
    }

    public Point(String n) {
        nom = n;
        abscisse = 0; // Default values
        ordonnee = 0; // Default values
    }

    public Point(int a, int o) {
        abscisse = a;
        ordonnee = o;
        nom = "No Name"; // Default name
    }

    // Method to display the point
    void affiche() {
        System.out.println(nom + " (" + abscisse + "," + ordonnee + ")");
    }

    // Translation methods
    void translHoriz(int a) {
        abscisse = abscisse + a;
    }

    void translVert(int a) {
        ordonnee = ordonnee + a;
    }

    void translation(int a, int b) {
        abscisse = abscisse + a;
        ordonnee = ordonnee + b;
    }

    // Getters
    String getNom() {
        return nom;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    // Setters
    void setNom(String ch) {
        nom = ch;
    }

    void setAbscisse(int a) {
        abscisse = a;
    }

    void setOrdonnee(int a) {
        ordonnee = a;
    }
}

// Corrected class name to TestPoint
public class TestPoint {
    public static void main(String[] args) {
        // Creating instances of Point
        Point p1 = new Point(3, 5);
        Point p2 = new Point("a");
        Point p3 = new Point("b", 3, 5);

        System.out.println("\n ---------------------------\n");
        System.out.println("Les points créés sont :");
        p1.affiche();
        p2.affiche();
        p3.affiche();

        System.out.println("\n ---------------------------\n");

        System.out.println("Translation des points ");
        p1.translHoriz(4);
        p2.translVert(3);
        p3.translation(5, 2);

        p1.affiche();
        p2.affiche();
        p3.affiche();

        System.out.println("\n ---------------------------\n");
        System.out.println("Modification des attributs des points");
        p1.setNom("SRI21");
        p2.setAbscisse(25);
        p3.setOrdonnee(50);

        p1.affiche();
        p2.affiche();
        p3.affiche();

        System.out.println("\n ---------------------------\n");
        System.out.println("Utilisation des méthodes get");
        String x = p1.getNom();
        int y = p1.getAbscisse();
        int z = p1.getOrdonnee();
        System.out.println("Le nom du point p1 est : " + x);
        System.out.println("Son abscisse est : " + y);
        System.out.println("Son ordonnee est : " + z);
    }
}
