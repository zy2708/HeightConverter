import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;
import java.util.Optional;


public class JavaFXDemo extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        double screenWidth = primaryScreenBounds.getWidth();
        double screenHeight = primaryScreenBounds.getHeight();

        TextInputDialog textInputDialog = new TextInputDialog("180");

        double InputdialogWidth = textInputDialog.getDialogPane().getWidth();

        textInputDialog.setTitle("Height Converter");
        textInputDialog.setHeaderText("Centimeters to Feet and Inches Converter");
        textInputDialog.setContentText("Your height in centimeters is");
        textInputDialog.setX(screenWidth/2-InputdialogWidth/2);
        textInputDialog.setY(0);
        Optional<String> heightInput= textInputDialog.showAndWait();

        String height=heightInput.get();
        double heightInCm=Double.parseDouble(height);
        double heightInInch=heightInCm*0.39;
        int heightInFeet=(int)heightInInch/12;
        int heightRemainderInInches=(int)heightInInch%12;

        Alert alert =new Alert (AlertType.INFORMATION);
        alert.setTitle("Height Converter");
        alert.setHeaderText("Centimeters to Feet and Inches Converter");
        alert.setContentText("Your height in feet and inchs is"+heightInFeet+" feet "+heightRemainderInInches+" inches.");
        double dialogWidth = alert.getDialogPane().getWidth();
        double dialogHeight= alert.getDialogPane().getHeight();

        alert.setX(screenWidth/2-dialogWidth/2);
        alert.setY(screenHeight-dialogHeight);
        alert.show();


    }
    public static void main(String []args){
        launch (args);
    }



}
