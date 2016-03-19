package br.com.bugless.ygor.projetofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class receita05Activity extends AppCompatActivity {

    public static final String MODO_PREPARO = "Modo de preparo";
    public static final String INGREDIENTES = "Ingredientes";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita05);
        TextView text05 = (TextView) findViewById(R.id.text05);
        text05.setText(showIngred());
        Button btn05 = (Button) findViewById(R.id.btn05);
        btn05.setText(MODO_PREPARO);
       // setImage();

    }

    public void setImage(){
        ImageView imageView = (ImageView) findViewById(R.id.img_r5);
        imageView.setImageDrawable(getDrawable(R.drawable.bolo_floresta_negra));
    }

    public void changeTextBtn05(View view){
        Button btn05 = (Button) findViewById(R.id.btn05);
        TextView text05 = (TextView) findViewById(R.id.text05);

        if(btn05.getText().equals(MODO_PREPARO)){
            text05.setText(showModo());
            btn05.setText(INGREDIENTES);
        }else if (btn05.getText().equals(INGREDIENTES)){
            text05.setText(showIngred());
            btn05.setText(MODO_PREPARO);
        }
    }
    public String showIngred(){

        String ingredientes = "Ingredientes :\n\n";

        ingredientes+="\n" + "- 6 ovos.";
        ingredientes+="\n" + "- 2 xícaras (chá) de açúcar.";
        ingredientes+="\n" + "- 1 xícara (chá) de chocolate em pó.";
        ingredientes+="\n" + "- 1 xícara (chá) de óleo.";
        ingredientes+="\n" + "- 3 xícaras (chá) de farinha de trigo.";
        ingredientes+="\n" + "- 1 xícara (chá) de água quente.";
        ingredientes+="\n" + "- 1 colher (sopa cheia) de Pó Royal.";
        ingredientes+="\n" + "- Recheio e Cobertura:.";
        ingredientes+="\n" + "- 1 litro de chantilly.";
        ingredientes+="\n" + "- 400 g de cereja em calda.";
        ingredientes+="\n" + "- Raspas de chocolate para decorar (a gosto).";

        return ingredientes;

    }

    public String showModo(){

        String modo = "Mode De Preparo : \n\n";

        modo += "\n" + " - Bata as claras até o ponto neve.\n";
        modo += "\n" + " - Acrescente as gemas e o açucar, bata bem até que a massa fique homogênea e esbranquiçada.\n";
        modo += "\n" + " - Junte (um a um com batedeira ligada) o chocolate em pó, o óleo, a farinha e a água.\n";
        modo += "\n" + " - Por último acrescente o Pó Royal, misture-o na massa sem bater, somente mexendo delicadamente, com um garfo ou até mesmo com um dos batedores da batedeira.\n";
        modo += "\n" + " - Asse-o em assadeira média, untada e enfarinhada, ou se preferir, forre-a em todas as extremidades com papel manteiga, por 40 minutos.\n";
        modo += "\n" + " - Prepare o chantilly, e divida-o em 2 partes, uma para o recheio e outra para cobertura (a parte da cobertura, deve ser menor que a parte separada para o recheio).\n";
        modo += "\n" + " - Pique as cerejas (reserve cinco para decorar) e misture-as na parte do chantilly reservada para o recheio.\n";
        modo += "\n" + " - Conserve as 2 partes na geladeira.\n";
        modo += "\n" + " - Depois de frio, corte o bolo em 3 partes.\n";
        modo += "\n" + " - Coloque uma parte em prato de servir.\n";

        return modo;
    }
}

