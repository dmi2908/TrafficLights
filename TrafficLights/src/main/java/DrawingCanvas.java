import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingCanvas extends JComponent{
    private int width;
    private int height;

    private ColorLight red = new ColorLight(Color.RED,270);
    private ColorLight yellow= new ColorLight(Color.YELLOW,380);
    private ColorLight green= new ColorLight(Color.GREEN,490);

    public DrawingCanvas(int w, int h){
        this.height = h;
        this.width = w;

    }
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRoundRect(300,240,130,360,25,25);
        g2d.fillRoundRect(335,603,60,65,15,15);

        red.drawLight(g2d);
        yellow.drawLight(g2d);
        green.drawLight(g2d);

        Path2D.Double hat = new Path2D.Double();
        hat.moveTo(320,230);
        hat.lineTo(410,230);
        hat.quadTo(410.5,225.5,410,225);
        hat.curveTo(390,215,330,215,320,225);
        hat.quadTo(315.5,225.5,320,230);
        g2d.setColor(Color.DARK_GRAY);
        g2d.fill(hat);
        red.drawEar(g2d);
        yellow.drawEar(g2d);
        green.drawEar(g2d);
    }
}
