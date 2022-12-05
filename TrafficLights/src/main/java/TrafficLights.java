import javax.swing.*;

public class TrafficLights {
    public static void main(String[] args) {
        int w = 600;
        int h = 600;
        JFrame f = new JFrame();
        DrawingCanvas dc = new DrawingCanvas(w,h);
        f.setSize(w,h);
        f.setTitle("Светофор");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
