package ifpr.pgua.eic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


//aplicação que permite ao usuário digitar uma frase,
//e ao clicar no botão, conta o número de vogais e apresenta
//o resultado na tela.

public class App extends Application{

    @Override
    public void start(Stage janela) throws Exception {
        
        System.out.println("Configurando a tela...");

        VBox root = new VBox();

        //root.setStyle("-fx-background-color: green");

        root.setAlignment(Pos.CENTER);

        Text texto = new Text("Digite uma frase:");
        root.getChildren().add(texto);

        TextField tfFrase = new TextField();
        root.getChildren().add(tfFrase);

        Button btAcao = new Button("Clique para contar as vogais");
        root.getChildren().add(btAcao); 

        Text txtResultado = new Text("Esperando processar...");
        root.getChildren().add(txtResultado);


        btAcao.setOnAction((event)->{
            String frase = tfFrase.getText();
            
            txtResultado.setText("Você digitou: "+frase+"\n\nEsta frase contém "+frase.length()+" caracteres.");
        });


        Scene cena = new Scene(root,600,400);

        janela.setScene(cena);

        janela.show();

        System.out.println("Terminei configuração!!");

    }
    

    public static void main(String[] args){
        launch(args);
    }


}