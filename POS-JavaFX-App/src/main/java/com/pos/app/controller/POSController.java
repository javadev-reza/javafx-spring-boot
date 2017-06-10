package com.pos.app.controller;

import com.pos.library.Initializable;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import config.JFXController;
import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;

@Controller
public class POSController extends JFXController implements Initializable {
    
    @FXML
    private JFXHamburger hamburger;
    
    @FXML
    private JFXDrawer sideMenuDrawer;

    @Override
    public void initialize(Object param) {
        setSideBarMenu(hamburger, sideMenuDrawer);
    }
}
