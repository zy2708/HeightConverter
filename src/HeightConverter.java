import javax.swing.JOptionPane;


public class HeightConverter
{
    public static void main(String []args)
    {
        String inputvalue=JOptionPane.showInputDialog("Enter your height in centimeters");
        double HeightInCm=Double.parseDouble(inputvalue);
        double HeightInInch=HeightInCm*0.39;
        int HeightInFeet=(int)HeightInInch/12;
        int HeightRemainderInInches=(int)HeightInInch%12;
        JOptionPane.showMessageDialog(null,"Your height is "+HeightInFeet+" feet "+HeightRemainderInInches+" inches.");

    }
}
