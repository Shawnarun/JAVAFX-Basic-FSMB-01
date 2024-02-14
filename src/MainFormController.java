import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainFormController {


    public TextField txtNum1;
    public TextField txtNum2;
    public TextField txtResult;

    public void addTwoNumbers(ActionEvent actionEvent) {

        String num1 = txtNum1.getText();
        String num2 = txtNum2.getText();
        String result = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
        txtResult.setText(result);
    }

    public void btnClear(ActionEvent actionEvent) {

        txtNum1.setText("");
        txtNum2.setText("");
        txtResult.setText("");
    }
}
