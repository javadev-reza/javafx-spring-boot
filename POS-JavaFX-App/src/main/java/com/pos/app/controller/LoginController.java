package com.pos.app.controller;

import com.pos.business.service.AuthenticateService;
import com.pos.library.Initializable;
import config.JFXController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController extends JFXController implements Initializable {
    
    @Autowired
    private AuthenticateService authenticateService;
    
    @FXML
    private TextField username;
    
    @FXML
    private TextField password;

    @Override
    public void initialize(Object param) {
    }

    @FXML
    public void LoginAction(ActionEvent event) {
        authenticateService.authenticate(username.getText(), password.getText());
        POSController controller = (POSController)setVisible("POS.fxml", "pos.css", "Point Of Sales");
        controller.initialize("Hallo World");
    }
}
