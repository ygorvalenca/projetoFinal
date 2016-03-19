package br.com.bugless.ygor.projetofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class receita02Activity extends AppCompatActivity {

    public static final String MODO_PREPARO = "Modo de preparo";
    public static final String INGREDIENTES = "Ingredientes";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita02);
        TextView text01 = (TextView) findViewById(R.id.text02);
        text01.setText(showIngred());
        Button btn02 = (Button) findViewById(R.id.btn02);
        btn02.setText(MODO_PREPARO);
    }

    public void changeTextBnt02(View view){
        Button btn02 = (Button) findViewById(R.id.btn02);
        TextView text02 = (TextView) findViewById(R.id.text02);

        if(btn02.getText().equals(MODO_PREPARO)){
            text02.setText(showModo());
            btn02.setText(INGREDIENTES);
        }else if (btn02.getText().equals(INGREDIENTES)){
            text02.setText(showIngred());
            btn02.setText(MODO_PREPARO);
        }
    }
    public String showIngred(){

        String ingredientes = "Ingredientes :\n\n";

        ingredientes+="\n" + "- 3 ovos.";
        ingredientes+="\n" + "- 2 xícaras de farinha de trigo peneirada.";
        ingredientes+="\n" + "- 3 colheres de manteiga (sem sal e em temperatura ambiente).";
        ingredientes+="\n" + "- ½ xícara de leite.";
        ingredientes+="\n" + "- 1 xícara de açúcar.";
        ingredientes+="\n" + "- ½ colher de canela em pó.";
        ingredientes+="\n" + "- 1 colher de sopa de fermento em pó.";


        return ingredientes;

    }

    public String showModo(){

        String modo = "Mode De Preparo : \n\n";

        modo += "\n" + "- Bata as claras em neve e reserve-as. \n";
        modo += "\n" + "- Junte a manteiga, o açúcar e as gemas e bata bem. \n";
        modo += "\n" + "- Coloque a farinha peneirada e o leite aos poucos, mas não pare de bater. \n";
        modo += "\n" + "- Acrescente a canela em pó e o fermento e misture bem. \n";
        modo += "\n" + "- Coloque as claras em neve. \n";
        modo += "\n" + "- Unte uma forma e coloque a massa no forno pré aquecido em 180 graus. \n";
        modo += "\n" + "- Aguarde por aproximadamente 30 minutos e espete um palito para saber se a massa está no ponto. \n";
        modo += "\n" + "- Corte o bolo ao meio e recheie com doce de leite. \n";
        modo += "\n" + "- Cubra o bolo e finalize polvilhando açúcar e canela. \n";

        return modo;
    }
}
