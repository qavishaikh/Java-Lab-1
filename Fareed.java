import javax.swing.JOptionPane;
public class Fareed {
    public static void main(String [] args) {
    //Check Even or Odd
    //int a;
    String name = "Muhammad Qavi";
    String a = JOptionPane.showInputDialog("Enter Number");
    int b = Integer.parseInt(a);
    int c = b % 2;
    if (c == 0){
        //System.out.println("The Number is Odd");
        JOptionPane.showMessageDialog(null,c + "\n" + name);
    }
    else if(c !=1){ 
        JOptionPane.showMessageDialog(null,"The Number is Even");
        JOptionPane.showMessageDialog(null,c + "\n" + name);
    }
    
     //JOptionPane.showMessageDialog(null,b + "\n" + name);
    }
}