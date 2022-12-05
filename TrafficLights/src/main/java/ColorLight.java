import java.awt.*;
import java.awt.geom.*;

public class ColorLight {
    private Color color;
    private int y;

    public ColorLight(Color color,int y) {
        this.color = color;
        this.y = y;
    }

    public void drawLight(Graphics2D g2d) {
        g2d.setColor(Color.WHITE);
        g2d.fillOval(315,y-20,100,100);
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillOval(315,y-8,100,100);
        g2d.setColor(color);
        g2d.fillOval(320,y,90,90);
    }

    public void drawEar(Graphics2D g2d) {
        int x = 440;
        int x2 = 290;
        g2d.setColor(Color.DARK_GRAY);

        Path2D.Double leftSide = new Path2D.Double();
        leftSide.moveTo(x,y+59);
        leftSide.lineTo(x,y+4);
        leftSide.quadTo(x,y-1,x+5,y-1);
        leftSide.lineTo(x+60,y-1);
        leftSide.quadTo(x+65,y-1,x+65,y+6);
        leftSide.lineTo(x+5,y+64);
        leftSide.quadTo(x,y+64,x,y+59);
        g2d.fill(leftSide);

        Path2D.Double rigthSide = new Path2D.Double();
        rigthSide.moveTo(x2,y+59);
        rigthSide.lineTo(x2,y+4);
        rigthSide.quadTo(x2,y-1,x2-5,y-1);
        rigthSide.lineTo(x2-60,y-1);
        rigthSide.quadTo(x2-65,y-1,x2-65,y+6);
        rigthSide.lineTo(x2-5,y+64);
        rigthSide.quadTo(x2,y+64,x2,y+59);
        g2d.fill(rigthSide);
    }
}
