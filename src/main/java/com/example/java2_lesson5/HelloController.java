package com.example.java2_lesson5;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class HelloController {

    @FXML
    private TextField messageField;

    @FXML
    private ListView<String> messagesList;

//    private final ObservableList<String> messages = FXCollections.observableArrayList();

    @FXML
    private TextArea namesField;


    @FXML
    private MenuItem closeField;


    @FXML
    private MenuItem clearChatArea;

    @FXML
    private MenuItem aboutButton;

    @FXML
    public void sendMessage() {
        String message = messageField.getText().trim();
        if (message.length()!=0) {
            messagesList.getItems().add(0,message);
        }
        messageField.setText("");
    }

   @FXML
   public void checkEnter(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER) {
            sendMessage();
        }
    }

    @FXML
    void closeApp() {
        System.exit(0);
    }

    @FXML
    void clearChat() {
        messagesList.getItems().clear();
    }

    @FXML
    void throwAboutInfo() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText(null);
        alert.setContentText("Добро пожаловать в приложение Alex Chat!\n" + "Версия 1.0\n" + "Дата релиза 23.02.2022\n" + "Автор: Переверзев Алексей");
        alert.showAndWait();
    }

    @FXML
    void initialize() {
        namesField.setText("Диана\n" + "Тимофей\n" + "Андрей\n");
    }

}