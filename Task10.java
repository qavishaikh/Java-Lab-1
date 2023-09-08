import javax.swing.JOptionPane;
public class Task10 {
    //Convert Gram to Kilo
    public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Gram");
        int gram = Integer.parseInt(day);
        double grams = gram/1000;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,grams + "\n" + name);
        
    }
}
