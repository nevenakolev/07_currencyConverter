package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Nevena Kolev
 * @version 12.11.2020 v1
 */
public class Controller implements Initializable {
    //elements of the GUI
    @FXML private Button btn_convert;
    @FXML private TextField txtf_euroInput;
    @FXML private TextField txtf_convertedTo;
    @FXML private Text txt_euro;

    CurrencyConverter currencyConverter;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //creates an currencyConverter object to use its methods
        currencyConverter = new CurrencyConverter();
    }

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