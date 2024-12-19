package ifam.pdm.cadastro_produto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNomeProduto, etDescricaoProduto, etSetorProduto, etPrecoProduto, etQuantidadeProduto, etDataEntrada;
    private Spinner spinnerFornecedor;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializando os campos
        etNomeProduto = findViewById(R.id.etNomeProduto);
        etDescricaoProduto = findViewById(R.id.etDescricaoProduto);
        spinnerFornecedor = findViewById(R.id.spinnerFornecedor);
        etSetorProduto = findViewById(R.id.etSetorProduto);
        etPrecoProduto = findViewById(R.id.etPrecoProduto);
        etQuantidadeProduto = findViewById(R.id.etQuantidadeProduto);
        etDataEntrada = findViewById(R.id.etDataEntrada);
        btnSalvar = findViewById(R.id.btnSalvar);

        // Configurando o Spinner com uma lista de fornecedores
        String[] fornecedores = {"Fornecedor A", "Fornecedor B", "Fornecedor C"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, fornecedores);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFornecedor.setAdapter(adapter);

        // Evento de clique no botão Salvar
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = etNomeProduto.getText().toString();
                String descricao = etDescricaoProduto.getText().toString();
                String fornecedor = spinnerFornecedor.getSelectedItem().toString();
                String setor = etSetorProduto.getText().toString();
                String preco = etPrecoProduto.getText().toString();
                String quantidade = etQuantidadeProduto.getText().toString();
                String dataEntrada = etDataEntrada.getText().toString();

                // Exibe uma mensagem de sucesso ao salvar
                Toast.makeText(MainActivity.this, "Produto salvo com sucesso!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("nomeProduto", nome);
                intent.putExtra("descricaoProduto", descricao);
                intent.putExtra("preco", preco);
                intent.putExtra("quantidade", quantidade);
                intent.putExtra("dataEntrada", dataEntrada);
                intent.putExtra("fornecedor", fornecedor);
                intent.putExtra("setor", setor);

                startActivity(intent);
            }
        });
    }
}

