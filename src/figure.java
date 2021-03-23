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
    public ArrayList<figure> figureArray;{}
    public figure() {figureArray = new ArrayList<>();}
    public void addFigure (figure f){
        figureArray.add(f);
    }
    public boolean saveArrayToFile(){
        try {
            File fw = new File("D:\\input.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(fw);
            PrintWriter pw = new PrintWriter(fw);
            for (figure f : this.figureArray) {
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
