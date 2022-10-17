package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button divideButton;
    private Button moduloButton;
    private Button powerButton;
    private Button clearButton;
    private Button multiplyButton;
    private Button digit9Button;
    private Button digit8Button;
    private Button digit7Button;
    private Button digit6Button;
    private Button digit5Button;
    private Button digit4Button;
    private Button digit3Button;
    private Button digit2Button;
    private Button digit1Button;
    private Button digit0Button;
    private Button subtractButton;
    private Button addButton;
    private Button backButton;
    private Button decimalButton;
    private Button resultButton;

    private EditText number;

    private TextView answer;
    private TextView state;

    private Double num1 = 0d;
    private Double num2 = 0d;
    private Double ans = 0d;
    private String action = "None";
  
}
static int factorial(int n)
{
int res = 1, i;
for (i=2; i<=n; i++)
res *= i;
return res;
}

static double medianCal(int  n,double in[])
{
    double m=0;	
    if(n%2==1)
    {
        m=in[((n+1)/2)-1];  
    }
    else
    {
        m=(in[n/2-1]+in[n/2])/2; 
    }
    return m;
}

static void meanCal(int n,int in[])
{

double sum=0;
for(int i=0;i<n;i++) 
{
    
    sum=sum+in[i];
}
    System.out.println("Mean :"+sum/n);  
}

static int mode(int a[],int n) {
    int maxValue = 0, maxCount = 0, i, j;

    for (i = 0; i < n; ++i) {
       int count = 0;
       for (j = 0; j < n; ++j) {
          if (a[j] == a[i])
          ++count;
       }

       if (count > maxCount) {
          maxCount = count;
          maxValue = a[i];
       }
    }
    return maxValue;
 }
 public static void main(String args[]){
    int n = 5;
    int a[] = {0,6,7,2,7};
    System.out.println("Mode ::"+mode(a,n));
 }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        answer = findViewById(R.id.answer);
        state = findViewById(R.id.state);

        divideButton = findViewById(R.id.divideButton);
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(number.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Please Enter a number: ", Toast.LENGTH_SHORT).show();
                } else {
                    String temp = number.getText().toString();
                    num1 = Double.parseDouble(temp);
                    action = "Divide";
                    number.setText("");
                    state.setText(temp);
                }
            }
        });

        moduloButton = findViewById(R.id.moduloButton);
        moduloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(number.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Enter a number please!", Toast.LENGTH_SHORT).show();
                } else {
                    String temp = number.getText().toString();
                    num1 = Double.parseDouble(temp);
                    action = "Modulo";
                    number.setText("");
                    state.setText(temp);
                }
            }
        });
        
        powerButton = findViewById(R.id.powerButton);
        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(number.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Enter a number please!", Toast.LENGTH_SHORT).show();
                } else {
                    String temp = number.getText().toString();
                    num1 = Double.parseDouble(temp);
                    action = "Power";
                    number.setText("");
                    state.setText(temp);
                }
            }
        });
        
        clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = ans;
                num2 = 0d;
                ans = 0d;
                action = "None";
                number.setText("");
                answer.setText("");
                state.setText("");
            }
        });
        
        multiplyButton = findViewById(R.id.multiplyButton);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(number.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Enter a number please!", Toast.LENGTH_SHORT).show();
                } else {
                    String temp = number.getText().toString();
                    num1 = Double.parseDouble(temp);
                    action = "Multiply";
                    state.setText(temp);
                    number.setText("");
                    
                }
            }
        });
        
        digit9Button = findViewById(R.id.digit9Button);
        digit9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pc = number.getText().toString();
                pc = pc + '9';
                number.setText(pc);
            }
        });

        digit8Button = findViewById(R.id.digit8Button);
        digit8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempr = number.getText().toString();
                tempr = tempr + '8';
                number.setText(tempr);
            }
        });

        digit7Button = findViewById(R.id.digit7Button);
        digit7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempe = number.getText().toString();
                tempe = tempe + '7';
                number.setText(tempe);
            }
        });

        digit6Button = findViewById(R.id.digit6Button);
        digit6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = number.getText().toString();
                temp = temp + '6';
                number.setText(temp);
            }
        });

        digit5Button = findViewById(R.id.digit5Button);
        digit5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = number.getText().toString();
                temp = temp + '5';
                number.setText(temp);
            }
        });

        digit4Button = findViewById(R.id.digit4Button);
        digit4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = number.getText().toString();
                temp = temp + '4';
                number.setText(temp);
            }
        });

        digit3Button = findViewById(R.id.digit3Button);
        digit3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tempx = number.getText().toString();
                tempx = tempx + '3';
                number.setText(tempx);
            }
        });

        digit2Button = findViewById(R.id.digit2Button);
        digit2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = number.getText().toString();
                temp = temp + '2';
                number.setText(temp);
            }
        });

        digit1Button = findViewById(R.id.digit1Button);
        digit1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = number.getText().toString();
                temp = temp + '1';
                number.setText(temp);
            }
        });

        digit0Button = findViewById(R.id.digit0Button);
        digit0Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = number.getText().toString();
                temp = temp + '0';
                number.setText(temp);
            }
        });

        subtractButton = findViewById(R.id.subtractButton);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(number.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Enter a number please!", Toast.LENGTH_SHORT).show();
                } else {
                    String temp = number.getText().toString();
                    num1 = Double.parseDouble(temp);
                    action = "Subtract";
                    number.setText("");
                    state.setText(temp);
                }
            }
        });

        addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(number.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Enter a number please!", Toast.LENGTH_SHORT).show();
                } else {
                    String temp = number.getText().toString();
                    num1 = Double.parseDouble(temp);
                    action = "Add";
                    number.setText("");
                    state.setText(temp);
                }
            }
        });

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = number.getText().toString();
                if(temp.length() != 0)
                {
                    temp = temp.substring(0, temp.length()-1);
                }
                number.setText(temp);
            }
        });

        decimalButton = findViewById(R.id.decimalButton);
        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = number.getText().toString();
                temp = temp + '.';
                number.setText(temp);
            }
        });

        resultButton = findViewById(R.id.resultButton);
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(number.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Enter a number here!", Toast.LENGTH_SHORT).show();
                } else {
                    String temp = number.getText().toString();
                    num2 = Double.parseDouble(temp);
                    switch (action) {
                        case "None":
                            ans = 0d;
                            break;
                        case "Add":
                            ans = num1+ num2  ;
                            break;
                        case "Subtract":
                            ans = num1 - num2;
                            break;
                        case "Multiply":
                            ans = num1 * num2 ;
                            break;
                        case "Divide":
                            ans = num1 / num2;
                            break;
                        case "Modulo":
                            ans = num1 % num2;
                            break;
                        case "Power":
                            ans = Math.pow(num1, num2);
                            break;
                    }
                    temp = Double.toString(ans);
                    answer.setText(temp);
                    number.setText(temp);
                    state.setText(temp);
                    num1 = ans;
                    num2 = 0d;
                    ans = 0d;
                    action = "None";
                }
            }
        });
    }
}
