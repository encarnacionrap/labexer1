package ph.edu.raphaelencarnacionust.labexer1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class labexer1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labexer1);



        Button Compare = (Button) findViewById(R.id.Compare);
        Compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);


                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result;

                if(num1 > num2)
                    {
                        result = num1;
                    }
                else
                    {
                        result = num2;
                    }

                 resultTextView.setText("The larger number is: " + result);

            }
        });
    }
}
