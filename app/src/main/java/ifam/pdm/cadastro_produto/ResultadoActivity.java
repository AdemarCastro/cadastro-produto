package ifam.pdm.cadastro_produto;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    private TextView tvNomeProduto, tvDescricaoProduto, tvPreco, tvQuantidade, tvDataEntrada, tvFornecedor, tvSetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvNomeProduto = findViewById(R.id.tvNomeProduto);
        tvDescricaoProduto = findViewById(R.id.tvDescricaoProduto);
        tvPreco = findViewById(R.id.tvPrecoProduto);
        tvQuantidade = findViewById(R.id.tvQuantidadeProduto);
        tvDataEntrada = findViewById(R.id.tvDataEntrada);
        tvFornecedor = findViewById(R.id.tvFornecedorProduto);
        tvSetor = findViewById(R.id.tvSetorProduto);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            tvNomeProduto.setText(extras.getString("nomeProduto"));
            tvDescricaoProduto.setText(extras.getString("descricaoProduto"));
            tvPreco.setText(extras.getString("preco"));
            tvQuantidade.setText(extras.getString("quantidade"));
            tvDataEntrada.setText(extras.getString("dataEntrada"));
            tvFornecedor.setText(extras.getString("fornecedor"));
            tvSetor.setText(extras.getString("setor"));
        }
    }
}
