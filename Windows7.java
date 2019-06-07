import java.awt.*;
import java.awt.event.*;

class Windows7{
    public static void main (String args[]){
        Frame win = new Frame();
        Button b1 = new Button("button 1");
        Button b2 = new Button("button 2");
        Button b3 = new Button("button 3");
        Button b4 = new Button("button 4");
        Button b5 = new Button("button 5");
        win.add(b1,BorderLayout.NORTH);
        win.add(b2,BorderLayout.EAST);
        win.add(b3,BorderLayout.SOUTH);
        win.add(b4,BorderLayout.WEST);
        win.add(b5);
        Action1 e = new Action1();
        b1.addActionListener(e);
        win.setSize(600,400);
        win.setVisible(true);
    }
}

class Action1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("You pressed button1!!");
    }
}