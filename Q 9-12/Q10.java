import java.awt.*;
import java.awt.event.*;
public class Main extends Frame implements ActionListener{
Button btnRed,btnBlue;
Main(){
btnRed=new Button("Red");
btnRed.setBounds(25,50,250,30); //position on screen
btnRed.addActionListener(this);
this.add(btnRed);  //add button into the frame
btnBlue=new Button("Blue");
btnBlue.setBounds(25,100,250,30); //position on screen
btnBlue.addActionListener(this);
this.add(btnBlue);
this.setSize(300,160);  //frame's width and height
this.setLayout(null);  //or you can use new FlowView
this.setVisible(true);
this.setTitle("Q10");
this.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
dispose();}});
}
public static void main(String[]args){
new Main();}
public void actionPerformed (ActionEvent e){
if(e.getSource()==btnRed)
{
this.setBackground(Color.RED);
}
else if(e.getSource()==btnBlue){
this.setBackground(Color.BLUE);
}
}
}
/*  <applet code="AppletProgram.class" width=400 height=400>
  </applet>*/