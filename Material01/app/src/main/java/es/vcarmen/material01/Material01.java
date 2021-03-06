package es.vcarmen.material01;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Material01 extends AppCompatActivity {

    private TextInputLayout controlNombre;
    private TextInputLayout controlCorreo;
    private TextInputLayout controlTelefono;

    private EditText campoNombre;
    private EditText campoCorreo;
    private EditText campoTelefono;

    private Button botonAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material01);
        initialize();
    }

    private void initialize(){
        controlNombre = (TextInputLayout) findViewById(R.id.controlNombre);
        controlCorreo = (TextInputLayout) findViewById(R.id.control_correo);
        controlTelefono = (TextInputLayout) findViewById(R.id.control_telefono);
        campoNombre = (EditText) findViewById(R.id.campo_nombre);
        campoCorreo = (EditText) findViewById(R.id.campo_correo);
        campoTelefono = (EditText) findViewById(R.id.campo_telefono);

        botonAceptar = (Button) findViewById(R.id.botonAceptar);


        campoNombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                controlNombre.setError(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        campoCorreo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                esCorreoValido(String.valueOf(charSequence));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        campoTelefono.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //esTelefonoValido(String.valueOf(charSequence));
                controlTelefono.setError(null);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        botonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarDatos();
            }
        });
    }

    private boolean esNombreValido(String nombre){
        Pattern patron = Pattern.compile("^[a-zA-Z]+$");
        if(!patron.matcher(nombre).matches() || nombre.length()>30){
            controlNombre.setError("ERROR EN NOMBRE");
            return false;
        }else{
            controlNombre.setError(null);
        }
        return true;
    }

    private boolean esCorreoValido(String correo){
        if(!Patterns.EMAIL_ADDRESS.matcher(correo).matches()){
            controlCorreo.setError("ERROR EN CORREO");
            return false;
        }else{
            controlCorreo.setError(null);
        }
        return true;
    }

    private boolean esTelefonoValido(String telefono){
        if(!Patterns.PHONE.matcher(telefono).matches()){
            controlTelefono.setError("ERROR EN TELEFONO");
            return false;
        }else{
            controlTelefono.setError(null);
        }
        return true;
    }

    private void validarDatos(){
        String nombre = controlNombre.getEditText().getText().toString();
        String correo = controlCorreo.getEditText().getText().toString();
        String telefono = controlTelefono.getEditText().getText().toString();
        boolean a = esNombreValido(nombre);
        boolean b = esCorreoValido(correo);
        boolean c = esTelefonoValido(telefono);
        if(a&&b&&c){
            Toast.makeText(this, "El registro es CORRECTO", Toast.LENGTH_SHORT).show();
        }
    }
}
