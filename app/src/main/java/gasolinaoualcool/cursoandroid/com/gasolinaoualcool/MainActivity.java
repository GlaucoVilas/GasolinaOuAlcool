package gasolinaoualcool.cursoandroid.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        textResultado = (TextView) findViewById(R.id.textoResultadoId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String textoPrecoAl = precoAlcool.getText().toString();
                String textoPrecoGs = precoGasolina.getText().toString();

                Double valorAl = Double.parseDouble(textoPrecoAl);
                Double valorGs = Double.parseDouble(textoPrecoGs);

                double resultado = valorAl / valorGs;

                if (resultado >= 0.7){
                    textResultado.setText("É melhor utilizar Gasolina!");
                }else{
                    textResultado.setText("É melhor utilizar Álcool!");
                }

            }
        });


    }
}
