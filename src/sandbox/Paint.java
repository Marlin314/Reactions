package sandbox;
import graphics.*;
import java.awt.*;

public class Paint extends WinApp{
  public Paint(){super("Paint", 1000, 700);}

  @Override
  public void paintComponent(Graphics g){
    Color c = G.rndColor();
    g.setColor(c);
    g.fillOval(100,50,200,300);
    g.setColor(Color.BLACK);
    g.drawLine(100,600,600,100);
    int x = 400, y = 200; String msg = "Dude";

    FontMetrics fm = g.getFontMetrics(); 
    int a = fm.getAscent(), d = fm.getDescent();
    int w = fm.stringWidth(msg); 
    g.drawRect(x,y-a,w,a+d); // note: move y from baseline UP the page by the ascent
    
    g.drawString(msg,x,y);
    g.drawOval(x,y,3,3); // 3 is just a small number to make a small dot
  }

  public static void main(String[] args){PANEL=new Paint(); WinApp.launch();}
}
