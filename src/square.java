import java.awt.*;
import java.io.File;
import java.io.PrintWriter;

public class square extends figure implements saveto{
    public square (int side, int x0, int y0){
        this.side = side;
        this.x0 = x0;
        this.y0 = y0;
    }
    @Override
    public String toString(){
        return "Square: " + side + ", " + "(" + x0 + "," + y0 + ")";
    }
    public int square(){
        return this.side * this.side;
    }
    @Override
    public boolean saveToFile(){
        try {
            File fw = new File("D:\\for squares.txt");
            Desktop dt = Desktop.getDesktop();
            dt.open(fw);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(this.toString());
            pw.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    @Override
    public boolean outputToConsole(){
        try {
            System.out.println(this.toString());
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
}
