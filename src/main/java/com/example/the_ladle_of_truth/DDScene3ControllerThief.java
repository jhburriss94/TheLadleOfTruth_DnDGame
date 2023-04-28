/**
 * @author James Burriss
 * @date 03/07/2023
 * @purpose A Scene for the Thief to Choose a Path to travel.
 */

package com.example.the_ladle_of_truth;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class DDScene3ControllerThief {

    // Text Field

    @FXML
    private TextArea chatTextField;

    /**
     * Listener
     */
    public void initialize() {
        chatTextField.setText("You have broken in the house to Find the Ladle!\nFinally, " +
                "after all this time. You are unsure where\nto go. Select a path, but be weary the guards\ncould be near.");
    }

    /**
     * Left Area
     * @param event
     * @throws IOException
     */
    public void leftButtonClicked(MouseEvent event) throws IOException {
        switchScene("Scenes/D&D_Scene_2_1_Thief.fxml", event);
    }

    /**
     * Right Area
     * @param event
     * @throws IOException
     */
    public void rightButtonClicked(MouseEvent event) throws IOException {
        switchScene("Scenes/D&D_Scene_3_1_Thief.fxml", event);
    }

    /**
     * Switches Scene
     * @param scene
     * @param event
     * @throws IOException
     */
    public void switchScene(String scene, MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(scene)));
        Scene nextScene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(nextScene);
        window.show();
    }
}
