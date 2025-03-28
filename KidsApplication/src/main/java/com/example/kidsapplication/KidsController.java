package com.example.kidsapplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.*;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.scene.effect.*;
import javafx.scene.shape.Circle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.animation.ScaleTransition;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.util.Duration;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.ColorAdjust;
import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyEvent;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import java.io.*;
import javafx.scene.control.ScrollPane;
import java.time.LocalDate;
import javafx.scene.control.ProgressBar;


public class KidsController {
    @FXML
    public Button PLAYTALES ;

    public TextArea readingTextArea;
    @FXML
    public VBox readingTextAreaContainerUpdated;
    @FXML
    public VBox fillInTheBlanksSectionUpdated;
    @FXML
    public TextArea readingTextAreaUpdated;
    @FXML
    public VBox achievementsPane;
    @FXML
    public Button leagueButton1;
    @FXML
    public Button achievementsButton;
    @FXML
    public Button ages5to8;
    @FXML
    public Button ages9to12;
    @FXML
    public VBox questionBox1;
    @FXML
    public ImageView imageTales;
    @FXML
    public VBox talesSection;
    @FXML
    public VBox patternExplorerSection;


    @FXML
    private Label welcomeText;

    @FXML
    private Button homeButton, leagueButton, helpButton, chatButton, profileButton;

    @FXML
    private ImageView imageView;

    @FXML
    private ImageView imageMaths1;

    @FXML
    private ImageView image2048;

    @FXML
    private ImageView imageReading;

    @FXML
    private Button PLAYR;

    @FXML
    private Button PLAYRIDDLE;

    @FXML
    private Button PLAY2048;

    @FXML
    private Button PLAYMATHS;

    @FXML
    private ImageView logoImageView;

    @FXML
    private VBox homePane;

    @FXML
    private VBox leaguePane;

    @FXML
    private VBox helpPane;

    @FXML
    private VBox chatPane;

    @FXML
    private VBox profilePane;
    @FXML
    private VBox easySection, hardSection;
    @FXML
    private Button backToHomeBtn, backToMathsFromEasy, backToMathsFromHard;
    @FXML
    private VBox riddleSection;
    @FXML
    private VBox game2048Section;
    @FXML
    private VBox mathsSection;
    @FXML
    private VBox readingSection;
    @FXML
    private Button easyBtn, hardBtn;
    @FXML
    private ImageView profileImage;
    @FXML
    private Label nameLabel, surnameLabel, usernameLabel, genderLabel;
    @FXML
    private Label favSubjectsField;

    @FXML
    public void initialize() {
        setButtonIcon(homeButton, "home.png");
        setButtonIcon(leagueButton, "league.png");
        setButtonIcon(helpButton, "help.png");
        setButtonIcon(chatButton, "chat.png");
        setButtonIcon(profileButton, "logo.jpg");
        nameLabel.setText("John");
        surnameLabel.setText("Doe");
        usernameLabel.setText("john_doe");
        genderLabel.setText("Male");
//        addButtonAnimation(PLAYR);
//        addButtonAnimation(PLAYRIDDLE);
//        addButtonAnimation(PLAY2048);
//        addButtonAnimation(PLAYMATHS);
//        setupGameButton(PLAYMATHS, "#D742A8");
//        setupGameButton(PLAYRIDDLE, "#0099ff");
//        setupGameButton(PLAY2048, "#ffcc33");
//        setupGameButton(PLAYR, "#00cc99");
        addZoomEffect(PLAYR);
        addZoomEffect(PLAYRIDDLE);
        addZoomEffect(PLAYMATHS);
        addZoomEffect(PLAY2048);
        addZoomEffect(PLAYTALES);
        setupAnimations();
        // Setup image hover effects
        setupImageHoverEffect(imageMaths1);
        setupImageHoverEffect(imageView);
        setupImageHoverEffect(image2048);
        setupImageHoverEffect(imageReading);
        setupImageHoverEffect(imageTales);
        showHome();
        setupGlowEffect(easyBtn,"#4CAF50","#4CAF50"); // Lighter green on hover
        setupGlowEffect(hardBtn,"#D32F2F","#D32F2F");
        setupGlowEffect(ages5to8,"#ffcc66","#ffcc66");
        setupGlowEffect(ages9to12,"#66ccff","#66ccff");
        applyShadowAnimation(homeButton, true);
        setupScrollPane();

        Image logoImage = new Image(getClass().getResource("logo.jpg").toExternalForm());
        logoImageView.setImage(logoImage);
        Image defaultImage = new Image(getClass().getResource("logo.jpg").toExternalForm());
        profileImage.setImage(defaultImage);
        // Set circular clip
        Circle clip3 = new Circle(logoImageView.getFitWidth() / 2, logoImageView.getFitHeight() / 2, 20);
        logoImageView.setClip(clip3);
        Circle clip4 = new Circle(profileImage.getFitWidth() / 2, profileImage.getFitHeight() / 2, 50);
        profileImage.setClip(clip4);
        imageView.setImage(new Image(getClass().getResource("riddles1.png").toExternalForm()));

        // Apply circular clipping
        Circle clip = new Circle(40); // Radius = Half of fitHeight/fitWidth
        clip.setCenterX(40);
        clip.setCenterY(40);
        imageView.setClip(clip);

        image2048.setImage(new Image(getClass().getResource("2048.jpg").toExternalForm()));

        // Apply circular clipping
        Circle clip1 = new Circle(40); // Radius = Half of fitHeight/fitWidth
        clip1.setCenterX(40);
        clip1.setCenterY(40);
        image2048.setClip(clip1);

        imageMaths1.setImage(new Image(getClass().getResource("MATHS1.jpg").toExternalForm()));

        // Apply circular clipping
        Circle clip5 = new Circle(40); // Radius = Half of fitHeight/fitWidth
        clip5.setCenterX(40);
        clip5.setCenterY(40);
        imageMaths1.setClip(clip5);

        imageReading.setImage(new Image(getClass().getResource("reading.jpg").toExternalForm()));

        // Apply circular clipping
        Circle clip2 = new Circle(40); // Radius = Half of fitHeight/fitWidth
        clip2.setCenterX(40);
        clip2.setCenterY(40);
        imageReading.setClip(clip2);

        imageTales.setImage(new Image(getClass().getResource("tales.png").toExternalForm()));

        // Apply circular clipping
        Circle clip6 = new Circle(40); // Radius = Half of fitHeight/fitWidth
        clip6.setCenterX(40);
        clip6.setCenterY(40);
        imageTales.setClip(clip6);

    }
    private void addZoomEffect(Button button) {
        if (button != null) {
            // Zoom in effect on mouse enter
            button.setOnMouseEntered(e -> {
                ScaleTransition zoomIn = new ScaleTransition(Duration.millis(200), button);
                zoomIn.setToX(1.1);
                zoomIn.setToY(1.1);
                zoomIn.play();
            });

            // Zoom out effect on mouse exit
            button.setOnMouseExited(e -> {
                ScaleTransition zoomOut = new ScaleTransition(Duration.millis(200), button);
                zoomOut.setToX(1.0);
                zoomOut.setToY(1.0);
                zoomOut.play();
            });
        }
    }
    @FXML
    public ScrollPane gamesScrollPane;

    private void setupScrollPane() {
        if (gamesScrollPane == null) {
            System.err.println("Warning: gamesScrollPane is null. Make sure the FXML is properly loaded.");
            return;
        }

        // Set initial properties
        gamesScrollPane.setVvalue(0);
        gamesScrollPane.setFitToWidth(true);
        gamesScrollPane.setFitToHeight(true);

        // Use Platform.runLater to ensure components are available
        Platform.runLater(() -> {
            try {
                // Style the scrollbar
                var scrollBar = gamesScrollPane.lookup(".scroll-bar:vertical");
                if (scrollBar != null) {
                    scrollBar.setStyle(
                            "-fx-background-color: transparent;" +
                                    "-fx-pref-width: 8;" +
                                    "-fx-padding: 0 2;" +
                                    "-fx-background-insets: 0;" +
                                    "-fx-background-radius: 4;"
                    );
                }

                var thumb = gamesScrollPane.lookup(".scroll-bar:vertical .thumb");
                if (thumb != null) {
                    thumb.setStyle(
                            "-fx-background-color: rgba(0, 0, 0, 0.2);" +
                                    "-fx-background-radius: 4;"
                    );
                }

                var track = gamesScrollPane.lookup(".scroll-bar:vertical .track");
                if (track != null) {
                    track.setStyle(
                            "-fx-background-color: transparent;"
                    );
                }

                var incrementButton = gamesScrollPane.lookup(".scroll-bar:vertical .increment-button");
                if (incrementButton != null) {
                    incrementButton.setStyle(
                            "-fx-background-color: transparent;" +
                                    "-fx-padding: 0;"
                    );
                }

                var decrementButton = gamesScrollPane.lookup(".scroll-bar:vertical .decrement-button");
                if (decrementButton != null) {
                    decrementButton.setStyle(
                            "-fx-background-color: transparent;" +
                                    "-fx-padding: 0;"
                    );
                }
            } catch (Exception e) {
                System.err.println("Error setting up scroll pane: " + e.getMessage());
            }
        });
    }

    private void setButtonIcon(Button button, String imagePath) {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream(imagePath)));
        imageView.setFitWidth(40);
        imageView.setFitHeight(40);

        // Apply circular clipping
        Circle clip = new Circle(20, 20, 20);
        imageView.setClip(clip);

        button.setGraphic(imageView);
    }

    @FXML
    private void showHome() {
        setSectionVisible(homePane);

        // Apply shadow effect to Home button
        applyShadowAnimation(homeButton, true);
        applyShadowAnimation(leagueButton, false);
        applyShadowAnimation(helpButton, false);
        applyShadowAnimation(chatButton, false);
        applyShadowAnimation(profileButton, false);
    }

    @FXML
    private void showTales() {
        setSectionVisible(talesSection);
        setupVideoPlayer();
        setupAudioPlayer();
        loadStoryText();
        setupAnimations1();
        setupHoverEffects();
    }

    @FXML
    private void showLeague() {
        setSectionVisible(leaguePane);
        setupButtonEffects(leagueButton1);
        setupButtonEffects(achievementsButton);
        // Apply shadow effect to League button
        applyShadowAnimation(homeButton, false);
        applyShadowAnimation(leagueButton, true);
        applyShadowAnimation(helpButton, false);
        applyShadowAnimation(chatButton, false);
        applyShadowAnimation(profileButton, false);
    }

    @FXML
    private void showchat() {
        setSectionVisible(chatPane);
        connectToServer();
        setupListViewStyles();
        setupAnimations2();
        setupHoverEffects2();
        showChatSection();

        // Apply shadow effect to League button
        applyShadowAnimation(homeButton, false);
        applyShadowAnimation(leagueButton, false);
        applyShadowAnimation(helpButton, false);
        applyShadowAnimation(chatButton, true);
        applyShadowAnimation(profileButton, false);
    }

    @FXML
    private void showHelp() {
        setSectionVisible(helpPane);

        // Apply shadow effect to Help button
        applyShadowAnimation(homeButton, false);
        applyShadowAnimation(leagueButton, false);
        applyShadowAnimation(helpButton, true);
        applyShadowAnimation(chatButton, false);
        applyShadowAnimation(profileButton, false);
    }

    @FXML
    private void showprofile() {
        setSectionVisible(profilePane);

        // Apply shadow effect to Help button
        applyShadowAnimation(homeButton, false);
        applyShadowAnimation(leagueButton, false);
        applyShadowAnimation(helpButton, false);
        applyShadowAnimation(chatButton, false);
        applyShadowAnimation(profileButton, true);
    }

    @FXML
    private void showHome1() {
        setSectionVisible(homePane);
        applyShadowAnimation(homeButton, true);
    }

    @FXML
    private HBox questionBox;

    @FXML
    private GridPane answerGrid;

    @FXML
    private void showRiddle() {
        setSectionVisible(riddleSection);
        loadNewRiddle();
        setBackground(questionBox);
        setBackground(answerGrid);

    }

    @FXML
    private void show2048() {
        setSectionVisible(game2048Section);
        game2048Section.setVisible(true);
        startGame();
        loadHighScore();
    }

    private final String HIGH_SCORE_FILE = "highscore.txt";

    //showing maths section
    @FXML
    private void showEasySection() {
        setSectionVisible(easySection);
        generateNewQuestion();
    }

    @FXML
    private void showHardSection() {
        setSectionVisible(hardSection);
        generateNewQuestion2();
    }

    @FXML
    private void showMaths() {
        setSectionVisible(mathsSection);

    }

    // Show Reading Section
    @FXML
    private void showReading() {
        setSectionVisible(readingSection);

    }

    @FXML
    private void showReading9to12() {
        setSectionVisible(readingSection9to12);
    }

    private void setSectionVisible(VBox visibleSection) {
        VBox[] sections = {homePane,talesSection, patternExplorerSection, mathsSection, readingSection9to12Updated, easySection, hardSection, riddleSection, game2048Section, readingSection, readingSection9to12, leaguePane, leaguePane1, achievementsPane, helpPane, chatPane, profilePane};

        for (VBox section : sections) {
            if (section == visibleSection) {
                fadeIn(section);
            } else {
                section.setVisible(false);
            }
        }
    }

    // Fade in effect when switching sections
    private void fadeIn(VBox section) {
        section.setVisible(true);
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), section);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.play();
    }

    private final DropShadow shadowEffect = new DropShadow(15, Color.GRAY);

    private void applyShadowAnimation(Button button, boolean isActive) {
        DropShadow shadow = isActive ? shadowEffect : new DropShadow(0, Color.TRANSPARENT);
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0.001),
                        new KeyValue(button.effectProperty(), shadow)
                )
        );
        timeline.play();
    }


    //Animation
    private void addButtonAnimation(Button button) {
        // Initial button style
        button.setStyle(
                "-fx-background-color: transparent; " +
                        "-fx-border-color: white; " +
                        "-fx-border-width: 1; " +
                        "-fx-text-fill: white; " +
                        "-fx-font-size: 14px; " +
                        "-fx-font-weight: bold; " +
                        "-fx-padding: 10 20; " +
                        "-fx-border-radius: 20; " +
                        "-fx-background-radius: 20;"
        );

        // Hover effect
        button.setOnMouseEntered(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-font-weight: bold; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });

        // Reset style on mouse exit
        button.setOnMouseExited(event -> {
            button.setStyle(
                    "-fx-background-color: transparent; " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-font-weight: bold; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });

        // Click effect
        button.setOnMousePressed(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.2); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-font-weight: bold; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });

        // Reset style after click
        button.setOnMouseReleased(event -> {
            button.setStyle(
                    "-fx-background-color: rgba(255, 255, 255, 0.1); " +
                            "-fx-border-color: white; " +
                            "-fx-border-width: 1; " +
                            "-fx-text-fill: white; " +
                            "-fx-font-size: 14px; " +
                            "-fx-font-weight: bold; " +
                            "-fx-padding: 10 20; " +
                            "-fx-border-radius: 20; " +
                            "-fx-background-radius: 20;"
            );
        });
    }

    //HOVER ANIMATION
    private void addHoverAnimation(Button button, String hoverColor) {
        button.setOnMouseEntered(e -> {
            button.setStyle(button.getStyle() + "-fx-background-color: " + hoverColor + ";");
            ScaleTransition scaleUp = new ScaleTransition(Duration.millis(200), button);
            scaleUp.setToX(1.3);
            scaleUp.setToY(1.3);
            scaleUp.play();
        });

        button.setOnMouseExited(e -> {
            button.setStyle(button.getStyle().replace(hoverColor, "")); // Reverts to original color
            ScaleTransition scaleDown = new ScaleTransition(Duration.millis(200), button);
            scaleDown.setToX(1);
            scaleDown.setToY(1);
            scaleDown.play();
        });
    }

    //RIDDLE SECTION CONTROLLER
    @FXML
    private Label riddleQuestion, scoreLabel;
    @FXML
    private Button optionA, optionB, optionC, optionD;

    private String correctAnswer;
    private int score = 0;

    private final String[][] riddles = {
            {"What has keys but can't open locks?", "Piano", "Lock", "Keyboard", "Treasure", "Piano"},
            {"The more you take, the more you leave behind. What am I?", "Steps", "Air", "Time", "Shadow", "Steps"},
            {"What comes once in a minute, twice in a moment, but never in a thousand years?", "Letter M", "Day", "Sun", "Moon", "Letter M"},
            {"I have hands but cannot clap. What am I?", "Clock", "Doll", "Robot", "Human", "Clock"},
            {"I'm tall when I'm young, and I'm short when I'm old. What am I?", "Candle", "Tree", "Shadow", "Person", "Candle"},
            {"What has to be broken before you can use it?", "Egg", "Glass", "Seal", "Lock", "Egg"}
    };


    private void loadNewRiddle() {
        Random rand = new Random();
        int index = rand.nextInt(riddles.length);

        String[] riddle = riddles[index];
        riddleQuestion.setText(riddle[0]);
        optionA.setText(riddle[1]);
        optionB.setText(riddle[2]);
        optionC.setText(riddle[3]);
        optionD.setText(riddle[4]);
        correctAnswer = riddle[5];

        correctAnswerLabel.setText(""); // Clear any previous message
        correctAnswerLabel.setVisible(false);
    }

    @FXML
    private Label correctAnswerLabel; // Add this label in your FXML

    @FXML
    private void checkAnswer(ActionEvent event) {
        Button selectedButton = (Button) event.getSource();

        if (selectedButton.getText().equals(correctAnswer)) {
            selectedButton.setText("Correct ✅");
            score += 10;
            correctAnswerLabel.setText(""); // Clear any previous message
        } else {
            selectedButton.setText("Oops ❗");
            score = Math.max(score - 5, 0);

            // Display the correct answer in a separate label
            correctAnswerLabel.setVisible(true);
            correctAnswerLabel.setText("The correct answer was: " + correctAnswer);
        }

        scoreLabel.setText(String.valueOf(score));

        if (score == 50) { // Perfect score for riddles
        }

        // Load next riddle after a short delay
        PauseTransition pause = new PauseTransition(Duration.seconds(3));
        pause.setOnFinished(e -> loadNewRiddle());
        pause.play();
    }

    public void setBackground(HBox questionBox) {
        Image image = new Image(getClass().getResource("riddlebg.png").toExternalForm());
        BackgroundImage bgImage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, new BackgroundSize(100, 100, true, true, true, false));

        questionBox.setBackground(new Background(bgImage));
    }

    public void setBackground(GridPane gridPane) {
        Image image = new Image(getClass().getResource("1.png").toExternalForm());
        BackgroundImage bgImage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER, new BackgroundSize(100, 100, true, true, true, false));

        gridPane.setBackground(new Background(bgImage));
    }
    //2048 GAME

    @FXML
    private Pane gamePane;
    @FXML
    private Label scoreL;
    @FXML
    private Label highScoreLabel;

    private int scoree = 0;
    private int highScore = 0;
    private static final int TILE_SIZE = 65;
    private static final int GRID_SIZE = 4;
    private final int[][] board = new int[GRID_SIZE][GRID_SIZE];
    private GridPane gridPane;

    private void startGame() {
        gridPane = new GridPane();
        gridPane.setHgap(8);
        gridPane.setVgap(8);
        gridPane.setAlignment(Pos.CENTER);

        gamePane.getChildren().clear();
        gamePane.getChildren().add(gridPane);
        gamePane.setFocusTraversable(true);
        gamePane.setOnKeyPressed(this::handleKeyPress);

        // Reset score
        scoree = 0;
        updateScore(0);

        // Initialize board
        initializeBoard();
        drawBoard();

        // Add focus listener to ensure gamePane keeps focus
        gamePane.focusedProperty().addListener((obs, oldVal, newVal) -> {
            if (!newVal) {
                gamePane.requestFocus();
            }
        });
    }

    private void updateScore(int points) {
        scoree += points;
        scoreL.setText(String.valueOf(scoree));

        if (scoree > highScore) {
            highScore = scoree;
            highScoreLabel.setText(String.valueOf(highScore));
            saveHighScore();

            // Add animation for new high score
            Timeline flash = new Timeline(
                    new KeyFrame(Duration.ZERO, e -> highScoreLabel.setStyle("-fx-text-fill: #FFD700;")),
                    new KeyFrame(Duration.millis(500), e -> highScoreLabel.setStyle("-fx-text-fill: white;"))
            );
            flash.play();
        }
    }

    private void loadHighScore() {
        try (BufferedReader reader = new BufferedReader(new FileReader(HIGH_SCORE_FILE))) {
            highScore = Integer.parseInt(reader.readLine());
            highScoreLabel.setText(String.valueOf(highScore));
        } catch (IOException | NumberFormatException ignored) {
            highScore = 0;
            highScoreLabel.setText("0");
        }
    }

    private void saveHighScore() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(HIGH_SCORE_FILE))) {
            writer.write(String.valueOf(highScore));
        } catch (IOException ignored) {
        }
    }

    private void initializeBoard() {
        // Clear the board
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                board[i][j] = 0;
            }
        }

        // Add initial tiles with animation
        addRandomTile();
        addRandomTile();
    }

    private void drawBoard() {
        gridPane.getChildren().clear();

        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                int value = board[row][col];

                // Create tile container
                StackPane tileContainer = new StackPane();
                tileContainer.setPrefSize(TILE_SIZE, TILE_SIZE);

                // Create tile background
                Rectangle tile = new Rectangle(TILE_SIZE, TILE_SIZE);
                tile.setFill(getTileColor(value));
                tile.setArcWidth(6);
                tile.setArcHeight(6);
                tile.setStroke(Color.rgb(205, 193, 180));
                tile.setStrokeWidth(2);

                // Add shadow effect for non-empty tiles
                if (value != 0) {
                    tile.setEffect(new DropShadow(2, 0, 0, Color.rgb(0, 0, 0, 0.2)));
                }

                // Create text for tile value
                Text text = new Text(value == 0 ? "" : String.valueOf(value));
                text.setFont(Font.font("Arial", FontWeight.BOLD,
                        value < 100 ? 22 : value < 1000 ? 20 : 16));
                text.setFill(value <= 4 ? Color.rgb(119, 110, 101) : Color.WHITE);

                // Add elements to container
                tileContainer.getChildren().addAll(tile, text);

                // Add container to grid
                gridPane.add(tileContainer, col, row);
            }
        }
    }

    private Color getTileColor(int value) {
        return switch (value) {
            case 2 -> Color.rgb(238, 228, 218);    // Light beige
            case 4 -> Color.rgb(237, 224, 200);    // Slightly darker beige
            case 8 -> Color.rgb(242, 177, 121);    // Orange
            case 16 -> Color.rgb(245, 149, 99);    // Dark orange
            case 32 -> Color.rgb(246, 124, 95);    // Red-orange
            case 64 -> Color.rgb(246, 94, 59);     // Red
            case 128 -> Color.rgb(237, 207, 114);  // Yellow
            case 256 -> Color.rgb(237, 204, 97);   // Bright yellow
            case 512 -> Color.rgb(237, 200, 80);   // Golden yellow
            case 1024 -> Color.rgb(237, 197, 63);  // Gold
            case 2048 -> Color.rgb(237, 194, 46);  // Bright gold
            default -> Color.rgb(205, 193, 180);   // Gray
        };
    }

    private void handleKeyPress(KeyEvent event) {
        boolean moved = false;

        switch (event.getCode()) {
            case UP -> moved = moveUp();
            case DOWN -> moved = moveDown();
            case LEFT -> moved = moveLeft();
            case RIGHT -> moved = moveRight();
        }

        if (moved) {
            addRandomTile();
            drawBoard();

            // Check for game over
            if (isGameOver()) {
                showGameOver();
            }
        }
    }

    private boolean moveUp() {
        boolean moved = false;
        for (int col = 0; col < GRID_SIZE; col++) {
            int[] merged = new int[GRID_SIZE];
            int index = 0;
            for (int row = 0; row < GRID_SIZE; row++) {
                if (board[row][col] != 0) {
                    if (index > 0 && merged[index - 1] == board[row][col]) {
                        merged[index - 1] *= 2;
                        updateScore(merged[index - 1]);
                        moved = true;
                    } else {
                        merged[index++] = board[row][col];
                    }
                }
            }
            for (int row = 0; row < GRID_SIZE; row++) {
                if (board[row][col] != merged[row]) {
                    moved = true;
                }
                board[row][col] = merged[row];
            }
        }
        return moved;
    }

    private boolean moveDown() {
        boolean moved = false;
        for (int col = 0; col < GRID_SIZE; col++) {
            int[] merged = new int[GRID_SIZE];
            int index = GRID_SIZE - 1;
            for (int row = GRID_SIZE - 1; row >= 0; row--) {
                if (board[row][col] != 0) {
                    if (index < GRID_SIZE - 1 && merged[index + 1] == board[row][col]) {
                        merged[index + 1] *= 2;
                        updateScore(merged[index + 1]);
                        moved = true;
                    } else {
                        merged[index--] = board[row][col];
                    }
                }
            }
            for (int row = 0; row < GRID_SIZE; row++) {
                if (board[row][col] != merged[row]) {
                    moved = true;
                }
                board[row][col] = merged[row];
            }
        }
        return moved;
    }

    private boolean moveLeft() {
        boolean moved = false;
        for (int row = 0; row < GRID_SIZE; row++) {
            int[] merged = new int[GRID_SIZE];
            int index = 0;
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] != 0) {
                    if (index > 0 && merged[index - 1] == board[row][col]) {
                        merged[index - 1] *= 2;
                        updateScore(merged[index - 1]);
                        moved = true;
                    } else {
                        merged[index++] = board[row][col];
                    }
                }
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] != merged[col]) {
                    moved = true;
                }
                board[row][col] = merged[col];
            }
        }
        return moved;
    }

    private boolean moveRight() {
        boolean moved = false;
        for (int row = 0; row < GRID_SIZE; row++) {
            int[] merged = new int[GRID_SIZE];
            int index = GRID_SIZE - 1;
            for (int col = GRID_SIZE - 1; col >= 0; col--) {
                if (board[row][col] != 0) {
                    if (index < GRID_SIZE - 1 && merged[index + 1] == board[row][col]) {
                        merged[index + 1] *= 2;
                        updateScore(merged[index + 1]);
                        moved = true;
                    } else {
                        merged[index--] = board[row][col];
                    }
                }
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] != merged[col]) {
                    moved = true;
                }
                board[row][col] = merged[col];
            }
        }
        return moved;
    }

    private void addRandomTile() {
        Random rand = new Random();
        int row, col;
        do {
            row = rand.nextInt(GRID_SIZE);
            col = rand.nextInt(GRID_SIZE);
        } while (board[row][col] != 0);

        board[row][col] = rand.nextInt(10) == 0 ? 4 : 2;
    }

    private boolean isGameOver() {
        // Check for empty cells
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (board[i][j] == 0) return false;
            }
        }

        // Check for possible merges
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                int current = board[i][j];
                if ((i < GRID_SIZE - 1 && current == board[i + 1][j]) ||
                        (j < GRID_SIZE - 1 && current == board[i][j + 1])) {
                    return false;
                }
            }
        }
        return true;
    }
    @FXML
    public void startNewGame() {
        // Reset score
        score = 0;
        updateScore(0);

        // Clear the board
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                board[i][j] = 0;
            }
        }

        // Add initial tiles
        addRandomTile();
        addRandomTile();

        // Redraw the board
        drawBoard();

        // Ensure game pane has focus
        gamePane.requestFocus();

        // Add animation for new game start
        Timeline flash = new Timeline(
                new KeyFrame(Duration.ZERO, e -> gamePane.setStyle("-fx-background-color: #BBADA0;")),
                new KeyFrame(Duration.millis(200), e -> gamePane.setStyle("-fx-background-color: #CCC0B3;")),
                new KeyFrame(Duration.millis(400), e -> gamePane.setStyle("-fx-background-color: #BBADA0;"))
        );
        flash.play();
    }
    private void showGameOver() {
        // Create game over overlay
        VBox overlay = new VBox(10);
        overlay.setAlignment(Pos.CENTER);
        overlay.setStyle("-fx-background-color: rgba(238, 228, 218, 0.9); -fx-background-radius: 6px; -fx-padding: 10px;");

        Label gameOverLabel = new Label("Game Over!");
        gameOverLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #776E65;");

        Label scoreLabel = new Label("Score: " + score);
        scoreLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: #776E65;");

        Button newGameButton = new Button("New Game");
        newGameButton.setStyle("-fx-font-size: 12px; -fx-background-color: #8F7A66; -fx-text-fill: white; " +
                "-fx-background-radius: 6px; -fx-padding: 6 15; -fx-font-weight: bold;");
        newGameButton.setOnAction(e -> startGame());

        overlay.getChildren().addAll(gameOverLabel, scoreLabel, newGameButton);

        // Add overlay to game pane
        StackPane stackPane = new StackPane(gamePane, overlay);
        gamePane.getParent().getChildrenUnmodifiable().set(0, stackPane);

        // Add fade-in animation
        overlay.setOpacity(0);
        Timeline fadeIn = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(overlay.opacityProperty(), 0)),
                new KeyFrame(Duration.millis(500), new KeyValue(overlay.opacityProperty(), 1))
        );
        fadeIn.play();
    }

    // Maths games

    @FXML
    private Label firstNumberLabel, secondNumberLabel, resultLabel;
    @FXML
    private TextField answerInput;
    @FXML
    private Button nextQuestionButton;
    @FXML
    private ImageView operationImage;
    private int score1 = 0;
    private int streak = 0;

    @FXML
    private Label scoreLabel1;
    private boolean isAddition;
    private int correctAnswer1;

    // Function to generate a new question
    @FXML
    private void generateNewQuestion() {
        Random random = new Random();
        int num1 = random.nextInt(999) + 10;  // Larger range for better variation
        int num2 = random.nextInt(999) + 10;

        isAddition = random.nextBoolean();

        if (!isAddition && num1 < num2) { // Ensure no negative subtraction
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        correctAnswer1 = isAddition ? num1 + num2 : num1 - num2;

        // Set the correct operation image
        String imagePath = isAddition ? "plus.png" : "minus.png";
        operationImage.setImage(new Image(getClass().getResourceAsStream(imagePath)));

        // Properly align numbers for column addition/subtraction
        int maxDigits = Math.max(String.valueOf(num1).length(), String.valueOf(num2).length());

        firstNumberLabel.setText(formatNumber(num1, maxDigits));
        secondNumberLabel.setText(formatNumber(num2, maxDigits));

        // Hide result and reset UI
        resultLabel.setVisible(false);
        resultLabel.setText("");
        answerInput.clear();
        nextQuestionButton.setVisible(false);
    }

    private String formatNumber(int num, int maxDigits) {
        String numStr = String.valueOf(num);

        // Ensure the number is right-aligned by adding spaces to the left
        while (numStr.length() < maxDigits) {
            numStr = " " + numStr;
        }

        return numStr;
    }

    // Function to check the answer
    @FXML
    private void checkAnswer1() {
        String userInput = answerInput.getText().trim();

        if (userInput.isEmpty()) {
            showResult("Enter a number!", "red");
            return;
        }

        try {
            int userAnswer = Integer.parseInt(userInput);

            String explanation = ""; // Variable to hold the detailed explanation

            if (userAnswer == correctAnswer1) {
                showResult("Correct! ✅", "green");
                streak++;

                // Bonus points if 5 correct answers in a row
                if (streak >= 5) {
                    score1 += 20; // Bonus points
                    streak = 0;  // Reset streak after bonus
                } else {
                    score1 += 10; // Normal points
                }

                explanation = generateCalculationExplanation(isAddition, firstNumberLabel.getText().trim(), secondNumberLabel.getText().trim());
            } else {
                showResult("Oops ❗ Correct Answer: " + correctAnswer1, "green");
                streak = 0; // Reset streak on incorrect answer

                explanation = generateCalculationExplanation(isAddition, firstNumberLabel.getText().trim(), secondNumberLabel.getText().trim());
            }

            scoreLabel1.setText("Score: " + score1); // Update score on UI
            nextQuestionButton.setVisible(true); // Show "Next Question" button

            // Show detailed calculation explanation
            showCalculationExplanation(explanation);


        } catch (NumberFormatException e) {
            showResult("Enter a valid number!", "red");
        }
    }

    private String generateCalculationExplanation(boolean isAddition, String num1Str, String num2Str) {
        int num1 = Integer.parseInt(num1Str.trim());
        int num2 = Integer.parseInt(num2Str.trim());

        StringBuilder explanation = new StringBuilder();

        if (isAddition) {
            explanation.append("Step-by-step Addition:\n");

            int carry = 0;
            int placeValue = 1;

            while (num1 > 0 || num2 > 0 || carry > 0) {
                int digit1 = num1 % 10;
                int digit2 = num2 % 10;

                int sum = digit1 + digit2 + carry;
                carry = sum / 10; // Calculate carry

                explanation.append(String.format("Place %d: %d + %d + Carry(%d) = %d (Carry: %d)\n",
                        placeValue, digit1, digit2, carry - sum / 10, sum % 10, carry));

                num1 /= 10;
                num2 /= 10;
                placeValue++;
            }

        } else {
            explanation.append("Step-by-step Subtraction:\n");

            int borrow = 0;
            int placeValue = 1;

            while (num1 > 0 || num2 > 0) {
                int digit1 = num1 % 10 - borrow;
                int digit2 = num2 % 10;

                if (digit1 < digit2) {
                    borrow = 1;
                    digit1 += 10; // Borrowing logic
                    explanation.append(String.format("Place %d: %d - %d (Borrowing: +10) = %d\n",
                            placeValue, digit1 - borrow * 10, digit2, digit1 - digit2));
                } else {
                    borrow = 0;
                    explanation.append(String.format("Place %d: %d - %d = %d\n",
                            placeValue, digit1 + borrow * 10, digit2, digit1 - digit2));
                }

                num1 /= 10;
                num2 /= 10;
                placeValue++;
            }
        }

        return explanation.toString();
    }


    private void showCalculationExplanation(String explanation) {
        resultLabel.setText(resultLabel.getText() + "\n" + explanation); // Append explanation to result label
        resultLabel.setVisible(true); // Ensure it is visible
    }

    // Function to update result label
    private void showResult(String message, String color) {
        resultLabel.setText(message);
        resultLabel.setStyle("-fx-text-fill: " + color + ";");
        resultLabel.setVisible(true);

        // Add fade animation
        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), resultLabel);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();

        // Add scale animation for emphasis
        ScaleTransition scale = new ScaleTransition(Duration.seconds(0.3), resultLabel);
        scale.setFromX(1.0);
        scale.setFromY(1.0);
        scale.setToX(1.2);
        scale.setToY(1.2);
        scale.setAutoReverse(true);
        scale.setCycleCount(2);
        scale.play();
    }

    private void setupAnimations() {
        // Setup question box animation
        setupQuestionBoxAnimation();

        // Setup input field animation
        setupInputFieldAnimation();

        // Setup buttons animation
        setupButtonAnimation(nextQuestionButton, "#42A5F5");
    }

    private void setupQuestionBoxAnimation() {
        // Add hover effect to question box
        questionBox1.setOnMouseEntered(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), questionBox1);
            scale.setFromX(1.0);
            scale.setFromY(1.0);
            scale.setToX(1.02);
            scale.setToY(1.02);
            scale.play();

            TranslateTransition floatUp = new TranslateTransition(Duration.seconds(0.2), questionBox1);
            floatUp.setFromY(0);
            floatUp.setToY(-5);
            floatUp.play();
        });

        questionBox1.setOnMouseExited(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), questionBox1);
            scale.setFromX(1.02);
            scale.setFromY(1.02);
            scale.setToX(1.0);
            scale.setToY(1.0);
            scale.play();

            TranslateTransition floatDown = new TranslateTransition(Duration.seconds(0.2), questionBox1);
            floatDown.setFromY(-5);
            floatDown.setToY(0);
            floatDown.play();
        });
    }

    private void setupInputFieldAnimation() {
        // Add focus effect to input field
        answerInput.focusedProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), answerInput);
                scale.setFromX(1.0);
                scale.setFromY(1.0);
                scale.setToX(1.05);
                scale.setToY(1.05);
                scale.play();
            } else {
                ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), answerInput);
                scale.setFromX(1.05);
                scale.setFromY(1.05);
                scale.setToX(1.0);
                scale.setToY(1.0);
                scale.play();
            }
        });
    }

    private void setupButtonAnimation(Button button, String color) {
        // Add shadow effect
        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.web(color));
        shadow.setRadius(10);
        shadow.setOffsetX(0);
        shadow.setOffsetY(5);
        button.setEffect(shadow);

        // Hover effect
        button.setOnMouseEntered(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), button);
            scale.setFromX(1.0);
            scale.setFromY(1.0);
            scale.setToX(1.1);
            scale.setToY(1.1);
            scale.play();

            TranslateTransition floatUp = new TranslateTransition(Duration.seconds(0.2), button);
            floatUp.setFromY(0);
            floatUp.setToY(-5);
            floatUp.play();
        });

        button.setOnMouseExited(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), button);
            scale.setFromX(1.1);
            scale.setFromY(1.1);
            scale.setToX(1.0);
            scale.setToY(1.0);
            scale.play();

            TranslateTransition floatDown = new TranslateTransition(Duration.seconds(0.2), button);
            floatDown.setFromY(-5);
            floatDown.setToY(0);
            floatDown.play();
        });

        // Click effect
        button.setOnMousePressed(e -> {
            ScaleTransition press = new ScaleTransition(Duration.seconds(0.1), button);
            press.setFromX(1.1);
            press.setFromY(1.1);
            press.setToX(0.95);
            press.setToY(0.95);
            press.play();
        });

        button.setOnMouseReleased(e -> {
            ScaleTransition release = new ScaleTransition(Duration.seconds(0.1), button);
            release.setFromX(0.95);
            release.setFromY(0.95);
            release.setToX(1.1);
            release.setToY(1.1);
            release.play();
        });
    }

    @FXML
    private Label firstNumberLabel2, secondNumberLabel2, resultLabel2;
    @FXML
    private TextField answerInput2;
    @FXML
    private Button nextQuestionButton2;
    @FXML
    private ImageView operationImage2;
    @FXML
    private Label scoreLabel2;

    private int score2 = 0;
    private int streak2 = 0;
    private boolean isMultiplication;
    private int correctAnswer2;

    // Function to generate a new question
    @FXML
    private void generateNewQuestion2() {
        Random random1 = new Random();
        int num1 = random1.nextInt(10) + 2;  // Ensures better division results
        int num2 = random1.nextInt(10) + 2;

        isMultiplication = random1.nextBoolean(); // Randomly choose between multiplication and division

        if (!isMultiplication) {
            // Ensure num1 is a multiple of num2 for clean division
            num1 = num1 * num2;
        }

        correctAnswer2 = isMultiplication ? num1 * num2 : num1 / num2;

        // Set the correct operation image
        String imagePath = isMultiplication ? "multiply.png" : "divide.png";
        operationImage2.setImage(new Image(getClass().getResourceAsStream(imagePath)));

        // Properly align numbers for column multiplication/division
        int maxDigits = Math.max(String.valueOf(num1).length(), String.valueOf(num2).length());

        firstNumberLabel2.setText(formatNumber1(num1, maxDigits));
        secondNumberLabel2.setText(formatNumber1(num2, maxDigits));

        // Hide result and reset UI
        resultLabel2.setVisible(false);
        resultLabel2.setText("");
        answerInput2.clear();
        nextQuestionButton2.setVisible(false);
    }

    private String formatNumber1(int num, int maxDigits) {
        String numStr = String.valueOf(num);

        // Ensure the number is right-aligned by adding spaces to the left
        while (numStr.length() < maxDigits) {
            numStr = " " + numStr;
        }

        return numStr;
    }

    // Function to check the answer
    @FXML
    private void checkAnswer2() {
        String userInput = answerInput2.getText().trim();

        if (userInput.isEmpty()) {
            showResult2("Enter a number!", "red");
            return;
        }

        try {
            int userAnswer = Integer.parseInt(userInput);
            String explanation = ""; // Variable to hold the detailed explanation

            if (userAnswer == correctAnswer2) {
                showResult2("Correct! ✅", "green");
                streak2++;

                // Bonus points if 5 correct answers in a row
                if (streak2 >= 5) {
                    score2 += 20; // Bonus points
                    streak2 = 0;  // Reset streak after bonus
                } else {
                    score2 += 10; // Normal points
                }

                explanation = generateCalculationExplanation1(isMultiplication, firstNumberLabel2.getText().trim(), secondNumberLabel2.getText().trim());
            } else {
                showResult2("Oops ❗ Correct Answer: " + correctAnswer2, "red");
                streak2 = 0; // Reset streak on incorrect answer

                explanation = generateCalculationExplanation1(isMultiplication, firstNumberLabel2.getText().trim(), secondNumberLabel2.getText().trim());
            }

            scoreLabel2.setText("Score: " + score2); // Update score on UI
            nextQuestionButton2.setVisible(true); // Show "Next Question" button

            // Show detailed calculation explanation
            showCalculationExplanation1(explanation);


        } catch (NumberFormatException e) {
            showResult2("Enter a valid number!", "red");
        }
    }

    private String generateCalculationExplanation1(boolean isMultiplication, String num1Str, String num2Str) {
        int num1 = Integer.parseInt(num1Str.trim());
        int num2 = Integer.parseInt(num2Str.trim());

        StringBuilder explanation = new StringBuilder();

        if (isMultiplication) {
            explanation.append("Step-by-step Multiplication:\n");

            for (int i = 0; i < num2; i++) {
                explanation.append(num1).append(" + ");
            }

            explanation.setLength(explanation.length() - 3); // Remove last " + "
            explanation.append(" = ").append(num1 * num2).append("\n");

        } else {
            explanation.append("Step-by-step Division:\n");

            while (num1 >= num2) {
                num1 -= num2;
                explanation.append(num1 + num2).append(" - ").append(num2).append(" = ").append(num1).append("\n");
            }

            explanation.append("The remainder is: ").append(num1).append("\n");
        }

        return explanation.toString();
    }

    private void showCalculationExplanation1(String explanation) {
        resultLabel2.setText(resultLabel2.getText() + "\n" + explanation); // Append explanation to result label
        resultLabel2.setVisible(true); // Ensure it is visible
    }

    // Function to update result label
    private void showResult2(String message, String color) {
        resultLabel2.setText(message);
        resultLabel2.setStyle("-fx-text-fill: " + color + ";");
        resultLabel2.setVisible(true); // Make it visible
    }

    //Riddle section controller

    @FXML
    private void enlargeButton(MouseEvent event) {
        Button btn = (Button) event.getSource();
        btn.setScaleX(1.1);
        btn.setScaleY(1.1);
    }

    @FXML
    private void resetButton(MouseEvent event) {
        Button btn = (Button) event.getSource();
        btn.setScaleX(1.0);
        btn.setScaleY(1.0);
    }

    @FXML
    private void showagesection() {
        setSectionVisible(readingSection);
    }

    @FXML
    private Label timerLabel, readingScoreLabel, mcqQuestionLabel;
    //    @FXML
//    private TextArea readingTextArea;
    @FXML
    private VBox ageSelectionScreen, readingSection9to12, mcqSection;
    @FXML
    private Button startTimerButton, stopTimerButton;

    private Timeline timeline;
    private int secondsElapsed = 0;

    @FXML
    private void startReadingTimer() {
        secondsElapsed = 0;
        timerLabel.setText("00:00");

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            secondsElapsed++;
            int minutes = secondsElapsed / 60;
            int seconds = secondsElapsed % 60;
            timerLabel.setText(String.format("%02d:%02d", minutes, seconds));
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        startTimerButton.setDisable(true);
        stopTimerButton.setVisible(true);
    }

    private int questionCounter = 0;
    private int currentScore = 0;
    private final String[] demoPassages = {
            "The Arctic fox is a small fox native to the Arctic regions. These remarkable creatures can survive temperatures as low as -50°C. Their thick fur changes color with the seasons - white in winter and brown in summer. Arctic foxes primarily feed on lemmings, voles, and other small rodents.",
            "The giant panda is a bear species endemic to China. Despite being classified as carnivores, pandas' diet consists almost exclusively of bamboo. An adult panda can eat 12-38 kg of bamboo per day! Their distinctive black-and-white coloring helps them camouflage in snowy and rocky habitats."
    };

    private final String[][][] demoQuestions = {
            { // Questions for first passage
                    {"What is the main adaptation of Arctic foxes mentioned?", "Thick color-changing fur", "Hibernation ability", "Webbed feet", "Long tail", "A"},
                    {"What do Arctic foxes primarily eat?", "Fish", "Small rodents", "Berries", "Insects", "B"},
                    {"What temperature can Arctic foxes survive?", "-10°C", "-50°C", "-30°C", "-70°C", "B"},
                    {"What color is their fur in winter?", "Brown", "Gray", "White", "Black", "C"},
                    {"Where are Arctic foxes found?", "Antarctica", "Arctic regions", "Alpine forests", "North America", "B"}
            },
            { // Questions for second passage
                    {"What is the giant panda's primary food?", "Bamboo", "Meat", "Fruits", "Fish", "A"},
                    {"How much bamboo can a panda eat daily?", "5-10 kg", "12-38 kg", "40-50 kg", "1-5 kg", "B"},
                    {"Pandas are native to which country?", "Japan", "India", "China", "Russia", "C"},
                    {"What helps pandas camouflage?", "Stripes", "Black-and-white coloring", "Speed", "Size", "B"},
                    {"Pandas are classified as:", "Herbivores", "Carnivores", "Omnivores", "Insectivores", "B"}
            }
    };
    private int currentPassageIndex = 0;

    // Modify the stopReadingTimer method
    @FXML
    private void stopReadingTimer() {
        if (timeline != null) {
            timeline.stop();
        }
        stopTimerButton.setDisable(true);

        // Initialize MCQ session
        questionCounter = 0;
        readingScoreLabel.setText("0");
        mcqSection.setVisible(true);
        mcqSection.setManaged(true);
        loadNewPassageAndQuestions();
    }

    // Add these new methods
    private void loadNewPassageAndQuestions() {
        // Set new passage text
        readingTextArea.setText(demoPassages[currentPassageIndex]);

        // Load first question
        loadQuestion(0);
    }

    @FXML
    public Button mcqOptionA, mcqOptionB, mcqOptionC, mcqOptionD;

    private void loadQuestion(int questionIndex) {
        String[] questionData = demoQuestions[currentPassageIndex][questionIndex];
        mcqQuestionLabel.setText(questionData[0]);
        mcqOptionA.setText(questionData[1]);
        mcqOptionB.setText(questionData[2]);
        mcqOptionC.setText(questionData[3]);
        mcqOptionD.setText(questionData[4]);
    }

    @FXML
    private void handleAnswerA() {
        checkAnswer("A");
    }

    @FXML
    private void handleAnswerB() {
        checkAnswer("B");
    }

    @FXML
    private void handleAnswerC() {
        checkAnswer("C");
    }

    @FXML
    private void handleAnswerD() {
        checkAnswer("D");
    }

    private void checkAnswer(String selectedOption) {
        String[] questionData = demoQuestions[currentPassageIndex][questionCounter];
        String correctAnswer = questionData[5];
        Button selectedButton = null;

        // Get the selected button
        switch (selectedOption) {
            case "A":
                selectedButton = mcqOptionA;
                break;
            case "B":
                selectedButton = mcqOptionB;
                break;
            case "C":
                selectedButton = mcqOptionC;
                break;
            case "D":
                selectedButton = mcqOptionD;
                break;
        }

        if (selectedButton != null) {
            if (selectedOption.equals(correctAnswer)) {
                selectedButton.setText("✅ Correct");
                currentScore += 20;
            } else {
                selectedButton.setText("❌ Wrong");
                currentScore = Math.max(currentScore - 5, 0);  // Prevent negative scores

                // Highlight correct answer
                switch (correctAnswer) {
                    case "A":
                        mcqOptionA.setText("✅ " + mcqOptionA.getText());
                        break;
                    case "B":
                        mcqOptionB.setText("✅ " + mcqOptionB.getText());
                        break;
                    case "C":
                        mcqOptionC.setText("✅ " + mcqOptionC.getText());
                        break;
                    case "D":
                        mcqOptionD.setText("✅ " + mcqOptionD.getText());
                        break;
                }
            }

            readingScoreLabel.setText(String.valueOf(currentScore));


            // Disable all buttons after answering
            mcqOptionA.setDisable(true);
            mcqOptionB.setDisable(true);
            mcqOptionC.setDisable(true);
            mcqOptionD.setDisable(true);

            // Proceed after 1 second delay
            PauseTransition pause = new PauseTransition(Duration.seconds(1));
            pause.setOnFinished(e -> {
                if (questionCounter + 1 < 5) {
                    questionCounter++;
                    loadQuestion(questionCounter);
                    // Re-enable buttons for next question
                    mcqOptionA.setDisable(false);
                    mcqOptionB.setDisable(false);
                    mcqOptionC.setDisable(false);
                    mcqOptionD.setDisable(false);
                } else {
                    mcqSection.setVisible(false);
                    resetReadingSession();
                }
            });
            pause.play();
        }
    }


    private void resetReadingSession() {
        // Reset timer
        secondsElapsed = 0;
        timerLabel.setText("00:00");
        startTimerButton.setDisable(false);
        stopTimerButton.setVisible(false);
        stopTimerButton.setDisable(false);

        // Show reading section again
        setSectionVisible(readingSection9to12);
    }

    @FXML
    public VBox readingSection9to12Updated;

    @FXML
    public void showreading5to8() {
        setSectionVisible(readingSection9to12Updated);
    }

    @FXML
    private Label fillInScoreLabelUpdated;
    @FXML
    private Label fillInQuestionLabelUpdated;
    @FXML
    private TextField fillInAnswerFieldUpdated;
    private int currentParagraphIndex = 0;
    private int currentFillInScore = 0;
    private int currentFillInQuestionIndex = 0;

    // Example fill-in-the-blank questions
    private final String[][] fillInQuestions = {
            {"Liam found a mysterious ___ in the forest.", "cave"},
            {"The cave was filled with glowing ___ .", "crystals"},
            {"Liam was an ___ from the village.", "explorer"},
    };

    @FXML
    private void submitFillInAnswerUpdated() {
        String userAnswer = fillInAnswerFieldUpdated.getText().trim().toLowerCase();
        String correctAnswer = fillInQuestionsUpdated[currentParagraphIndex][currentFillInQuestionIndex][1];

        if (userAnswer.equals(correctAnswer)) {
            currentFillInScore += 20;
            fillInScoreLabelUpdated.setText(String.valueOf(currentFillInScore));
            fillInQuestionLabelUpdated.setText("Correct! ✅");
        } else {
            fillInQuestionLabelUpdated.setText("Wrong! ❌ The correct answer was '" + correctAnswer + "'.");
        }

        // Load next question after a short delay
        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(e -> loadNextFillInQuestionUpdated());
        pause.play();
    }


    private void loadNextFillInQuestionUpdated() {
        currentFillInQuestionIndex++;

        if (currentFillInQuestionIndex < fillInQuestionsUpdated[currentParagraphIndex].length) {
            fillInQuestionLabelUpdated.setText(fillInQuestionsUpdated[currentParagraphIndex][currentFillInQuestionIndex][0]);
            fillInAnswerFieldUpdated.clear(); // Clear previous answer
        } else {
            // Hide Fill in the Blanks section and show Reading Section again
            fillInTheBlanksSectionUpdated.setVisible(false);

            // Show next paragraph and reset for next set of questions
            currentParagraphIndex++;

            if (currentParagraphIndex < paragraphsUpdated.length) {
                resetFillInSessionUpdated(); // Reset session for new round

                // Show reading section with new paragraph
                readingSection9to12Updated.setVisible(true);
                readingTextAreaUpdated.setText(paragraphsUpdated[currentParagraphIndex]);

                // Load first question of the new paragraph
                currentFillInQuestionIndex = 0;
                loadNextFillInQuestionUpdated();
            } else {
                // Optionally handle end of all questions (e.g., show final score)
                resetFillInSessionUpdated();
            }
        }
    }


    private void resetFillInSessionUpdated() {
        currentFillInScore = 0;
        currentFillInQuestionIndex = 0;
        currentParagraphIndex = 0;
        fillInScoreLabelUpdated.setText("0");

        // Reset timer logic similar to your existing one
        secondsElapsed = 0;
        timerLabelUpdated.setText("00:00");
        startTimerButtonUpdated.setDisable(false);
        stopTimerButtonUpdated.setVisible(false);
        stopTimerButtonUpdated.setDisable(false);
    }

    @FXML
    private Label timerLabelUpdated; // Label to display the timer
    private Timeline timer; // Timeline for the timer
    private int secondsElapsed1 = 0; // Variable to track elapsed seconds

    @FXML
    private void startReadingTimerUpdated() {
        secondsElapsed1 = 0; // Reset elapsed time
        timerLabelUpdated.setText("00:00"); // Reset display

        // Create a new Timeline for the timer
        timer = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            secondsElapsed1++;
            int minutes = secondsElapsed1 / 60;
            int seconds = secondsElapsed1 % 60;
            timerLabelUpdated.setText(String.format("%02d:%02d", minutes, seconds)); // Update display
        }));

        timer.setCycleCount(Timeline.INDEFINITE); // Set to run indefinitely
        timer.play(); // Start the timer

        // Disable start button and show stop button
        startTimerButtonUpdated.setDisable(true);
        stopTimerButtonUpdated.setVisible(true);
    }

    @FXML
    private Button startTimerButtonUpdated, stopTimerButtonUpdated;

    @FXML
    private void stopReadingTimerUpdated() {
        if (timer != null) {
            timer.stop(); // Stop the timer
        }

        // Disable stop button and enable start button
        stopTimerButtonUpdated.setDisable(true);
        startTimerButtonUpdated.setDisable(false);

        // Make the Fill in the Blanks section visible
        fillInTheBlanksSectionUpdated.setVisible(true);


        // Optionally, you can show a message or perform other actions when the timer stops
    }

    @FXML
    private void showAgeSelectionUpdated() {
        setSectionVisible(ageSelectionScreen);
    }

    // Example fill-in-the-blank questions for both paragraphs
    private final String[][][] fillInQuestionsUpdated = {
            { // First paragraph questions
                    {"Liam found a mysterious ___ in the forest.", "cave"},
                    {"The cave was filled with glowing ___ .", "crystals"},
                    {"Liam was an ___ from the village.", "explorer"},
                    {"The forest was home to many ___ creatures.", "small"},
                    {"Liam loved to ___ the hidden trails.", "explore"}
            },
            { // Second paragraph questions
                    {"The giant panda primarily eats ___ .", "bamboo"},
                    {"Pandas are native to ___ .", "China"},
                    {"An adult panda can eat up to ___ kg of bamboo daily.", "38"},
                    {"Pandas are classified as ___ .", "carnivores"},
                    {"The distinctive black-and-white coloring helps pandas ___ .", "camouflage"}
            }
    };

    // Example paragraphs
    private final String[] paragraphsUpdated = {
            "Once upon a time in a small village, there lived a young boy named Liam. He loved exploring the dense forest near his home, where he would often encounter small creatures and discover hidden trails. One day, while venturing deeper into the woods, he stumbled upon a mysterious cave. Curiosity got the best of him, and he decided to step inside. The cave was filled with glowing crystals, casting beautiful lights all around.",

            "The giant panda is a bear species endemic to China. Despite being classified as carnivores, pandas' diet consists almost exclusively of bamboo. An adult panda can eat up to 38 kg of bamboo daily! Their distinctive black-and-white coloring helps them camouflage in snowy and rocky habitats."
    };

    //chatting section

//    @FXML private VBox chatPane;
    @FXML private StackPane contentArea;
    @FXML private VBox chatContainer, addFriendContainer, friendsListContainer;
    @FXML private ListView<String> messageListView;
    @FXML private TextField messageInputField;
    @FXML private TextField friendNameInputField;
    @FXML private Label addFriendResultLabel;
    @FXML private ListView<String> friendsListView;

    private ArrayList<String> friends = new ArrayList<>();
    private ObservableList<String> messages = FXCollections.observableArrayList();
    private ObservableList<String> friendsList = FXCollections.observableArrayList();

    // Networking components
    private Socket socket;
    private DataOutputStream dos;
    private DataInputStream dis;
    private boolean isConnected = false;

    private void setupListViewStyles() {
        messageListView.setItems(messages);
        friendsListView.setItems(friendsList);

        // Custom cell factory for messages
        messageListView.setCellFactory(lv -> new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else {
                    setText(item);
                    setStyle("-fx-padding: 8px; -fx-background-color: #E3F2FD; -fx-background-radius: 10px;");
                }
            }
        });

        // Custom cell factory for friends list
        friendsListView.setCellFactory(lv -> new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else {
                    setText("👤 " + item);
                    setStyle("-fx-padding: 8px; -fx-background-color: #F5F5F5; -fx-background-radius: 10px;");
                }
            }
        });
    }

    private void setupAnimations2() {
        // Fade in animation for the chat pane
        FadeTransition fadeIn = new FadeTransition(Duration.millis(500), chatPane);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();

        // Scale animation for buttons
        chatPane.lookupAll("Button").forEach(button -> {
            Button btn = (Button) button;
            btn.setOnMouseEntered(e -> {
                ScaleTransition scaleUp = new ScaleTransition(Duration.millis(200), btn);
                scaleUp.setToX(1.1);
                scaleUp.setToY(1.1);
                scaleUp.play();
            });
            btn.setOnMouseExited(e -> {
                ScaleTransition scaleDown = new ScaleTransition(Duration.millis(200), btn);
                scaleDown.setToX(1.0);
                scaleDown.setToY(1.0);
                scaleDown.play();
            });
        });
    }

    private void setupHoverEffects2() {
        // Glow effect for containers
        chatContainer.setOnMouseEntered(e -> {
            Glow glow = new Glow(0.5);
            chatContainer.setEffect(glow);
        });
        chatContainer.setOnMouseExited(e -> {
            chatContainer.setEffect(null);
        });

        addFriendContainer.setOnMouseEntered(e -> {
            Glow glow = new Glow(0.5);
            addFriendContainer.setEffect(glow);
        });
        addFriendContainer.setOnMouseExited(e -> {
            addFriendContainer.setEffect(null);
        });

        friendsListContainer.setOnMouseEntered(e -> {
            Glow glow = new Glow(0.5);
            friendsListContainer.setEffect(glow);
        });
        friendsListContainer.setOnMouseExited(e -> {
            friendsListContainer.setEffect(null);
        });
    }

    @FXML
    public void showChatSection() {
        hideAllSections();
        chatContainer.setVisible(true);
        messageInputField.clear();
        messageListView.getItems().clear();
        // Add fade in animation
        FadeTransition fadeIn = new FadeTransition(Duration.millis(200), chatContainer);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();
    }

    @FXML
    public void showAddFriendsSection() {
        hideAllSections();
        addFriendContainer.setVisible(true);
        friendNameInputField.clear();
        addFriendResultLabel.setText("");
        // Add fade in animation
        FadeTransition fadeIn = new FadeTransition(Duration.millis(200), addFriendContainer);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();
    }

    @FXML
    public void showFriendsListSection() {
        hideAllSections();
        friendsListContainer.setVisible(true);
        friendsListView.getItems().clear();
        friendsListView.getItems().addAll(friends);
        // Add fade in animation
        FadeTransition fadeIn = new FadeTransition(Duration.millis(200), friendsListContainer);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();
    }

    @FXML
    public void addFriend() {
        String friendName = friendNameInputField.getText().trim();
        if (!friendName.isEmpty() && !friends.contains(friendName)) {
            friends.add(friendName);
            addFriendResultLabel.setText("Friend added successfully! ✨");
            friendNameInputField.clear();
            // Clear success message after 3 seconds
            new Thread(() -> {
                try {
                    Thread.sleep(3000);
                    Platform.runLater(() -> addFriendResultLabel.setText(""));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        } else {
            addFriendResultLabel.setText("Enter a valid name or friend already exists.");
        }
    }

    @FXML
    public void chatWithSelectedFriend() {
        String selectedFriend = friendsListView.getSelectionModel().getSelectedItem();
        if (selectedFriend != null) {
            selectedFriend = selectedFriend.substring(2); // Remove emoji
            showChatSection();
            messages.add("Chatting with: " + selectedFriend);
        }
    }

    @FXML
    public void sendMessage() {
        if (!isConnected) {
            showAlert("Not connected to server!", Alert.AlertType.WARNING);
            return;
        }

        String message = messageInputField.getText().trim();
        if (!message.isEmpty()) {
            try {
                dos.writeUTF(message);
                dos.flush();
                Platform.runLater(() -> {
                    messages.add("You: " + message);
                    messageInputField.clear();
                    messageListView.scrollTo(messages.size() - 1);
                });

                if (message.equalsIgnoreCase("sayonara")) {
                    closeConnection();
                }
            } catch (Exception e) {
                closeConnection();
                showAlert("Message send failed: " + e.getMessage(), Alert.AlertType.ERROR);
            }
        }
    }

    private void connectToServer() {
        new Thread(() -> {
            try {
                socket = new Socket("192.168.0.154", 6666);
                dos = new DataOutputStream(socket.getOutputStream());
                dis = new DataInputStream(socket.getInputStream());
                isConnected = true;
                startReceiverThread();
                Platform.runLater(() -> showAlert("Connected to server!", Alert.AlertType.INFORMATION));
            } catch (Exception e) {
                Platform.runLater(() -> showAlert("Connection failed: " + e.getMessage(), Alert.AlertType.ERROR));
            }
        }).start();
    }

    private void startReceiverThread() {
        new Thread(() -> {
            while (isConnected) {
                try {
                    String message = dis.readUTF();
                    Platform.runLater(() -> {
                        messages.add("Friend: " + message);
                        messageListView.scrollTo(messages.size() - 1);
                    });

                    if (message.equalsIgnoreCase("sayonara")) {
                        closeConnection();
                        break;
                    }
                } catch (Exception e) {
                    closeConnection();
                    break;
                }
            }
        }).start();
    }

    private void closeConnection() {
        isConnected = false;
        try {
            if (dos != null) dos.close();
            if (dis != null) dis.close();
            if (socket != null) socket.close();
        } catch (Exception e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }

    private void showAlert(String message, Alert.AlertType type) {
        Platform.runLater(() -> {
            Alert alert = new Alert(type);
            alert.setContentText(message);
            alert.show();
        });
    }

    private void hideAllSections() {
        chatContainer.setVisible(false);
        addFriendContainer.setVisible(false);
        friendsListContainer.setVisible(false);
    }

    //League part

    @FXML
    private Label titleLabel1;

    @FXML
    private VBox leaderboardContainer;

    private List<PlayerScore> playerScores;
    private int currentPlayerRank = 0;


    private void addSampleLeaderboard() {
        PlayerScore[] sampleScores = {
                new PlayerScore("SuperStar123", 1000, "👑", 1),
                new PlayerScore("GameMaster", 950, "🌟", 2),
                new PlayerScore("AdventureKid", 900, "🎮", 3),
                new PlayerScore("Player123", 850, "🎯", 4),
                new PlayerScore("FunGamer", 800, "🎪", 5)
        };

        // Add scores with a fun entrance effect
        for (int i = 0; i < sampleScores.length; i++) {
            final PlayerScore score = sampleScores[i];
            int finalI = i;
            new Thread(() -> {
                try {
                    Thread.sleep(finalI * 200); // 200ms delay between each score
                    javafx.application.Platform.runLater(() -> {
                        addPlayerScore(score);
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public void addPlayerScore(PlayerScore score) {
        playerScores.add(score);
        updateDisplay1();
    }

    private void updateDisplay1() {
        leaderboardContainer.getChildren().clear();

        for (PlayerScore score : playerScores) {
            HBox scoreBox = createScoreBox(score);
            leaderboardContainer.getChildren().add(scoreBox);
        }
    }

    private HBox createScoreBox(PlayerScore score) {
        HBox box = new HBox(20);
        box.setAlignment(Pos.CENTER_LEFT);
        box.setPadding(new Insets(15));
        box.setStyle("-fx-background-color: white; -fx-background-radius: 15;");
        box.setMaxWidth(500);

        // Add rainbow shadow effect for top 3
        DropShadow shadow = new DropShadow();
        if (score.getRank() <= 3) {
            shadow.setColor(Color.web("#FF6B6B"));
        } else {
            shadow.setColor(Color.web("#4A4A4A"));
        }
        shadow.setRadius(15);
        shadow.setOffsetX(0);
        shadow.setOffsetY(5);
        box.setEffect(shadow);

        // Create rank label with crown for top 3
        Label rankLabel = new Label(score.getRank() + " " + score.getEmoji());
        rankLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 24));
        rankLabel.setTextFill(score.getRank() <= 3 ? Color.web("#FFD700") : Color.web("#2C3E50"));

        // Create player name
        Label nameLabel = new Label(score.getName());
        nameLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        nameLabel.setTextFill(Color.web("#2C3E50"));

        // Create score with sparkle effect
        Label scoreLabel = new Label(score.getScore() + " ⭐");
        scoreLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        scoreLabel.setTextFill(Color.web("#F1C40F"));

        // Add all elements to the box
        box.getChildren().addAll(rankLabel, nameLabel, scoreLabel);

        // Add fun hover effects
        box.setOnMouseEntered(e -> {
            box.setStyle("-fx-background-color: #F0F0F0; -fx-background-radius: 15;");
            box.setTranslateX(5);

            // Add rotation effect on hover
            RotateTransition rotate = new RotateTransition(Duration.seconds(0.2), box);
            rotate.setFromAngle(0);
            rotate.setToAngle(2);
            rotate.setAutoReverse(true);
            rotate.setCycleCount(2);
            rotate.play();
        });

        box.setOnMouseExited(e -> {
            box.setStyle("-fx-background-color: white; -fx-background-radius: 15;");
            box.setTranslateX(0);
            box.setRotate(0);
        });

        // Add entrance animation
        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), box);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();

        return box;
    }

    public void updatePlayerScore(String playerName, int newScore) {
        for (PlayerScore score : playerScores) {
            if (score.getName().equals(playerName)) {
                score.setScore(newScore);
                updateDisplay1();
                playScoreUpdateAnimation(score);
                break;
            }
        }
    }

    private void playScoreUpdateAnimation(PlayerScore score) {
        for (var node : leaderboardContainer.getChildren()) {
            if (node instanceof HBox) {
                HBox box = (HBox) node;
                if (box.getChildren().get(1) instanceof Label) {
                    Label nameLabel = (Label) box.getChildren().get(1);
                    if (nameLabel.getText().equals(score.getName())) {
                        // Create a sequence of animations
                        ScaleTransition scale = new ScaleTransition(Duration.seconds(0.5), box);
                        scale.setFromX(1.0);
                        scale.setFromY(1.0);
                        scale.setToX(1.2);
                        scale.setToY(1.2);
                        scale.setAutoReverse(true);
                        scale.setCycleCount(2);

                        // Add rainbow glow effect
                        Glow glow = new Glow();
                        glow.setLevel(0.5);
                        box.setEffect(glow);

                        // Remove glow after animation
                        new Thread(() -> {
                            try {
                                Thread.sleep(1500);
                                javafx.application.Platform.runLater(() -> box.setEffect(null));
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }).start();
                    }
                }
            }
        }
    }

    public void showplaypattern() {
        setSectionVisible(patternExplorerSection);
        patternPieces = new ArrayList<>();
        targetPattern = new ArrayList<>();
    }

    // Inner class to represent player scores
    public static class PlayerScore {
        private String name;
        private int score;
        private String emoji;
        private int rank;

        public PlayerScore(String name, int score, String emoji, int rank) {
            this.name = name;
            this.score = score;
            this.emoji = emoji;
            this.rank = rank;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getEmoji() {
            return emoji;
        }

        public int getRank() {
            return rank;
        }
    }

    @FXML
    public void showAchievementsSection() {
        setSectionVisible(achievementsPane);
        achievements = new ArrayList<>();
        totalPoints = 0;

        // Add a fun animation to the title
        ScaleTransition titleScale = new ScaleTransition(Duration.seconds(2), titleLabel);
        titleScale.setFromX(1.0);
        titleScale.setFromY(1.0);
        titleScale.setToX(1.1);
        titleScale.setToY(1.1);
        titleScale.setAutoReverse(true);
        titleScale.setCycleCount(ScaleTransition.INDEFINITE);
        titleScale.play();

        // Add sample achievements
        addSampleAchievements();
    }

    @FXML
    private VBox achievementPane;

    @FXML
    private Label titleLabel;

    @FXML
    private Label totalPointsLabel;

    @FXML
    private VBox achievementContainer;  // Changed from GridPane to VBox

    private List<Achievement> achievements;
    private int totalPoints;

    private void addSampleAchievements() {
        // Create sample achievements with fun emojis and descriptions
        Achievement[] sampleAchievements = {
                new Achievement(
                        "First Steps! 🚀",
                        "Complete your first level",
                        new Image("C:\\Users\\Shreya\\IdeaProjects\\KidsApplication\\src\\main\\resources\\com\\example\\kidsapplication\\achievement.jpg"),
                        10
                ),
                new Achievement(
                        "Speed Runner! ⚡",
                        "Complete a level in under 30 seconds",
                        new Image("C:\\Users\\Shreya\\IdeaProjects\\KidsApplication\\src\\main\\resources\\com\\example\\kidsapplication\\achievement.jpg"),
                        20
                ),
                new Achievement(
                        "Perfect Score! 🌟",
                        "Get 100% on any level",
                        new Image("C:\\Users\\Shreya\\IdeaProjects\\KidsApplication\\src\\main\\resources\\com\\example\\kidsapplication\\achievement.jpg"),
                        30
                ),
                new Achievement(
                        "Collector! 🎯",
                        "Collect 50 items in one level",
                        new Image("C:\\Users\\Shreya\\IdeaProjects\\KidsApplication\\src\\main\\resources\\com\\example\\kidsapplication\\achievement.jpg"),
                        15
                ),
                new Achievement(
                        "Master Explorer! 🗺️",
                        "Visit all areas in a level",
                        new Image("C:\\Users\\Shreya\\IdeaProjects\\KidsApplication\\src\\main\\resources\\com\\example\\kidsapplication\\achievement.jpg"),
                        25
                ),
                new Achievement(
                        "Super Hero! 🦸‍♂️",
                        "Save 10 characters",
                        new Image("C:\\Users\\Shreya\\IdeaProjects\\KidsApplication\\src\\main\\resources\\com\\example\\kidsapplication\\achievement.jpg"),
                        40
                )
        };

        // Add achievements with a slight delay for a fun entrance effect
        for (int i = 0; i < sampleAchievements.length; i++) {
            final Achievement achievement = sampleAchievements[i];
            int finalI = i;
            new Thread(() -> {
                try {
                    Thread.sleep(finalI * 200); // 200ms delay between each achievement
                    javafx.application.Platform.runLater(() -> {
                        addAchievement(achievement);
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public void addAchievement(Achievement achievement) {
        achievements.add(achievement);
        updateDisplay();
    }

    public void unlockAchievement(String title) {
        for (Achievement achievement : achievements) {
            if (achievement.getTitle().equals(title) && !achievement.isUnlocked()) {
                achievement.unlock();
                totalPoints += achievement.getPoints();
                updateDisplay();
                playUnlockAnimation(achievement);
                break;
            }
        }
    }

    private void updateDisplay() {
        achievementContainer.getChildren().clear();

        for (Achievement achievement : achievements) {
            VBox achievementBox = createAchievementBox(achievement);
            achievementContainer.getChildren().add(achievementBox);
        }

        totalPointsLabel.setText("Total Points: " + totalPoints + " ⭐");
    }

    private VBox createAchievementBox(Achievement achievement) {
        VBox box = new VBox(10);
        box.setAlignment(Pos.CENTER);
        box.setPadding(new Insets(15));
        box.setStyle("-fx-background-color: white; -fx-background-radius: 15;");
        box.setMaxWidth(400); // Set a maximum width for the achievement box

        // Add rainbow shadow effect for unlocked achievements
        DropShadow shadow = new DropShadow();
        if (achievement.isUnlocked()) {
            shadow.setColor(Color.web("#FF6B6B"));
        } else {
            shadow.setColor(Color.web("#4A4A4A"));
        }
        shadow.setRadius(15);
        shadow.setOffsetX(0);
        shadow.setOffsetY(5);
        box.setEffect(shadow);

        // Create icon with special effects
        ImageView iconView = new ImageView(achievement.getIcon());
        iconView.setFitWidth(80);  // Slightly smaller icons for vertical layout
        iconView.setFitHeight(80);

        if (achievement.isUnlocked()) {
            // Add multiple effects for unlocked achievements
            Bloom bloom = new Bloom();
            bloom.setThreshold(0.5);

            Glow glow = new Glow();
            glow.setLevel(0.5);

            ColorAdjust colorAdjust = new ColorAdjust();
            colorAdjust.setBrightness(0.1);

            iconView.setEffect(bloom);
        }

        // Create title with rainbow effect for unlocked achievements
        Label titleLabel = new Label(achievement.getTitle());
        titleLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        titleLabel.setTextFill(achievement.isUnlocked() ? Color.web("#FF6B6B") : Color.web("#2C3E50"));

        // Create description with fun font
        Label descLabel = new Label(achievement.getDescription());
        descLabel.setFont(Font.font("Comic Sans MS", 16));
        descLabel.setTextFill(Color.web("#7F8C8D"));
        descLabel.setWrapText(true);

        // Create points with sparkle effect
        Label pointsLabel = new Label(achievement.getPoints() + " ⭐");
        pointsLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 18));
        pointsLabel.setTextFill(Color.web("#F1C40F"));

        // Create status with fun animation
        Label statusLabel = new Label(achievement.isUnlocked() ? "✨ Unlocked! ✨" : "🔒 Locked");
        statusLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 18));
        statusLabel.setTextFill(achievement.isUnlocked() ? Color.web("#27AE60") : Color.web("#95A5A6"));

        box.getChildren().addAll(iconView, titleLabel, descLabel, pointsLabel, statusLabel);

        // Add fun hover effects
        box.setOnMouseEntered(e -> {
            box.setStyle("-fx-background-color: #F0F0F0; -fx-background-radius: 15;");
            box.setTranslateX(5); // Changed from Y to X for vertical layout

            // Add rotation effect on hover
            RotateTransition rotate = new RotateTransition(Duration.seconds(0.2), box);
            rotate.setFromAngle(0);
            rotate.setToAngle(2);
            rotate.setAutoReverse(true);
            rotate.setCycleCount(2);
            rotate.play();
        });

        box.setOnMouseExited(e -> {
            box.setStyle("-fx-background-color: white; -fx-background-radius: 15;");
            box.setTranslateX(0);
            box.setRotate(0);
        });

        return box;
    }

    private void playUnlockAnimation(Achievement achievement) {
        // Find the achievement box
        for (var node : achievementContainer.getChildren()) {
            if (node instanceof VBox) {
                VBox box = (VBox) node;
                if (box.getChildren().get(1) instanceof Label) {
                    Label titleLabel = (Label) box.getChildren().get(1);
                    if (titleLabel.getText().equals(achievement.getTitle())) {
                        // Create a sequence of animations
                        ScaleTransition scale = new ScaleTransition(Duration.seconds(0.5), box);
                        scale.setFromX(1.0);
                        scale.setFromY(1.0);
                        scale.setToX(1.2);
                        scale.setToY(1.2);
                        scale.setAutoReverse(true);
                        scale.setCycleCount(2);

                        RotateTransition rotate = new RotateTransition(Duration.seconds(0.3), box);
                        rotate.setFromAngle(0);
                        rotate.setToAngle(5);
                        rotate.setAutoReverse(true);
                        rotate.setCycleCount(2);

                        SequentialTransition sequence = new SequentialTransition(scale, rotate);
                        sequence.play();

                        // Add rainbow glow effect
                        Glow glow = new Glow();
                        glow.setLevel(0.5);
                        box.setEffect(glow);

                        // Remove glow after animation
                        new Thread(() -> {
                            try {
                                Thread.sleep(1500);
                                javafx.application.Platform.runLater(() -> box.setEffect(null));
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }).start();
                    }
                }
            }
        }
    }

    private int getUnlockedCount() {
        return (int) achievements.stream().filter(Achievement::isUnlocked).count();
    }

    @FXML
    public VBox leaguePane1;

    @FXML
    public void showLeagueSection() {
        setSectionVisible(leaguePane1);
        playerScores = new ArrayList<>();
        // Add a fun animation to the title
        ScaleTransition titleScale = new ScaleTransition(Duration.seconds(2), titleLabel);
        titleScale.setFromX(1.0);
        titleScale.setFromY(1.0);
        titleScale.setToX(1.1);
        titleScale.setToY(1.1);
        titleScale.setAutoReverse(true);
        titleScale.setCycleCount(ScaleTransition.INDEFINITE);
        titleScale.play();

        // Add sample leaderboard data
        addSampleLeaderboard();
    }
    public static void setupButtonEffects(Button button) {
        // Add shadow effect
        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.web("#4A4A4A"));
        shadow.setRadius(15);
        shadow.setOffsetX(0);
        shadow.setOffsetY(5);
        button.setEffect(shadow);

        // Add hover effects
        button.setOnMouseEntered(e -> {
            // Scale up effect
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), button);
            scale.setFromX(1.0);
            scale.setFromY(1.0);
            scale.setToX(1.1);
            scale.setToY(1.1);
            scale.play();

            // Float up effect
            TranslateTransition floatUp = new TranslateTransition(Duration.seconds(0.2), button);
            floatUp.setFromY(0);
            floatUp.setToY(-10);
            floatUp.play();

            // Add rainbow glow effect
            Glow glow = new Glow();
            glow.setLevel(0.8);
            button.setEffect(glow);

            // Add rotation effect
            RotateTransition rotate = new RotateTransition(Duration.seconds(0.2), button);
            rotate.setFromAngle(0);
            rotate.setToAngle(5);
            rotate.setAutoReverse(true);
            rotate.setCycleCount(2);
            rotate.play();

            // Change background color based on button type
            if (button.getText().contains("League")) {
                button.setStyle(button.getStyle() + "-fx-background-color: #FFB74D;");
            } else {
                button.setStyle(button.getStyle() + "-fx-background-color: #81C784;");
            }
        });

        button.setOnMouseExited(e -> {
            // Scale down effect
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), button);
            scale.setFromX(1.1);
            scale.setFromY(1.1);
            scale.setToX(1.0);
            scale.setToY(1.0);
            scale.play();

            // Float down effect
            TranslateTransition floatDown = new TranslateTransition(Duration.seconds(0.2), button);
            floatDown.setFromY(-10);
            floatDown.setToY(0);
            floatDown.play();

            // Reset rotation
            button.setRotate(0);

            // Reset background color based on button type
            if (button.getText().contains("League")) {
                button.setStyle(button.getStyle().replace("#FFB74D", "#FFAB40"));
            } else {
                button.setStyle(button.getStyle().replace("#81C784", "#69F0AE"));
            }

            // Reset effect
            button.setEffect(shadow);
        });

        // Add click effect
        button.setOnMousePressed(e -> {
            ScaleTransition press = new ScaleTransition(Duration.seconds(0.1), button);
            press.setFromX(1.1);
            press.setFromY(1.1);
            press.setToX(0.95);
            press.setToY(0.95);
            press.play();
        });

        button.setOnMouseReleased(e -> {
            ScaleTransition release = new ScaleTransition(Duration.seconds(0.1), button);
            release.setFromX(0.95);
            release.setFromY(0.95);
            release.setToX(1.1);
            release.setToY(1.1);
            release.play();
        });

        // Add entrance animation
        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), button);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }

    public static void updateButtonState(Button activeButton, Button inactiveButton) {
        if (activeButton.getText().contains("League")) {
            activeButton.setStyle(activeButton.getStyle() + "-fx-background-color: #FF8F00;");
            inactiveButton.setStyle(inactiveButton.getStyle().replace("#69F0AE", "#B9F6CA"));
        } else {
            activeButton.setStyle(activeButton.getStyle() + "-fx-background-color: #00E676;");
            inactiveButton.setStyle(inactiveButton.getStyle().replace("#FFAB40", "#FFE0B2"));
        }
    }
    public static void setupGlowEffect(Button button, String hoverColor, String defaultColor) {
        // Add shadow effect
        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.web("#4A4A4A"));
        shadow.setRadius(15);
        shadow.setOffsetX(0);
        shadow.setOffsetY(5);
        button.setEffect(shadow);

        // Add hover effects
        button.setOnMouseEntered(e -> {
            // Scale up effect
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), button);
            scale.setFromX(1.0);
            scale.setFromY(1.0);
            scale.setToX(1.1);
            scale.setToY(1.1);
            scale.play();

            // Float up effect
            TranslateTransition floatUp = new TranslateTransition(Duration.seconds(0.2), button);
            floatUp.setFromY(0);
            floatUp.setToY(-10);
            floatUp.play();

            // Add rainbow glow effect
            Glow glow = new Glow();
            glow.setLevel(0.8);
            button.setEffect(glow);

            // Add rotation effect
            RotateTransition rotate = new RotateTransition(Duration.seconds(0.2), button);
            rotate.setFromAngle(0);
            rotate.setToAngle(5);
            rotate.setAutoReverse(true);
            rotate.setCycleCount(2);
            rotate.play();

            // Change background color
            button.setStyle(button.getStyle() + "-fx-background-color: " + hoverColor + ";");
        });

        button.setOnMouseExited(e -> {
            // Scale down effect
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), button);
            scale.setFromX(1.1);
            scale.setFromY(1.1);
            scale.setToX(1.0);
            scale.setToY(1.0);
            scale.play();

            // Float down effect
            TranslateTransition floatDown = new TranslateTransition(Duration.seconds(0.2), button);
            floatDown.setFromY(-10);
            floatDown.setToY(0);
            floatDown.play();

            // Reset rotation
            button.setRotate(0);

            // Reset background color
            button.setStyle(button.getStyle().replace(hoverColor, defaultColor));

            // Reset effect
            button.setEffect(shadow);
        });

        // Add click effect
        button.setOnMousePressed(e -> {
            ScaleTransition press = new ScaleTransition(Duration.seconds(0.1), button);
            press.setFromX(1.1);
            press.setFromY(1.1);
            press.setToX(0.95);
            press.setToY(0.95);
            press.play();
        });

        button.setOnMouseReleased(e -> {
            ScaleTransition release = new ScaleTransition(Duration.seconds(0.1), button);
            release.setFromX(0.95);
            release.setFromY(0.95);
            release.setToX(1.1);
            release.setToY(1.1);
            release.play();
        });

        // Add entrance animation
        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), button);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }

    // Predefined color schemes for different button types
    public static class ButtonColors {
        public static final String LEAGUE_DEFAULT = "#FFAB40";
        public static final String LEAGUE_HOVER = "#FFB74D";
        public static final String ACHIEVEMENT_DEFAULT = "#69F0AE";
        public static final String ACHIEVEMENT_HOVER = "#81C784";
        public static final String PRIMARY_DEFAULT = "#2196F3";
        public static final String PRIMARY_HOVER = "#42A5F5";
        public static final String SUCCESS_DEFAULT = "#4CAF50";
        public static final String SUCCESS_HOVER = "#66BB6A";
        public static final String WARNING_DEFAULT = "#FFC107";
        public static final String WARNING_HOVER = "#FFD54F";
        public static final String DANGER_DEFAULT = "#F44336";
        public static final String DANGER_HOVER = "#EF5350";
    }

    private void setupGameButton(Button button, String color) {
        // Add shadow effect
        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.web(color));
        shadow.setRadius(10);
        shadow.setOffsetX(0);
        shadow.setOffsetY(5);
        button.setEffect(shadow);

        // Hover effect
        button.setOnMouseEntered(e -> {
            // Scale up
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), button);
            scale.setFromX(1.0);
            scale.setFromY(1.0);
            scale.setToX(1.1);
            scale.setToY(1.1);
            scale.play();

            // Float up
            TranslateTransition floatUp = new TranslateTransition(Duration.seconds(0.2), button);
            floatUp.setFromY(0);
            floatUp.setToY(-5);
            floatUp.play();

            // Change background color
            button.setStyle(button.getStyle().replace("white", color));
            button.setStyle(button.getStyle().replace("black", "white"));
        });

        button.setOnMouseExited(e -> {
            // Scale down
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), button);
            scale.setFromX(1.1);
            scale.setFromY(1.1);
            scale.setToX(1.0);
            scale.setToY(1.0);
            scale.play();

            // Float down
            TranslateTransition floatDown = new TranslateTransition(Duration.seconds(0.2), button);
            floatDown.setFromY(-5);
            floatDown.setToY(0);
            floatDown.play();

            // Reset style
            button.setStyle(button.getStyle().replace(color, "white"));
            button.setStyle(button.getStyle().replace("white", "black"));
        });

        // Click effect
        button.setOnMousePressed(e -> {
            ScaleTransition press = new ScaleTransition(Duration.seconds(0.1), button);
            press.setFromX(1.1);
            press.setFromY(1.1);
            press.setToX(0.95);
            press.setToY(0.95);
            press.play();
        });

        button.setOnMouseReleased(e -> {
            ScaleTransition release = new ScaleTransition(Duration.seconds(0.1), button);
            release.setFromX(0.95);
            release.setFromY(0.95);
            release.setToX(1.1);
            release.setToY(1.1);
            release.play();
        });
    }

    private void setupImageHoverEffect(ImageView imageView) {
        // Hover effect
        imageView.setOnMouseEntered(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), imageView);
            scale.setFromX(1.0);
            scale.setFromY(1.0);
            scale.setToX(1.1);
            scale.setToY(1.1);
            scale.play();

            TranslateTransition floatUp = new TranslateTransition(Duration.seconds(0.2), imageView);
            floatUp.setFromY(0);
            floatUp.setToY(-5);
            floatUp.play();
        });

        imageView.setOnMouseExited(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.seconds(0.2), imageView);
            scale.setFromX(1.1);
            scale.setFromY(1.1);
            scale.setToX(1.0);
            scale.setToY(1.0);
            scale.play();

            TranslateTransition floatDown = new TranslateTransition(Duration.seconds(0.2), imageView);
            floatDown.setFromY(-5);
            floatDown.setToY(0);
            floatDown.play();
        });
    }
    //story telling part
    @FXML private MediaView videoPlayer;
    @FXML private Button playPauseButton;
    @FXML private Button audioPlayPauseButton;
    @FXML private Slider videoSlider;
    @FXML private Slider audioSlider;
    @FXML private Label timeLabel;
    @FXML private Label audioTimeLabel;
    @FXML private Text storyText;
    @FXML private Button backButton;

    private MediaPlayer videoMediaPlayer;
    private MediaPlayer audioMediaPlayer;
    private boolean isVideoPlaying = false;
    private boolean isAudioPlaying = false;
    private String currentStory = "Title The Magical Paintbrush"; // Default story

    private void setupVideoPlayer() {
        try {
            String videoPath = getClass().getResource("/videos/" + currentStory + ".mp4").toExternalForm();
            Media media = new Media(videoPath);
            videoMediaPlayer = new MediaPlayer(media);
            videoPlayer.setMediaPlayer(videoMediaPlayer);

            // Setup video slider
            videoMediaPlayer.currentTimeProperty().addListener((obs, oldTime, newTime) -> {
                if (videoSlider != null && videoMediaPlayer.getTotalDuration().toSeconds() > 0) {
                    videoSlider.setValue(newTime.toSeconds() / videoMediaPlayer.getTotalDuration().toSeconds() * 100);
                    updateTimeLabel(newTime, videoMediaPlayer.getTotalDuration());
                }
            });

            // Add video end listener
            videoMediaPlayer.setOnEndOfMedia(() -> {
                videoMediaPlayer.stop();
                isVideoPlaying = false;
                playPauseButton.setText("▶");
            });
        } catch (Exception e) {
            System.err.println("Error loading video: " + e.getMessage());
        }
    }

    private void setupAudioPlayer() {
        try {
            String audioPath = getClass().getResource("/audio/" + currentStory + ".mp3").toExternalForm();
            Media media = new Media(audioPath);
            audioMediaPlayer = new MediaPlayer(media);

            // Setup audio slider
            audioMediaPlayer.currentTimeProperty().addListener((obs, oldTime, newTime) -> {
                if (audioSlider != null && audioMediaPlayer.getTotalDuration().toSeconds() > 0) {
                    audioSlider.setValue(newTime.toSeconds() / audioMediaPlayer.getTotalDuration().toSeconds() * 100);
                    updateTimeLabel(newTime, audioMediaPlayer.getTotalDuration());
                }
            });

            // Add audio end listener
            audioMediaPlayer.setOnEndOfMedia(() -> {
                audioMediaPlayer.stop();
                isAudioPlaying = false;
                audioPlayPauseButton.setText("🔊");
            });
        } catch (Exception e) {
            System.err.println("Error loading audio: " + e.getMessage());
        }
    }

    private void loadStoryText() {
        try {
            String storyPath = "/stories/" + currentStory + ".txt";
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(getClass().getResourceAsStream(storyPath)));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            storyText.setText(content.toString());
            reader.close();
        } catch (Exception e) {
            System.err.println("Error loading story text: " + e.getMessage());
            storyText.setText("Once upon a time...");
        }
    }

    private void setupAnimations1() {
        // Fade in animation for the section
        FadeTransition fadeIn = new FadeTransition(Duration.millis(500), talesSection);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();

        // Scale animation for buttons
        playPauseButton.setOnMouseEntered(e -> {
            ScaleTransition scaleUp = new ScaleTransition(Duration.millis(200), playPauseButton);
            scaleUp.setToX(1.1);
            scaleUp.setToY(1.1);
            scaleUp.play();
        });

        playPauseButton.setOnMouseExited(e -> {
            ScaleTransition scaleDown = new ScaleTransition(Duration.millis(200), playPauseButton);
            scaleDown.setToX(1.0);
            scaleDown.setToY(1.0);
            scaleDown.play();
        });

        // Similar animations for audio button
        audioPlayPauseButton.setOnMouseEntered(e -> {
            ScaleTransition scaleUp = new ScaleTransition(Duration.millis(200), audioPlayPauseButton);
            scaleUp.setToX(1.1);
            scaleUp.setToY(1.1);
            scaleUp.play();
        });

        audioPlayPauseButton.setOnMouseExited(e -> {
            ScaleTransition scaleDown = new ScaleTransition(Duration.millis(200), audioPlayPauseButton);
            scaleDown.setToX(1.0);
            scaleDown.setToY(1.0);
            scaleDown.play();
        });

        // Back button animation
        backButton.setOnMouseEntered(e -> {
            TranslateTransition slideRight = new TranslateTransition(Duration.millis(200), backButton);
            slideRight.setByX(5);
            slideRight.play();
        });

        backButton.setOnMouseExited(e -> {
            TranslateTransition slideLeft = new TranslateTransition(Duration.millis(200), backButton);
            slideLeft.setByX(-5);
            slideLeft.play();
        });
    }

    private void setupHoverEffects() {
        // Glow effect for containers
        talesSection.getChildren().forEach(node -> {
            if (node instanceof VBox) {
                VBox container = (VBox) node;
                container.setOnMouseEntered(e -> {
                    Glow glow = new Glow(0.5);
                    container.setEffect(glow);
                });
                container.setOnMouseExited(e -> {
                    container.setEffect(null);
                });
            }
        });

        // Button hover effects
        playPauseButton.setOnMouseEntered(e -> {
            playPauseButton.setStyle("-fx-background-color: #7B1FA2;");
        });
        playPauseButton.setOnMouseExited(e -> {
            playPauseButton.setStyle("-fx-background-color: #9C27B0;");
        });

        audioPlayPauseButton.setOnMouseEntered(e -> {
            audioPlayPauseButton.setStyle("-fx-background-color: #7B1FA2;");
        });
        audioPlayPauseButton.setOnMouseExited(e -> {
            audioPlayPauseButton.setStyle("-fx-background-color: #9C27B0;");
        });
    }

    @FXML
    private void togglePlayPause() {
        if (videoMediaPlayer != null) {
            if (isVideoPlaying) {
                videoMediaPlayer.pause();
                playPauseButton.setText("▶");
            } else {
                videoMediaPlayer.play();
                playPauseButton.setText("⏸");
            }
            isVideoPlaying = !isVideoPlaying;
        }
    }

    @FXML
    private void toggleAudioPlayPause() {
        if (audioMediaPlayer != null) {
            if (isAudioPlaying) {
                audioMediaPlayer.pause();
                audioPlayPauseButton.setText("🔊");
            } else {
                audioMediaPlayer.play();
                audioPlayPauseButton.setText("⏸");
            }
            isAudioPlaying = !isAudioPlaying;
        }
    }

    private void updateTimeLabel(Duration current, Duration total) {
        String currentTime = formatDuration(current);
        String totalTime = formatDuration(total);
        timeLabel.setText(currentTime + " / " + totalTime);
        audioTimeLabel.setText(currentTime + " / " + totalTime);
    }

    private String formatDuration(Duration duration) {
        int minutes = (int) duration.toMinutes();
        int seconds = (int) duration.toSeconds() % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    @FXML private Label patternScoreLabel;
    @FXML private Label levelLabel;
    @FXML private GridPane targetPatternGrid;
    @FXML private GridPane userPatternGrid;
    @FXML private HBox patternPiecesContainer;
    @FXML private Button startButton;
    @FXML private Button checkButton;
    @FXML private Button nextButton;
    @FXML private VBox feedbackArea;
    @FXML private Label feedbackLabel;
    @FXML private ProgressBar progressBar;

    private int currentLevel = 1;
    private int scoreee = 0;
    private List<Shape> patternPieces;
    private List<Shape> targetPattern;
    private Random random = new Random();
    private Shape draggedShape = null;
    private double mouseX, mouseY;

    @FXML
    private void startGame1() {
        // Reset game state
        scoreee = 0;
        currentLevel = 1;
        patternScoreLabel.setText("0");
        levelLabel.setText("1");

        // Clear previous patterns
        targetPatternGrid.getChildren().clear();
        userPatternGrid.getChildren().clear();
        patternPiecesContainer.getChildren().clear();
        patternPieces.clear();
        targetPattern.clear();

        // Generate new pattern
        generatePattern();

        // Show/hide appropriate buttons
        startButton.setVisible(false);
        checkButton.setVisible(true);
        nextButton.setVisible(false);
        feedbackArea.setVisible(false);
    }

    private void generatePattern() {
        // Generate a simple pattern (3x3 grid)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Create target pattern piece
                Shape targetPiece = createRandomShape();
                targetPattern.add(targetPiece);
                targetPatternGrid.add(targetPiece, j, i);

                // Create draggable piece
                Shape piece = createRandomShape();
                setupDragAndDrop(piece);
                patternPieces.add(piece);
                patternPiecesContainer.getChildren().add(piece);
            }
        }
    }

    private void setupDragAndDrop(Shape piece) {
        piece.setOnMousePressed(e -> {
            draggedShape = piece;
            mouseX = e.getSceneX() - piece.getTranslateX();
            mouseY = e.getSceneY() - piece.getTranslateY();
        });

        piece.setOnMouseDragged(e -> {
            if (draggedShape != null) {
                draggedShape.setTranslateX(e.getSceneX() - mouseX);
                draggedShape.setTranslateY(e.getSceneY() - mouseY);
            }
        });

        piece.setOnMouseReleased(e -> {
            if (draggedShape != null) {
                // Check if piece is dropped on user's grid
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (isPieceOverGridCell(draggedShape, userPatternGrid, j, i)) {
                            // Place piece in grid
                            userPatternGrid.add(draggedShape, j, i);
                            draggedShape.setTranslateX(0);
                            draggedShape.setTranslateY(0);
                            patternPiecesContainer.getChildren().remove(draggedShape);
                            break;
                        }
                    }
                }
                draggedShape = null;
            }
        });
    }

    private boolean isPieceOverGridCell(Shape piece, GridPane grid, int column, int row) {
        // Get grid cell bounds
        double cellX = grid.getLayoutX() + column * 50; // Approximate cell width
        double cellY = grid.getLayoutY() + row * 50;    // Approximate cell height

        // Get piece position
        double pieceX = piece.getTranslateX() + piece.getLayoutX();
        double pieceY = piece.getTranslateY() + piece.getLayoutY();

        // Check if piece is over cell
        return pieceX >= cellX && pieceX <= cellX + 40 &&
                pieceY >= cellY && pieceY <= cellY + 40;
    }

    private Shape createRandomShape() {
        // Create different shapes with random colors
        Shape shape;
        if (random.nextBoolean()) {
            shape = new Rectangle(40, 40);
        } else {
            shape = new Rectangle(40, 40);
            // Add more shape types as needed
        }

        // Set bright, kid-friendly colors
        Color[] colors = {
                Color.rgb(255, 0, 0),    // Red
                Color.rgb(0, 255, 0),    // Green
                Color.rgb(0, 0, 255),    // Blue
                Color.rgb(255, 255, 0),  // Yellow
                Color.rgb(255, 0, 255),  // Magenta
                Color.rgb(0, 255, 255),  // Cyan
                Color.rgb(255, 165, 0),  // Orange
                Color.rgb(128, 0, 128)   // Purple
        };

        shape.setFill(colors[random.nextInt(colors.length)]);
        shape.setStroke(Color.BLACK);
        shape.setStrokeWidth(2);

        return shape;
    }

    @FXML
    private void checkPattern() {
        boolean isCorrect = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Shape targetPiece = targetPattern.get(i * 3 + j);
                Shape userPiece = null;

                // Find piece in user's grid
                for (javafx.scene.Node node : userPatternGrid.getChildren()) {
                    if (GridPane.getColumnIndex(node) == j && GridPane.getRowIndex(node) == i) {
                        userPiece = (Shape) node;
                        break;
                    }
                }

                if (userPiece == null || !targetPiece.getFill().equals(userPiece.getFill())) {
                    isCorrect = false;
                    break;
                }
            }
        }

        if (isCorrect) {
            scoreee += 10;
            patternScoreLabel.setText(String.valueOf(scoreee));
            feedbackLabel.setText("Great job! Pattern matched!");
            feedbackLabel.setTextFill(Color.GREEN);
            nextButton.setVisible(true);
        } else {
            feedbackLabel.setText("Try again! Pattern doesn't match.");
            feedbackLabel.setTextFill(Color.RED);
        }
        feedbackArea.setVisible(true);
    }

    @FXML
    private void nextLevel() {
        currentLevel++;
        levelLabel.setText(String.valueOf(currentLevel));
        startGame1(); // Start new level
    }

    @FXML
    private void goBack() {
        patternExplorerSection.setVisible(false);
    }
}
