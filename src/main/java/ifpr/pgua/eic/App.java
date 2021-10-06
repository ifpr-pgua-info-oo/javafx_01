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
//e ao clicar no botão, conta o número de caracteres e apresenta
//o resultado na tela.

public class App extends Application{

    //método para configurar a interface. Recebe uma referência
    //para a janela, que será povoada com os componentes visuais.
    @Override
    public void start(Stage janela) throws Exception {
        
        System.out.println("Configurando a tela...");

        //cria um organizador do elementos visuais. Esse
        //organizador não é visível, porém ele faz parte do conteúdo
        //da janela. Nesse caso, irá organizar os elementos
        //em uma coluna.
        VBox root = new VBox();

        //troca a cor de fundo do organizador 
        //root.setStyle("-fx-background-color: green");

        //alinha o conteúdo do organizador no centro da tela.
        root.setAlignment(Pos.CENTER);

        //cria um elemento de texto que será mostrado na tela.
        Text texto = new Text("Digite uma frase:");
        //coloca o elemento texto dentro do organizador de layout.
        root.getChildren().add(texto);

        //cria um elemento para a entrada de texto 
        //permite o usuário digitar 
        TextField tfFrase = new TextField();
        root.getChildren().add(tfFrase);    

        //cria um elemento do tipo botão para o usuário clicar
        Button btAcao = new Button("Clique para contar as vogais");
        root.getChildren().add(btAcao); 

        Text txtResultado = new Text("Esperando processar...");
        root.getChildren().add(txtResultado);

        //configura a ação que o botão irá executar, quando
        //o usuário clicar.
        btAcao.setOnAction((event)->{
            //Aqui irão todas as instruções que serão
            //executadas quando o botão for clicado. Este é o corpo de
            //uma função.
            
            //pegando o texto digitado 
            String frase = tfFrase.getText();

            //colocando um texto na tela
            txtResultado.setText("Você digitou: "+frase+"\n\nEsta frase contém "+frase.length()+" caracteres.");
        });

        //criando uma cena para mostrar os elementos. Indicamos
        //qual será o organizador de layout utilizado, bem como
        //o tamanho da cena (largura=600, altura=400)
        Scene cena = new Scene(root,600,400);

        //colocamos a cena dentro da janela
        janela.setScene(cena);  

        //ajustamos o título da janela
        janela.setTitle("Minha primeira janela");

        //comando para mostrar a janela
        janela.show();

        System.out.println("Terminei configuração!!");

    }
    

    public static void main(String[] args){
        launch(args);
    }


}