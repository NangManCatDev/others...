import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtNum1, edtNum2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod, btnReset;
    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Simple Calc");

        edtNum1=findViewById(R.id.edtNum1);
        edtNum2=findViewById(R.id.edtNum2);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
//        btnMod=findViewById(R.id.btnMod);
//        btnReset=findViewById(R.id.btnReset);
        txtResult=findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
//        btnMod.setOnClickListener(this);
//        btnReset.setOnClickListener(this);

    }
    public void onClick(View view) {
        String snum1 = edtNum1.getText().toString();
        String snum2 = edtNum2.getText().toString();
        int num1 = Integer.parseInt(snum1);
        int num2 = Integer.parseInt(snum2);
        int result = 0;

        if (view.getId() == R.id.btnAdd) {
            result = num1 + num2;
            txtResult.setText("결과: " + result + "");
        } else if (view.getId() == R.id.btnSub) {
            result = num1 - num2;
            txtResult.setText("결과: " + result + "");
        } else if (view.getId() == R.id.btnMul) {
            result = num1 * num2;
            txtResult.setText("결과: " + result + "");
        } else if (view.getId() == R.id.btnDiv) {
            result = num1 / num2;
            txtResult.setText("결과: " + result + "");
        }
//        else if (view.getId() == R.id.btnMod) {
//            result = num1 % num2;
//            txtResult.setText("결과: " + result + "");
//        } else if (view.getId() == R.id.btnReset) {
//            num1 = 0; num2 = 0; result = 0;
//            txtResult.setText("결과: " + result + "");
//        }
    }
}
