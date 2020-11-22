package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
    @FXML private ChoiceBox<String> chBox_currencies = new ChoiceBox<>();

    CurrencyConverter currencyConverter;

    @Override
    @FXML public void initialize(URL location, ResourceBundle resources) {
        //creates an currencyConverter object to use its methods
        currencyConverter = new CurrencyConverter();

        //making a list of currencies
        currencyConverter.init();

        //filling the choicebox with currencies of the list above
        for (int i = 0; i < currencyConverter.getCurrencies().size(); i++) {
            chBox_currencies.getItems().add(currencyConverter.getCurrencies().get(i).getSign());
        }
    }

    @FXML
    public void doConvertion() {
        try {
            String wantedCurrency = chBox_currencies.getValue();
            double euroValue = Double.parseDouble(txtf_euroInput.getText());

            if(euroValue > 0 && !wantedCurrency.equals("")) {
                for (int i = 0; i < currencyConverter.getCurrencies().size(); i++) {
                    if (currencyConverter.getCurrencies().get(i).getSign().equals(wantedCurrency)) {
                        double wantedCurrencyValue = euroValue * currencyConverter.getCurrencies().get(i).getConvertValue();
                        txtf_convertedTo.setText(String.format("%.2f", wantedCurrencyValue));
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Please insert a number higher than zero / select a currency you want to convert your value to");
        }
    }
}