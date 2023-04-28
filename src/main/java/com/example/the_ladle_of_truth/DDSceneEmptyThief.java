/**
 * @author James Burriss
 * @date 03/07/2023
 * @purpose A Scene for chat for the Thief.
 */

package com.example.the_ladle_of_truth;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class DDSceneEmptyThief {

    @FXML
    private GridPane sceneMove;

    @FXML
    private TextArea chatTextField;

    /**
     * Switches Scene
     * @param event
     */
    public void scene3(MouseEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scenes/D&D_Scene_3_2_Thief.fxml")));
            Scene secondScene = new Scene(root);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(secondScene);
            window.show();
        } catch (IOException error){
            error.printStackTrace();
        }
    }

    /**
     * Listener
     */
    public void initialize() {
        chatTextField.setText("You have succeeded!\nWhat will you encounter next?");
        sceneMove.setOnMouseClicked(this::scene3);
    }
}
