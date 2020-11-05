package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private Button login;
    private Button registered;
    private TextView status;
    private TextView passwork;
    private TextView account_number;
    private TextView TextView5;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.login);
        account_number = (EditText) findViewById(R.id.account);
        passwork = (EditText) findViewById(R.id.passwork);
        status = (TextView) findViewById(R.id.status);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String[] account = {"user1", "Matt", "Hsieh"};
                String[] password = {"password", "login", "pass"};
                String[] account1 = {"登出"};
                for (int i = 0; i < account.length; i++) { // 用一個迴圈把帳號跟密碼從陣列取出
                    if (login.getText().toString().equals(account1[i])) {
                        login.setText("登入");
                        status.setText("已登出");
                        Toast toast = Toast.makeText(MainActivity.this,
                                "登出成功", Toast.LENGTH_LONG);
                        //顯示Toast
                        toast.show();
                        break;


                    } else if (!account_number.getText().toString().equals(account[i])
                            || !passwork.getText().toString().equals(password[i])) {
                        Toast toast = Toast.makeText(MainActivity.this,
                                "登入失敗", Toast.LENGTH_LONG);
                        //顯示Toast
                        toast.show();
                        break;


                    } else {
                        login.setText("登出");
                        status.setText("已登入");
                        Toast toast = Toast.makeText(MainActivity.this,
                                "登入成功", Toast.LENGTH_LONG);
                        //顯示Toast
                        toast.show();
                        break;
                    }





                }

            }



        });

        registered = (Button) findViewById(R.id.registered);
        status = (TextView)findViewById(R.id.status);
        registered.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                status.setText("註冊成功");
                Toast toast = Toast.makeText(MainActivity.this,
                        "註冊成功", Toast.LENGTH_LONG);
            }

        } );
    }
}







