/**
 * @author James Burriss
 * @date 03/07/2023
 * @purpose Ending Scene for Winning.
 */

package com.example.the_ladle_of_truth;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class DDSceneEnd {

    @FXML
    private Pane sceneMove;


    /**
     * Event for Clicking
     * @param event
     */
    public void scene1(MouseEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scenes/D&D_Scene_1_1_Start.fxml")));
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
        sceneMove.setOnMouseClicked(this::scene1);
    }
}
