import java.awt.*;
import java.io.File;
import java.io.PrintWriter;

public class triangle extends figure implements saveto{
    public triangle (int side, int side1, int side2, int x0, int y0){
        this.side = side;
        this.side1 = side1;
        this.side2 = side2;
        this.x0 = x0;
        this.y0 = y0;
    }
    @Override
    public String toString(){
        return "Triangle: " + side + ", " + side1 + ", " + side2 + ", " + "(" + x0 + "," + y0 + ")";
    }
    public int heronformula() {
        int hp = (this.side + this.side1 + this.side2)/2;
        return (int) Math.sqrt(hp*(hp-this.side)*(hp-this.side1)*(hp-this.side2));
    }
    @Override
    public boolean savetofile(){
        try {
            File fw = new File("D:\\for triangles.txt");
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
    public boolean outputtoconsole(){
        try {
            System.out.println(this.toString());
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
}
