package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * @author Nevena Kolev
 * @version 12.11.2020 v1
 */
public class Controller {
    //elements of the GUI
    @FXML private Button btn_convert;
    @FXML private TextField txtf_euroInput;
    @FXML private TextField txtf_yenInput;
    @FXML private Text txt_yen;
    @FXML private Text txt_euro;
    CurrencyConverter currencyConverter = new CurrencyConverter();

    @FXML
    public void doConvertion() {
        try {
            double euroValue = Double.parseDouble(txtf_euroInput.getText());
            if(euroValue > 0) {
                txtf_yenInput.setText(String.format("%.2f", currencyConverter.euroToYen(euroValue)));
            }
        } catch (Exception ex) {
            System.out.println("Please insert a number higher than zero");
        }
    }
}