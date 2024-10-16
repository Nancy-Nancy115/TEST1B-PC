package com.example.test1b;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField username;
    public TextField password;
    public Label errMsg;
    @FXML
    private Label welcomeText;

    static int invalidReqcount=0;

   static String correctusername="Nancy";
    static String correctpassword="password";

    public void onloginbuttonclick(ActionEvent actionEvent) {
        String usernameInput=username.getText();
        String passwordInput=password.getText();

        if (usernameInput.isEmpty()|| passwordInput.isEmpty()){
            errMsg.setText("Please provide username or password");
        }
        else if (invalidReqcount==5){
            errMsg.setText("Sorry, your account is locked!!!" );
        }
      else   if (usernameInput.equals(correctusername) && passwordInput.equals(correctpassword)){
            errMsg.setText("you are logged in succesfully");
            invalidReqcount=0;
        }
        else { errMsg.setText("Sorry, Invalid username or Password.");
            invalidReqcount++;
        }

    }
}