package br.univel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    private Button Botao;

    @FXML
    private TextField campo;

    @FXML
    void executar(ActionEvent event) {
    	
    	System.out.println(campo.getText());

    }
	
}
