package Maracacao;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import ServicosBarbeiro.Servicos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class MarcacaoBarbeiroController{
	
	}

	final String FILENAME = "agenda.dat";
	ArrayList<Servicos> lista = new ArrayList<Servicos>();
	ObjectFile of = new ObjectFile(FILENAME);
	
	@FXML // fx:id="listNomes"
	private ListView<String> listNomes;
	
	@FXML // fx:id="txtNome"
	private TextField txtNome;
	
	@FXML // fx:id="txtNumero"
	private TextField txtNumero;
	
	@FXML // fx:id="txtNumero"
	private TextField txt;
	
	@FXML
	protected void novoContacto(ActionEvent event) {
		
		// Adicionar um novo item na lista
		// ...
		String nome = txtNome.getText();
		String numero = txtNumero.getText();
		lista.add(new Servicos (nome,numero));
		
		// Escrever a lista atualizada
		// ...
		of.writeObjectFile(lista);
		
		// Limpar e carregar os nomes atualizados na ListView
		// ...
		listNomes.getItems().clear();
		for (Servicos contacto : lista) {
			listNomes.getItems().add(Servicos.nome);
		}
		txtNome.clear();
		txtNumero.clear();
	}
	
	@FXML
	protected void verContacto(MouseEvent event) {
		
		// Apresentar um Alert com o nome e o número do contacto selecionado
		// ...
		int i = listNomes.getSelectionModel().getSelectedIndex();
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Detalhes do contacto");
		alert.setHeaderText(lista.get(i).nome);
		alert.setHeaderText(lista.get(i).numero);
		alert.show();
	}
	
	@SuppressWarnings("unchecked")
	public void initialize(URL location, ResourceBundle resources) {
		
		// Criar o ficheiro caso não exista
		// ...
		File file = new File(FILENAME);
		if (!file.exists()) {
			of.writeObjectFile(lista);
		}
		
		// Ler o conteúdo do ficheiro
		// ...
		lista =(ArrayList<Servicos>) ObjectFile.readObjectFile();
		
		
		// Carregar os nomes dos contactos na ListView
		// ...
		for (Servicos contacto : lista) {
			listNomes.getItems().add(contacto.nome);
		}
	
}
