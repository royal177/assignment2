import java.applet.*;

import java.awt.*;

public class Rect extends Applet

{


public void paint(Graphics g)

{

 g.setColor(Color.orange);

 g.fillRect(120,70,100,50);

 g.setColor(Color.black);
 
g.drawRect(320,70,100,50);

}

}

/*<Applet code = "Rect.class" width=600 Height=500>
</Applet>
*/




