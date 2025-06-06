
package travel.management.systemm;

import javax.swing.*;
import java.awt.*;


public class CheckPackage extends JFrame {
     
    CheckPackage() {
        setBounds(450, 200, 900, 600);
        
        String[] packageA = {"PREMIUM PACKAGE", "7 DAYS 6 NIGHTS", "TOUR MANAGER FOR TRIP", "CITY TOUR: PARIS", "TRAVEL INSURANCE", "WELCOME DRINKS ON ARRIVAL", "EXPERIENCE RIVER CRUISE", "5 STAR HOTELS" , "BOOK NOW", "SWISS PARIS TOUR", "RS 3,99,000/-","Premium.jpg"};
        String[] packageB = {"GOLD PACKAGE", "5 DAYS 4 NIGHTS", "AIRPORT ASSISTANCE", "CITY TOUR: AMSTREDAM", "MEET AND GREET AT AIRPORT", "HARD DRINKS FREE", "NIGHT SAFARI", "4 STAR HOTELS", "BOOK NOW", "PARIS LONDON TOUR", "RS 2,99,000/-", "package3.jpg"}; 
        String[] packageC = {"SILVER PACKAGE", "4 DAYS 3 NIGHTS", "RETURN AIRFARE", "CITY TOUR: SWISS", "FREE CLUBING & OTHER GAMES", "DRINKS AND BUFFET", "FAMOUS PLACES TOUR", "3 STAR HOTES", "BOOK NOW", "PARIS TOUR", "RS 1,99,000/-", "package2.jpg"};
        
        JTabbedPane tab = new JTabbedPane();
        
        JPanel p1 = createPackage(packageA);
        tab.addTab("Package A", null, p1);
        
        JPanel p2 = createPackage(packageB);
        tab.addTab("Package B", null, p2);
        
        JPanel p3 = createPackage(packageC);
        tab.addTab("Package C", null, p3);
        
        add(tab);
        
        setVisible(true);
        
    }
    
    public JPanel createPackage(String[] pack) {
           JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(40, 5 , 350, 30);
        l1.setForeground(Color.DARK_GRAY);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(l1);
        
        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30, 60 , 300, 30);
        l2.setForeground(Color.BLUE);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l2);
        
        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30, 110 , 350, 30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30, 160 , 350, 30);
        l4.setForeground(Color.BLUE);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30, 210 , 350, 30);
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l5);
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30, 260 , 350, 30);
        l6.setForeground(Color.BLUE);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l6);
        
        JLabel l7 = new JLabel( pack[6]);
        l7.setBounds(30, 310 , 350, 30);
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(30, 360 , 350, 30);
        l8.setForeground(Color.BLUE);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(60, 430 , 350, 30);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l9);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(80, 480 , 350, 30);
        l10.setForeground(Color.MAGENTA);
        l10.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(500, 480 , 350, 30);
        l11.setForeground(Color.MAGENTA);
        l11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(l11);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(350, 20, 500, 300);
        p1.add(l12);
        
        return p1;
    }
    
    
    public static void main (String []args) {
    
        new CheckPackage();
}
    
}
