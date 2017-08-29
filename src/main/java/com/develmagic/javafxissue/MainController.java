
package com.develmagic.javafxissue;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
@Slf4j
@SuppressWarnings("unchecked")
public class MainController implements Initializable {

    @FXML
    private ListView logBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        assert(logBox == null);
    }

}
