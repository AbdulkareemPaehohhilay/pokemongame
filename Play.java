import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Play extends JFrame {
    private JTextField jtf;
    private String name;
    private int Level;
    private int HP;
    private int HPmon;
    private int HPmont;
    private int HPmontest;
    private int Atk;
    private int Atkmon;
    private String swordWeapon;
    private int amount;
    private int food;
    private int Levelmon;

    public Play() {
        super( "PokemonGame" );
        Level = 1;
        amount = 0;
        food = 0;
        Atk = 100;
        HP = 100;
        Levelmon = 1;
        Container c = getContentPane();
        Icon icon = new ImageIcon("b1.png");
        c.setLayout( new FlowLayout() );
        JLabel j = new JLabel("Welcome to Trainer Pokemon");
        JLabel i = new JLabel(icon);
        // label and text entry field
        JLabel jl = new JLabel("Name (Please Enter) :");
        jtf  = new JTextField(20);   // 25 chars wide
        c.add( j );
        c.add( i );
        c.add( jl );
        c.add( jtf );
        // Handle events from pressing return
        jtf.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("Name : " + e.getActionCommand() );
                name = e.getActionCommand();
                jtf.setText("");
            }
        } );
		
		
		// Radio Button
		final JRadioButton radio1 = new JRadioButton("Pikachu");
		radio1.setBounds(119, 58, 109, 23);
		getContentPane().add(radio1);
		
		final JRadioButton radio2 = new JRadioButton("Kabigon");
		radio2.setBounds(119, 84, 109, 23);
		getContentPane().add(radio2);
		
		final JRadioButton radio3 = new JRadioButton("Charmander");
		radio3.setBounds(119, 110, 109, 23);
		getContentPane().add(radio3);
		
		// Set Group
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
        group.add(radio2);
        group.add(radio3);
		
        // Button
		JButton btn = new JButton("My Status");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Choos Class
				if(radio1.isSelected()){
                    
                    final ImageIcon icon = new ImageIcon(getClass().getResource("pikachu.png"));
                    JOptionPane.showMessageDialog(null,"Name : "+name+"\nYourLevel : "+Level+"\nmana : "+food+"\nAttack : "+Atk+"\nHP : "+HP+"\nMy kill amount : "+amount,"My character",JOptionPane.INFORMATION_MESSAGE,icon);
				} else if (radio2.isSelected()) {
                    
                    final ImageIcon icon = new ImageIcon(getClass().getResource("kabigon.png"));
                    JOptionPane.showMessageDialog(null,"Name : "+name+"\nYourLevel : "+Level+"\nmana : "+food+"\nAttack : "+Atk+"\nHP : "+HP+"\nMy kill amount : "+amount,"My character",JOptionPane.INFORMATION_MESSAGE,icon);
				} else if (radio3.isSelected()) {
                    
                    final ImageIcon icon = new ImageIcon(getClass().getResource("charmander.png"));
                    JOptionPane.showMessageDialog(null,"Name : "+name+"\nYourLevel : "+Level+"\nmana : "+food+"\nAttack : "+Atk+"\nHP : "+HP+"\nMy kill amount : "+amount,"My character",JOptionPane.INFORMATION_MESSAGE,icon);
				} else {
					JOptionPane.showMessageDialog(null,
							"You not select.");	
				}
				
			}
        });
		btn.setBounds(125, 154, 89, 23);
        getContentPane().add(btn);	
        
        // Status Monster
        JLabel monster = new JLabel("\nMonster            ");
        c.add(monster);
        Icon monster1 = new ImageIcon("mewtwo.png");
        JLabel mon = new JLabel(monster1);
        c.add(mon);

        Atkmon = 50;
        HPmon = 50;
        HPmontest = HPmon;

        // Radio Button
        JLabel battle = new JLabel("           Battle : ");
        c.add(battle);
        
        // battle
        // Button
        JButton bat = new JButton("Attack");
        c.add(bat);
		bat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                HPmont = HPmon - Atk;
                HP -= Atkmon;
                if(radio1.isSelected()){
                    if(HPmont <= 0&&HP>0){
                        Level++;
                        Atk += 10;
                        HP +=10;
                        amount++;
                        food +=1;
                        HPmontest += 20;
                        Atkmon += 20;
                        Levelmon++;
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("pikachu.gif"));
                        JOptionPane.showMessageDialog(null,"You Win!!!\nMy status\nLevel : "+Level+"\nYou got mana : "+food+"\nAttack : "+Atk+"\nHP : "+HP+"\nAmount : "+amount,"Battel",JOptionPane.INFORMATION_MESSAGE,ibat);	
                    }
                    else if(HP <= 0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("pikachu.gif"));
                        JOptionPane.showMessageDialog(null,"You Lose!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                    else if(HP>0&&HPmont>0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("pikachu.gif"));
                        JOptionPane.showMessageDialog(null,"Draw!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                }
                if(radio2.isSelected()){
                    if(HPmont <= 0&&HP>0){
                        Level++;
                        Atk += 10;
                        HP +=10;
                        amount++;
                        food +=1;
                        HPmontest += 20;
                        Atkmon += 20;
                        Levelmon++;
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("kabigon.gif"));
                        JOptionPane.showMessageDialog(null,"You Win!!!\nMy status\nLevel : "+Level+"\nYou got mana : "+food+"\nAttack : "+Atk+"\nHP : "+HP+"\nAmount : "+amount,"Battel",JOptionPane.INFORMATION_MESSAGE,ibat);	
                    }
                    else if(HP <= 0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("kabigon.gif"));
                        JOptionPane.showMessageDialog(null,"You Lose!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                    else if(HP>0&&HPmont>0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("kabigon.gif"));
                        JOptionPane.showMessageDialog(null,"Draw!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                }
                if(radio3.isSelected()){
                    if(HPmont <= 0&&HP>0){
                        Level++;
                        Atk += 10;
                        HP +=10;
                        amount++;
                        food +=1;
                        HPmontest += 20;
                        Atkmon += 20;
                        Levelmon++;
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("charmander.gif"));
                        JOptionPane.showMessageDialog(null,"You Win!!!\nMy status\nLevel : "+Level+"\nYou got mana : "+food+"\nAttack : "+Atk+"\nHP : "+HP+"\nAmount : "+amount,"Battel",JOptionPane.INFORMATION_MESSAGE,ibat);	
                    }
                    else if(HP <= 0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("charmander.gif"));
                        JOptionPane.showMessageDialog(null,"You Lose!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                    else if(HP>0&&HPmont>0){
                        final ImageIcon ibat = new ImageIcon(getClass().getResource("charmander.gif"));
                        JOptionPane.showMessageDialog(null,"Draw!!!","Battel",JOptionPane.INFORMATION_MESSAGE,ibat);
                    }
                }
                
            }
        } 
        ); 

        JButton it = new JButton("Givefood");
        c.add(it);
		it.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent i) {
                if(food>0){
                    food--;
                    HP += 100;
                    JOptionPane.showMessageDialog(null,"Give food HP+100 success");
                }
                else if(food<0){
                    JOptionPane.showMessageDialog(null,"You don't have mana!!!");

                }
            }
        }
        );
        JButton stm = new JButton("Status Monster");
        c.add(stm);
		stm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent st) {
                JOptionPane.showMessageDialog(null,"Name : Mewtwo\nLevel : "+Levelmon+"\nAttack : "+Atkmon+"\nHP : "+HPmontest);
            }
        }
        );

        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Project\\Project Java\\GUI\\b1.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380,900);
        setVisible(true);
    }
   
}
    

