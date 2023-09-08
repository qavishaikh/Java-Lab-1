import javax.swing.JOptionPane;
public class Task2 {
    //Convert day to second
    public static void main(String [] args) {
        String day = JOptionPane.showInputDialog("Enter Day");
        int min = Integer.parseInt(day);
        int mins = min*24*60*60;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null,mins + "\n" + name);
        
    }
}

