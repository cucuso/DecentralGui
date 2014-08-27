/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author edennis
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private GridPane gridPane;
    @FXML
    private Button btnLogin;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void onActionLogin(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");

        Stage stage = new Stage();
        stage.setTitle("Main Menu");
        Pane myPane = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        Scene scene = new Scene(myPane);
        stage.setScene(scene);

        Stage currentStage = (Stage) btnLogin.getScene().getWindow();
        // do what you have to do
        currentStage.close();
        stage.show();
    }

}
