package com.milano.minh.summation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnTong;
    EditText editA, editB;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Anonymous listener
//        Button btnTong = (Button) findViewById(R.id.btntong2so);
//        btnTong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EditText edita = (EditText) findViewById(R.id.edit_soa);
//                int a =Integer.parseInt(edita.getText()+ "");
//                EditText editb = (EditText) findViewById(R.id.edit_sob);
//                int b =Integer.parseInt(editb.getText()+ "");
//                TextView txtkq = (TextView) findViewById(R.id.txt_kq);
//                txtkq.setText((a+b)+ "");
//            }
//        });

        // Activity is listener
        btnTong = (Button) findViewById(R.id.btntong2so);
        btnTong.setOnClickListener(this);
        editA = (EditText) findViewById(R.id.edit_soa);
        editB = (EditText) findViewById(R.id.edit_sob);
        result = (TextView) findViewById(R.id.txt_kq);

    }

    // Activity is listener
    @Override
    public void onClick(View v) {
        int a =Integer.parseInt(editA.getText()+ "");
        int b =Integer.parseInt(editB.getText()+ "");
        result.setText((a+b)+ "");
    }

    // Onclick in XML
//    public void btn_tong2so(View view) {
//        EditText edita = (EditText) findViewById(R.id.edit_soa);
//        int a =Integer.parseInt(edita.getText()+ "");
//        EditText editb = (EditText) findViewById(R.id.edit_sob);
//        int b =Integer.parseInt(editb.getText()+ "");
//        TextView txtkq = (TextView) findViewById(R.id.txt_kq);
//        txtkq.setText((a+b)+ "");
//    }
}
