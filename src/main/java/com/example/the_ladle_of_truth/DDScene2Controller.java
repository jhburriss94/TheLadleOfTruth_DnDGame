/**
 * @author James Burriss
 * @date 03/07/2023
 * @purpose Scene for choosing your Character.
 */

package com.example.the_ladle_of_truth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextArea;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
public class DDScene2Controller {

    // Characters for Image
    @FXML
    private ImageView fighterSelect;

    @FXML
    private ImageView thiefSelect;

    /**
     * Selecting Fighter goes to the next Scene for the Fighter.
     * @param event
     * @throws IOException
     */
    public void fighterClicked(MouseEvent event) throws IOException {
        switchScene("Scenes/D&D_Scene_1_1_Fighter.fxml", event);
    }

    /**
     * Selecting Thief goes to the next Scene for the Thief.
     * @param event
     * @throws IOException
     */
    public void thiefClicked(MouseEvent event) throws IOException {
        switchScene("Scenes/D&D_Scene_1_1_Thief.fxml", event);
    }

    /**
     * Switches Scene
     * @param scene
     * @param event
     * @throws IOException
     */
    public void switchScene(String scene, MouseEvent event) throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(scene)));
        Scene nextScene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(nextScene);
        window.show();
    }

}



