import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;


public class MethodAndRecursion extends Application {

   @Override
   public void start(Stage stage) {
    Label inputLabel = new Label("Masukkan Angka : ");
    TextField inputField = new TextField();
    inputField.setAlignment(Pos.CENTER);
    Button submitButton = new Button("Submit");
    Label outputLabel = new Label();

    submitButton.setOnAction(e -> {
        int angka = Integer.parseInt(inputField.getText());
        int hasil = hitungFaktorial(angka);
        outputLabel.setText("Hasil Faktorial dari " + angka + " adalah : " + hasil);
    });

    VBox layout = new VBox(10, inputLabel, inputField, submitButton, outputLabel);
    layout.setAlignment(Pos.CENTER);
    layout.setPadding(new Insets(20));

    Scene scene = new Scene(layout, 300, 250);
    stage.setTitle("Faktorial dengan Rekursi");
    stage.setScene(scene);
    stage.show();
   }

   private int hitungFaktorial(int n) { 
    if (n <= 1) {
        return 1;
    }
    return n * hitungFaktorial(n - 1);
   }
   public static void main(String[] args) {
         launch(args);
   }
}