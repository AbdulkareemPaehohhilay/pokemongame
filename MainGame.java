import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainGame extends JFrame{
    

    public MainGame(){
    super("Pokemon Game");
    

    
    Container c = getContentPane();
    

    c.setLayout(new FlowLayout());

    ImageIcon image1 = new ImageIcon("b11.jpg");
    JLabel bk = new JLabel(image1);
    
    c.add(bk);

    bk.setLayout(new FlowLayout());
    //bk.setLocation(123, 123);

    JButton cp = new JButton( "Play");
    cp.setBounds(111, 74, 128, 233);
    bk.add(cp);

    
    

     

   




   cp.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
        Play play = new Play();
       }
   });

   
    

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1280, 800);
    setLocationRelativeTo(null);
    setVisible(true);
    setResizable(false);


    }

}

