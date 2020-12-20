import java.awt.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class figure {
    int side;
    int side1;
    int side2;
    int x0;
    int y0;
    public ArrayList<figure> figurearray;{}
    public figure() {figurearray = new ArrayList<>();}
    public void addfigure (figure f){
        figurearray.add(f);
    }
    public boolean savearraytofile(){
        try {
            File fw = new File("D:\\input.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(fw);
            PrintWriter pw = new PrintWriter(fw);
            for (figure f : this.figurearray) {
                if (f != null) pw.println(f.toString());
            }
            pw.flush();
            pw.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
