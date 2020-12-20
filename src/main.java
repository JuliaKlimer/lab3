import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        square sq1 = new square(5, 0, 2);
        square sq2 = new square(8, 6, 2);
        System.out.println("Area: " + sq1.square());
        triangle tr1 = new triangle(2, 2, 2, 0, 1);
        triangle tr2 = new triangle(1,3,9,0,0);
        System.out.println("Area: " + tr1.heronformula());
        sq1.savetofile();
        sq2.outputtoconsole();
        tr1.outputtoconsole();
        tr2.savetofile();
        figure f0 = new figure();
        f0.addfigure(sq1);
        f0.addfigure(sq2);
        f0.addfigure(tr1);
        f0.addfigure(tr2);
        f0.savearraytofile();
    }
}

