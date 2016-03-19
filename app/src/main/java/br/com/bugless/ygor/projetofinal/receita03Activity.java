package br.com.bugless.ygor.projetofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class receita03Activity extends AppCompatActivity {


    public static final String MODO_PREPARO = "Modo de preparo";
    public static final String INGREDIENTES = "Ingredientes";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita03);
        TextView text03 = (TextView) findViewById(R.id.text03);
        text03.setText(showIngred());
        Button btn03 = (Button) findViewById(R.id.btn03);
        btn03.setText(MODO_PREPARO);

    }

    public void changeTextBnt03(View view) {
        Button btn03 = (Button) findViewById(R.id.btn03);
        TextView text03 = (TextView) findViewById(R.id.text03);

        if (btn03.getText().equals(MODO_PREPARO)) {
            text03.setText(showModo());
            btn03.setText(INGREDIENTES);
        } else if (btn03.getText().equals(INGREDIENTES)) {
            text03.setText(showIngred());
            btn03.setText(MODO_PREPARO);
        }
    }

    public String showIngred() {

        String ingredientes = "Ingredientes do Bolo :\n\n";

        ingredientes += "\n" + "- 3/4 de xícara de óleo de soja.";
        ingredientes += "\n" + "- 1 colher de fermento em pó.";
        ingredientes += "\n" + "- 1 xícara de chocolate em pó.";
        ingredientes += "\n" + "- 1 xícara de leite.";
        ingredientes += "\n" + "- 2 ovos.";
        ingredientes += "\n" + "- 20 bolachas de Oreo triturada sem recheio.";
        ingredientes += "\n" + "- 2 xícaras de açúcar.";
        ingredientes += "\n" + "- 3 xícaras de farinha de trigo.";
        ingredientes += "\n\n" + "Ingredientes do Brigadeiro de leite Ninho: \n\n";
        ingredientes += "\n" + "- 3 latas de leite condensado.";
        ingredientes += "\n" + "- 1 lata de creme de leite.";
        ingredientes += "\n" + "- 2 colheres de manteiga.";
        ingredientes += "\n" + "- 8 colheres de Leite Ninho.";


        return ingredientes;

    }

    public String showModo() {

        String modo = "Mode De Preparo do Bolo: \n\n";

        modo += "\n" + " - Em uma tigela, coloque todos os ingredientes secos (chocolate, açúcar, fermento e farinha e a bolacha triturada. \n";
        modo += "\n" + " - Misture e vá acrescentando, aos poucos, o restante dos ingredientes (leite, óleo e ovos). \n";
        modo += "\n" + " - Leve ao forno pré-aquecido e asse por cerca de 25 minutos ou até dourar. \n";
        modo += "\n" + " - Deixe esfriar e reserve. \n";
        modo += "\n\n" + "Modo de preparo do Prigadeiro: \n\n";
        modo += "\n" + " - Colocar todos os ingredientes em uma panela e levar ao fogo por 17 minutos, mexendo sem. \n";
        modo += "\n" + " - Parar, tirar da panela e levar para esfriar e cubra o bolo. \n";


        return modo;
    }
}