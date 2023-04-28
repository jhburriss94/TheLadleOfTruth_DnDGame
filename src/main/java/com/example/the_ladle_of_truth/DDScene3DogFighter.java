/**
 * @author James Burriss
 * @date 03/07/2023
 * @purpose A Scene for Fighter sneaks past the Dog or fights.
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

public class DDScene3DogFighter {

    // Creating Objects for the Classes

    Fighter fighter1 = new Fighter(3, 0, 2, -2, 0, -1);
    Dog dog = new Dog(1,1,1,-3,4,-3);
    int yourHealth = fighter1.Health();
    int enemyHealth = dog.getHealth();

    @FXML
    private TextArea chatTextField;

    @FXML
    private ProgressBar enemyBar;

    @FXML
    private ProgressBar yourBar;

    /**
     * Action for Fight Button. Will attack and display health. For Fighter and Dog.
     * @param event
     * @throws IOException
     */
    @FXML
    private void fightButtonPressed(ActionEvent event) throws IOException {

        double enemyPercent = dog.getHealth();

        dog.setHealth(dog.getHealth() - fighter1.Attack());

        enemyPercent = (double) dog.getHealth()/enemyPercent;

        enemyHealth = dog.getHealth();
        enemyBar.setProgress(enemyPercent);

        if (dog.getHealth() > 0) {
            double yourPercent = fighter1.getHealth();

            fighter1.setHealth(fighter1.getHealth() - dog.Attack());

            yourPercent = (double) fighter1.getHealth()/yourPercent;

            yourHealth = fighter1.getHealth();
            yourBar.setProgress(yourPercent);

            if (fighter1.getHealth() <= 0) {
                switchScene("Scenes/D&D_Scene_2_Death.fxml", ((Node) event.getSource()).getScene().getWindow());
            }

        } else {
            switchScene("Scenes/D&D_Scene_3_FighterEmpty.fxml", ((Node) event.getSource()).getScene().getWindow());
        }
        System.out.println("your health: " + fighter1.getHealth());
        System.out.println("Enemy health: " + dog.getHealth());
    }

    /**
     * Thief can Sneak past the Dog to avoiding fighting it.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sneakButtonPressed(ActionEvent event) throws IOException {
        int success = fighter1.Sneak();
        System.out.println(success);
        if (success >= dog.getWis() + 10) {
            switchScene("Scenes/D&D_Scene_3_FighterEmpty.fxml", ((Node) event.getSource()).getScene().getWindow());
        }
        else {
            double yourPercent = fighter1.getHealth();

            fighter1.setHealth(fighter1.getHealth() - dog.Attack());

            yourPercent = (double) fighter1.getHealth()/yourPercent;

            yourHealth = fighter1.getHealth();
            yourBar.setProgress(yourPercent);

            if (fighter1.getHealth() <= 0) {
                switchScene("Scenes/D&D_Scene_2_Death.fxml", ((Node) event.getSource()).getScene().getWindow());
            }
        }
    }

    /**
     * The Listener
     */
    public void initialize() {
        chatTextField.setText("You have encountered the guard dog!\nQuick, do something!");
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

