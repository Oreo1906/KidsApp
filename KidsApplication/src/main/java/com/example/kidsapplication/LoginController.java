package com.example.kidsapplication;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.effect.*;
import java.io.IOException;

public class LoginController {
    @FXML
    public Button loginButton;
    @FXML
    private StackPane rootPane;
    @FXML
    public VBox loginBox, createAccountBox;
    @FXML
    private TextField usernameField, newUsernameField, nameField, middlenameField, surnameField, ageField, contactNumberField;
    @FXML
    private PasswordField passwordField, newPasswordField;
    @FXML
    private Label statusLabel, accountStatusLabel;
    @FXML
    public Button createAccountButton, backlogin;

    @FXML
    private void initialize() {
        setupAnimations();
        setupButtonEffects();
    }

    private void setupAnimations() {
        // Initial fade-in animation for login box
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), loginBox);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.play();

        // Add entrance animation for create account box
        createAccountBox.setOpacity(0);
        createAccountBox.setTranslateX(50);
    }

    private void setupButtonEffects() {
        // Setup effects for login button
        setupButtonEffect(loginButton, "#FF6B6B", "#FF8585");

        // Setup effects for create account button
        setupButtonEffect(createAccountButton, "#FF6B6B", "#FF8585");

        // Setup effects for back button
        setupButtonEffect(backlogin, "#FFE5E5", "#FFF0F0");
    }

    private void setupButtonEffect(Button button, String baseColor, String hoverColor) {
        // Initial style
        String baseStyle = String.format(
                "-fx-background-color: %s; -fx-text-fill: %s; -fx-font-size: 18px; " +
                        "-fx-font-weight: bold; -fx-background-radius: 20; -fx-padding: 15 30; " +
                        "-fx-effect: dropshadow(gaussian, %s, 5, 0, 0, 0);",
                baseColor, baseColor.equals("#FF6B6B") ? "white" : "#FF6B6B", baseColor
        );
        button.setStyle(baseStyle);

        // Hover effect
        button.setOnMouseEntered(e -> {
            button.setStyle(String.format(
                    "-fx-background-color: %s; -fx-text-fill: %s; -fx-font-size: 18px; " +
                            "-fx-font-weight: bold; -fx-background-radius: 20; -fx-padding: 15 30; " +
                            "-fx-effect: dropshadow(gaussian, %s, 8, 0, 0, 0);",
                    hoverColor, hoverColor.equals("#FF6B6B") ? "white" : "#FF6B6B", hoverColor
            ));

            // Scale up animation
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), button);
            scale.setToX(1.05);
            scale.setToY(1.05);
            scale.play();
        });

        // Mouse exit effect
        button.setOnMouseExited(e -> {
            button.setStyle(baseStyle);

            // Scale down animation
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), button);
            scale.setToX(1.0);
            scale.setToY(1.0);
            scale.play();
        });

        // Click effect
        button.setOnMousePressed(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.1), button);
            scale.setToX(0.95);
            scale.setToY(0.95);
            scale.play();
        });

        button.setOnMouseReleased(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.1), button);
            scale.setToX(1.0);
            scale.setToY(1.0);
            scale.play();
        });
    }

    @FXML
    private void showCreateAccount() {
        // Fade out login box
        FadeTransition fadeOut = new FadeTransition(Duration.seconds(0.3), loginBox);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);
        fadeOut.setOnFinished(e -> {
            loginBox.setVisible(false);
            loginBox.setManaged(false);

            // Show and animate create account box
            createAccountBox.setVisible(true);
            createAccountBox.setManaged(true);

            // Slide in animation
            TranslateTransition slideIn = new TranslateTransition(Duration.seconds(0.5), createAccountBox);
            slideIn.setFromX(50);
            slideIn.setToX(0);

            // Fade in animation
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), createAccountBox);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);

            // Play both animations
            slideIn.play();
            fadeIn.play();
        });
        fadeOut.play();
    }

    @FXML
    private void showLogin() {
        // Fade out create account box
        FadeTransition fadeOut = new FadeTransition(Duration.seconds(0.3), createAccountBox);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);
        fadeOut.setOnFinished(e -> {
            createAccountBox.setVisible(false);
            createAccountBox.setManaged(false);

            // Show and animate login box
            loginBox.setVisible(true);
            loginBox.setManaged(true);

            // Slide in animation
            TranslateTransition slideIn = new TranslateTransition(Duration.seconds(0.5), loginBox);
            slideIn.setFromX(-50);
            slideIn.setToX(0);

            // Fade in animation
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), loginBox);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);

            // Play both animations
            slideIn.play();
            fadeIn.play();
        });
        fadeOut.play();
    }

    @FXML
    public void handleLoginAction() throws IOException {
        // Add button press animation
        ScaleTransition scale = new ScaleTransition(Duration.seconds(0.1), loginButton);
        scale.setToX(0.95);
        scale.setToY(0.95);
        scale.setOnFinished(e -> {
            try {
                // Close the current login window
                Stage currentStage = (Stage) loginButton.getScene().getWindow();
                currentStage.close();

                // Load the new StudentDashboard.fxml file
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("KidsApplication.fxml"));
                Parent root = fxmlLoader.load();

                // Create a new stage and show the student dashboard
                Stage newStage = new Stage();
                newStage.setTitle("KIDS APP");
                newStage.setScene(new Scene(root, 450, 830));
                newStage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        scale.play();
    }

    @FXML
    private void handleCreateAccountAction() {
        // Add button press animation
        ScaleTransition scale = new ScaleTransition(Duration.seconds(0.1), createAccountButton);
        scale.setToX(0.95);
        scale.setToY(0.95);
        scale.setOnFinished(e -> {
            String newUsername = newUsernameField.getText();
            String newPassword = newPasswordField.getText();

            if (newUsername.isEmpty() || newPassword.isEmpty()) {
                showStatusMessage(accountStatusLabel, "All fields are required.", "#f44336");
            } else {
                showStatusMessage(accountStatusLabel, "Account created successfully!", "#4CAF50");
                // Add delay before switching back to login
                new Timeline(new KeyFrame(Duration.seconds(1.5), event -> showLogin())).play();
            }
        });
        scale.play();
    }

    private void showStatusMessage(Label label, String message, String color) {
        label.setText(message);
        label.setStyle("-fx-text-fill: " + color + "; -fx-font-size: 16px; -fx-font-weight: bold;");
        label.setVisible(true);

        // Add fade animation
        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), label);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();

        // Add scale animation
        ScaleTransition scale = new ScaleTransition(Duration.seconds(0.3), label);
        scale.setFromX(1.0);
        scale.setFromY(1.0);
        scale.setToX(1.1);
        scale.setToY(1.1);
        scale.setAutoReverse(true);
        scale.setCycleCount(2);
        scale.play();
    }
}