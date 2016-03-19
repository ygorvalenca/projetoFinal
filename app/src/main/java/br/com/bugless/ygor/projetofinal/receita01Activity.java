package br.com.bugless.ygor.projetofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class receita01Activity extends AppCompatActivity {

    public static final String MODO_PREPARO = "Modo de preparo";
    public static final String INGREDIENTES = "Ingredientes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita01);
        TextView text01 = (TextView) findViewById(R.id.text01);
        text01.setText(showIngred());
        Button btn01 = (Button) findViewById(R.id.btn01);
        btn01.setText(MODO_PREPARO);

    }

    public void changeTextBnt(View view){
        Button btn01 = (Button) findViewById(R.id.btn01);
        TextView text01 = (TextView) findViewById(R.id.text01);

        if(btn01.getText().equals(MODO_PREPARO)){
            text01.setText(showModo());
            btn01.setText(INGREDIENTES);
        }else if (btn01.getText().equals(INGREDIENTES)){
            text01.setText(showIngred());
            btn01.setText(MODO_PREPARO);
        }
    }
    public String showIngred(){

        String ingredientes = "Ingredientes :\n\n";

        ingredientes+="\n" + "- 7 ovos";
        ingredientes+="\n" + "- 2 1/2 xícaras (chá) de açúcar";
        ingredientes+="\n" + "- 1 xícara (chá) de margarina";
        ingredientes+="\n" + "- 1/2 xícara (chá) de chocolate em pó";
        ingredientes+="\n" + "- 1 xícara (chá) de leite";
        ingredientes+="\n" + "- 2 xícaras (chá) de farinha de trigo";
        ingredientes+="\n" + "- 1 colher (chá) de fermento em pó";
        ingredientes+="\n" + "- 1/2 xícara (chá) de água";
        ingredientes+="\n" + "- 1/2 envelope de gelatina em pó";
        ingredientes+="\n" + "- 300 g de chocolate ao leite picado";
        ingredientes+="\n" + "- 1 lata de creme de leite";
        ingredientes+="\n" + "- Confeitos de chocolate";

        return ingredientes;

    }

    public String showModo(){

        String modo = "Mode De Preparo : \n\n";

           modo += "\n" + " - Prepare a massa: bata 4 gemas, 1 1/2 xícara (chá) de açúcar, a margarina e o chocolate em pó em uma batedeira. \n";
           modo += "\n" + " - Junte o leite, a farinha e o fermento peneirados. Acrescente 4 claras em neve. \n";
           modo += "\n" + " - Coloque em uma forma de 24 cm de diâmetro, untada e enfarinhada. Asse no forno, preaquecido, a 200 °C durante 30 minutos ou até, que, espetando um palito, ele saia limpo. \n";
           modo += "\n" + " - Deixe esfriar, corte uma tampa do bolo (de cerca de 1/3 da altura do bolo) e reserve. \n";
           modo += "\n" + " - Com uma faca, retire o meio do bolo, formando uma cavidade com 2 cm de lateral e fundo. \n";
           modo += "\n" + " - Para o marshmallow, em uma panela, misture 1 xícara (chá) de açúcar e a água. Leve ao fogo brando, sem mexer, até dar ponto de calda em fio. \n";
           modo += "\n" + " - Enquanto isso, bata 3 claras em neve e, sem parar de bater, adicione em fio a calda. Bata até dar ponto de marshmallow.\n";
           modo += "\n" + " - Deixe esfriar e misture a gelatina, preparada de acordo com as instruções da embalagem. \n";
           modo += "\n" + " - Coloque o marshmallow na cavidade do bolo e coloque a tampa reservada. Cubra com filme plástico e leve à geladeira por 1 hora. \n";
           modo += "\n" + " - Prepare a cobertura: derreta o chocolate em banho-maria e misture o creme de leite. Deixe amornar e cubra o bolo. Decore com confeitos de chocolate e sirva.\n";

        return modo;
    }
}
