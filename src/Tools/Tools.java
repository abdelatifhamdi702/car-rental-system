package Tools;


import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tools{
    public static void OpenForm(JFrame f){
        try {
            f.setLocationRelativeTo(null);
            Image img = ImageIO.read(Tools.class.getResource("emp.jpg"));
            f.setIconImage(img);
            f.getContentPane().setBackground(Color.white);
            f.setDefaultCloseOperation(2);
            f.setVisible(true);
        } catch (IOException ex) {
            Message(ex);
        }}
    public static boolean ConfirmMessage(String message){
        int c = JOptionPane.showConfirmDialog(null, message);
        return c==JOptionPane.YES_OPTION;
}

    
    public static void Message(Object msg){  
        javax.swing.JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void Write(Object out){  
    System.out .println(out);
    }
    
    public static int ReadInt (){                  
      Scanner s = new Scanner(System.in);
                return s.nextInt();
    }
    public static Boolean ReadBoolean (){                  
      Scanner s = new Scanner(System.in);
                return s.nextBoolean();
    }
    public static double ReadDouble (){                  
      Scanner s = new Scanner(System.in);
                return s.nextDouble();
    }
    public static String ReadString (){                  
      Scanner s = new Scanner(System.in);
                return s.nextLine();
    }
    
    public static void ClearTexts(Container form){
    for(Component c : form.getComponents()){
        if ( c instanceof JTextField){
            JTextField txt =(JTextField)c;
        txt.setText("");
        }
        else if (c instanceof Container){
        ClearTexts((Container)c);
        }}}
    public static void Capture(String ImageName , JFrame form){
        try {
            form.setState(1);
            Robot r = new Robot();
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(ImageName +".jpg")); 
            form.setState(0);
        } catch (AWTException | HeadlessException | IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Object InputBox(String Title){
    Object obj = JOptionPane.showInputDialog(Title);
    return obj;
    }
    
        public class Table{
        
            public int NbrColumn;
            public Object[][] Items;
            
            public Table(int NbrColumn){
            this.NbrColumn=NbrColumn;
            Items = new Object[0][NbrColumn];
            }
            
            public void AddNewRow(Object[] row){
            Object[][] ItemsTap = Items;                
            Items = new Object [Items.length+1][NbrColumn];
            for (int i = 0 ; i<ItemsTap.length;i++){
            Items[i]=ItemsTap[i];
            }
            Items[Items.length-1]=row;
            }
            
            public void PrintItems(){
            for ( Object[] c : Items){
                for (Object obj : c){
                    System.out.print(obj+" ; ");
                }
                System.out.println();
                }}
            
            
            }
        
        
        
        }