import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.event.*;
import java.text.NumberFormat;
/**
 This class represents a
 text cipher GUI to encrypt 
 messages.
 @author Ayush Ahir
*/
public class TextCipher extends Application{

   private Text message;
   private TextField m1;
   private Button encrypt;
   private Text welcome;
   private String output;
   
   
   public void start(Stage primaryStage){
   primaryStage.setTitle("Cipher Generator");
   
   message = new Text("Input message:");
   
   output = "";
   
   m1 = new TextField();
   m1.setPrefWidth(220);
   
   encrypt = new Button("Encrypt");
   encrypt.setOnAction(this::encryptMessage);
   
   welcome = new Text("Welcome to the Encryption Tool!");
   
   FlowPane text = new FlowPane(message, m1, encrypt, welcome);
   
   text.setAlignment(Pos.CENTER);
   text.setVgap(23);
   text.setHgap(70);
   
   Scene scene = new Scene(text, 270, 280);
   
   primaryStage.setScene(scene);
   primaryStage.show();
   
   }
   
   public void encryptMessage(ActionEvent e){
      String word = m1.getText();
      for(int i = 0; i < word.length(); i++){
         char val = word.charAt(i);
         if(val >= 'A' && val<= 'L'){
            output += (char)(val+32);
         }
         else if(val >= 'N' && val <= 'Z'){
            output += "$" + (val - 'N');
         }
         else if(val >= 'a' && val <= 'm'){
            int remainder = val % 3;
            if(remainder == 0){
               output += "*";
            }
            else if(remainder == 1){
               output += "^";
            }
            else if(remainder == 2){
               output += "#";
            }
         }
         else if(val >= 'n' && val <= 'z') {
                char temp = (char) (val + word.length());

                if(temp > 'z') {
                    temp -= 26;
                }
                output += temp;
            }
         else{
            output += val;
         }
      }
      welcome.setText(output); 
   }
}
