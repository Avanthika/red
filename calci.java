import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=calci width=500 height=500></applet>*/
public class calci extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
public void init()
{
setLayout(new GridLayout(5,2));
l1=new Label("Enter First Number:");
l2=new Label("Enter Second Number:");
l3=new Label("Result:");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("ADD");
b2=new Button("SUBTRACT");
b3=new Button("MULTIPLY");
b4=new Button("DIVISION");
add(l1);
add(l2);
add(l3);
add(t1);
add(t2);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
int k;
if(e.getSource()==b1)
{
k=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
}
else if(e.getSource()==b2)
{
k=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
}
else if(e.getSource()==b3)
{
k=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
}
else
{
k=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
}
t3.setText(String.valueOf(k));
}
}