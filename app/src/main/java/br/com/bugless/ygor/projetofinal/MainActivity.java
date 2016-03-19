package br.com.bugless.ygor.projetofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open01(View view){
        Intent chamar = new Intent(this,receita01Activity.class);
        startActivity(chamar);
    }

    public void open02(View view){
        Intent chamar = new Intent(this,receita02Activity.class);
        startActivity(chamar);
    }

    public void open03(View view){
        Intent chamar = new Intent(this,receita03Activity.class);
        startActivity(chamar);
    }
    public void open04(View view){
        Intent chamar = new Intent(this,receita04Activity.class);
        startActivity(chamar);
    }
    public void open05(View view){
        Intent chamar = new Intent(this,receita05Activity.class);
        startActivity(chamar);
    }
}
