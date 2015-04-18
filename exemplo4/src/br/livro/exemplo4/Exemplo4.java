package br.livro.exemplo4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exemplo4 extends Activity{
	@Override
	public void onCreate(Bundle iCiCle){
		super.onCreate(iCiCle);
		//Abre a tela XML
		setContentView(R.layout.layout_exemplo4);
	    //Busca o textView pelo id
		final EditText textNome = (EditText) findViewById(R.id.campoNome);
		final TextView textResultado = (TextView) findViewById(R.id.campoResultado);
		Button button = (Button) findViewById(R.id.botaoOK);
		//Informa o Listener
		button.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				String nome = textNome.getText().toString();  
				//Atualiza o texto
				textResultado.setText("Obrigado,"+nome);
				System.out.println();
				System.out.println("Teste segundfo");
			}
			
		});
	
	}

}
