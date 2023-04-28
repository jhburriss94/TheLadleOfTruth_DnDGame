/**
 * @author James Burriss
 * @date 03/07/2023
 * @purpose Scene for Intro.
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

public class DDScene1Controller {

    @FXML
    private Pane sceneMove;

    /**
     * Clicking on Pane moves the Scene.
     * @param event
     */
    public void scene2(MouseEvent event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scenes/D&D_Scene_1_1_Characters.fxml")));
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
        sceneMove.setOnMouseClicked(this::scene2);
    }
}
