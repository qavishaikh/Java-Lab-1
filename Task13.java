import javax.swing.JOptionPane;
public class Task13 {
    //Convert Marksheet
    public static void main(String [] args) {
        String sub1 = JOptionPane.showInputDialog("Enter English Marks");
        String sub2 = JOptionPane.showInputDialog("Enter Urdu Marks");
        String sub3 = JOptionPane.showInputDialog("Enter Math Marks");
        String sub4 = JOptionPane.showInputDialog("Enter Java Marks");
        String sub5 = JOptionPane.showInputDialog("Enter ICT Marks");
        int English = Integer.parseInt(sub1);
        int Urdu = Integer.parseInt(sub1);
        int Math = Integer.parseInt(sub1);
        int Java = Integer.parseInt(sub2);
        int ICT = Integer.parseInt(sub2);
        int total = 500;
        int obtain_marks = English + Urdu + Math + Java + ICT;
        double Percentage = (obtain_marks*100)/total;
        String name = "Muhammad Qavi";
        JOptionPane.showMessageDialog(null, "Obtain Marks = " + obtain_marks + "\n" + "Percentage = "  + Percentage + "\n" + "Created By = " + name);
        
    }
}
