package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @author Nevena Kolev
 * @version 12.11.2020 v1
 */
public class Controller {
    //elements of the GUI
    @FXML private Button btn_convert;
    @FXML private TextField txtf_euroInput;
    @FXML private TextField txtf_yenInput;
    CurrencyConverter currencyConverter = new CurrencyConverter();

    @FXML
    public void doConvertion() {
        double euroValue = Double.parseDouble(txtf_euroInput.getText());
        txtf_yenInput.setText(String.valueOf(currencyConverter.euroToYen(euroValue)));
    }
}