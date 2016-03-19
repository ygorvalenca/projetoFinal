package br.com.bugless.ygor.projetofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class receita04Activity extends AppCompatActivity {

    public static final String MODO_PREPARO = "Modo de preparo";
    public static final String INGREDIENTES = "Ingredientes";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita04);
        TextView text04 = (TextView) findViewById(R.id.text04);
        text04.setText(showIngred());
        Button btn04 = (Button) findViewById(R.id.btn04);
        btn04.setText(MODO_PREPARO);

    }

    public void changeTextbtn04(View view){
        Button btn04 = (Button) findViewById(R.id.btn04);
        TextView text04 = (TextView) findViewById(R.id.text04);

        if(btn04.getText().equals(MODO_PREPARO)){
            text04.setText(showModo());
            btn04.setText(INGREDIENTES);
        }else if (btn04.getText().equals(INGREDIENTES)){
            text04.setText(showIngred());
            btn04.setText(MODO_PREPARO);
        }
    }
    public String showIngred(){

        String ingredientes = "Ingredientes :\n\n";

        ingredientes+="\n" + "- 2 ovos.";
        ingredientes+="\n" + "- 1 lata leite condensado.";
        ingredientes+="\n" + "- 1 xícara (chá) mel.";
        ingredientes+="\n" + "- 1 colher (sopa) café solúvel.";
        ingredientes+="\n" + "- 3 colheres (sopa) leite morno.";
        ingredientes+="\n" + "- 1 colher (chá) canela em pó.";
        ingredientes+="\n" + "- 1 colher (chá) cravo em pó.";
        ingredientes+="\n" + "- 2 xícaras farinha de trigo.";
        ingredientes+="\n" + "- 1 xícara chocolate em pó.";
        ingredientes+="\n" + "- 1 colher (sopa) fermento em pó.";
        ingredientes+="\n" + "- 1 barra de chocolate meio-amargo.";

        return ingredientes;

    }

    public String showModo(){

        String modo = "Mode De Preparo : \n\n";

        modo += "\n" + " - Bata ligeiramente os ovos e misture o leite condensado, mel, café solúvel dissolvido no leite morno, canela e cravo.\n";
        modo += "\n" + " - Acrescente a farinha, chocolate em pó e fermento.\n";
        modo += "\n" + " - Despeje em forma retangular (26 x 38cm) untada e enfarinhada e asse em forno pré-aquecido (180ºC) por cerca de 25min, faça o teste do palito e quando ele sair limpo, retire do forno.\n";
        modo += "\n" + " - Aguarde o bolo esfriar um pouco o desenforme\n";
        modo += "\n" + " - Para a cobertura derreta a barra de chocolate em banho-maria ou no microondas e despeje sobre o bolo, alisando com uma espátula.\n";

        return modo;
    }
}