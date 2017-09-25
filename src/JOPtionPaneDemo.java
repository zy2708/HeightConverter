import javax.swing.*;

public class JOptionPaneDemo
{
    public static void main(String[]args)
    {

        JOptionPane inputpane =new JOptionPane("Enter your height in centimeters");
        inputpane.setWantsInput(true);
        JDialog inputdialog=new JDialog();
        inputdialog=inputpane.createDialog("Height Converter");
        int inputdialogheight=inputdialog.getHeight();
        inputdialog.setLocation(0,450-inputdialogheight/2);
        inputdialog.setVisible(true);
        String inputvalue=(String)inputpane.getInputValue();
        double HeightInCm=Double.parseDouble(inputvalue);
        double HeightInInch=HeightInCm*0.39;
        int HeightInFeet=(int)HeightInInch/12;
        int HeightRemainderInInches=(int)HeightInInch%12;
        JOptionPane outputpane=new JOptionPane("Your height is "+HeightInFeet+" feet "+HeightRemainderInInches+" inches ");
        JDialog outputdialog = new JDialog();
        outputdialog=outputpane.createDialog("Height Converter");
        int outputdialogheight=outputdialog.getHeight();
        int outputdialogwidth=outputdialog.getWidth();
        outputdialog.setLocation(1440-outputdialogwidth,450-outputdialogheight);
        outputdialog.setVisible(true);


    }

}
