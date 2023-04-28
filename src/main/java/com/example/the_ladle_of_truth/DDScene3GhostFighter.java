/**
 * @author James Burriss
 * @date 03/07/2023
 * @purpose A Scene for Fighter Fights the Ghost.
 */


package com.example.the_ladle_of_truth;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.io.IOException;
import java.util.Objects;

public class DDScene3GhostFighter {

    // Creating Objects for the Classes

    Fighter fighter1 = new Fighter(3, 0, 2, -2, 0, -1);
    Ghost ghost = new Ghost(0,1,2,2,3,-2);
    int yourHealth = fighter1.Health();
    int enemyHealth = ghost.getHealth();

    @FXML
    private TextArea chatTextField;

    @FXML
    private ProgressBar enemyBar;

    @FXML
    private ProgressBar yourBar;

    /**
     * Action for Fight Button. Will attack and display health. For Fighter and Ghost.
     * @param event
     * @throws IOException
     */
    @FXML
    private void fightButtonPressed(ActionEvent event) throws IOException {

        double enemyPercent = ghost.getHealth();

        ghost.setHealth(ghost.getHealth() - fighter1.Attack());

        enemyPercent = (double) ghost.getHealth()/enemyPercent;

        enemyHealth = ghost.getHealth();
        enemyBar.setProgress(enemyPercent);

        if (ghost.getHealth() > 0) {
            double yourPercent = fighter1.getHealth();

            fighter1.setHealth(fighter1.getHealth() - ghost.Attack());

            yourPercent = (double) fighter1.getHealth()/yourPercent;

            yourHealth = fighter1.getHealth();
            yourBar.setProgress(yourPercent);

            if (fighter1.getHealth() <= 0) {
                switchScene("Scenes/D&D_Scene_2_Death.fxml", ((Node) event.getSource()).getScene().getWindow());
            }

        } else {
            switchScene("Scenes/D&D_Scene_4_1_Ending.fxml", ((Node) event.getSource()).getScene().getWindow());
        }
        System.out.println("your health: " + fighter1.getHealth());
        System.out.println("Enemy health: " + ghost.getHealth());
    }

    /**
     * Listener
     */
    public void initialize() {
        chatTextField.setText("A ghost seems to have been haunting the ladle!\nMaybe we can scare it?!");
    }

    /**
     * Switches Scene
     * @param scene
     * @param window
     * @throws IOException
     */
    public void switchScene(String scene, Window window) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(scene)));
        Scene nextScene = new Scene(root);
        Stage stage = (Stage) window;
        stage.setScene(nextScene);
        stage.show();
    }
}

