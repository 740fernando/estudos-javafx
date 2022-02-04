# Interface Gráfica com JavaFX
Objetivo geral:
- Conhecer os fundamentos e a estrutura do JavaFX
- Conhecer os principais componentes visuais do JavaFX


## Visão geral do JavaFX e MVC
- JavaFX é o sucessor do Swing e Java AWT para interfaces gráficas com Java
- JavaFX pode ser usado para desktop, web e mobile
- Uma tela JavaFX pode ser montada via código Java, ou via código FXML

Com o lançamento do Java 11, JavaFX não é mais parte do JDK :

- O JavaFX precisa ser baixado e configurado separadamente
- É mantido pela Gluon: https://gluonhq.com/products/javafx/

JavaFX é projetado sobre o padrão MVC :

- Model - consiste nos dados de domínio e toda lógica de transformação desses dados
- Views - São as telas de interação com o usuário (UI)
- Controllers - São as classes responsáveis por tratar as interações do usuário com as views
(manipulação de eventos de interação com as telas)

![image](https://user-images.githubusercontent.com/32016610/151272504-6019b151-c80b-4795-aa5d-04e532f42eff.png)

- Hierarquia do JavaFX: https://docs.oracle.com/javase/8/javafx/api/overview-tree.html


# Alerts

![image](https://user-images.githubusercontent.com/32016610/151721280-5368d9ac-e954-4093-a779-087fb66287c7.png)

![image](https://user-images.githubusercontent.com/32016610/151721288-153aad45-f276-4f6b-9650-47b5194fd976.png)

![image](https://user-images.githubusercontent.com/32016610/151721341-3284226f-0ec2-456b-bab8-09ae2faf309f.png)

![image](https://user-images.githubusercontent.com/32016610/151721365-9a75d655-ed45-4533-9029-01a3472fbdf6.png)

![image](https://user-images.githubusercontent.com/32016610/151721377-91b0a17c-78ad-40d8-a1dd-59d00bde7f8a.png)

# Calculadora

![image](https://user-images.githubusercontent.com/32016610/151729477-51225dd3-7eb9-4d3a-9f96-4f55d1b96e7a.png)

![image](https://user-images.githubusercontent.com/32016610/151729486-368aa875-977e-4f5d-98ff-741310c7efad.png)

# ComboBox

![image](https://user-images.githubusercontent.com/32016610/152142730-f5802d53-52c2-4451-a1f5-c6897bfabe3e.png)



# Visão geral dos principais containers de layout

Container - Componenetes especiais, nos quais você pode acomodar outros componentes, para organizar sua tela.

- AnchorPane - Painel onde pode ancorar os elementos. Vantagem : Pode controlar a distancia que seu componente vai estar ancorado com relação ao AnchorPane.

![image](https://user-images.githubusercontent.com/32016610/152511037-fb7e5f3e-1eae-494b-9a9a-85c4cf3e7e00.png)


- GridPane - Um conteiner na forma de grade.

![image](https://user-images.githubusercontent.com/32016610/152511216-849622ec-ad57-4aaf-a214-6812b5918d98.png)

- SplitPane - Por padrão, vai colocar os componentes um ao lado do outro.

![image](https://user-images.githubusercontent.com/32016610/152512783-f543c72d-d3b2-4d86-a2f2-c21092bd2cc8.png)

 - VBox & HBox - São muito utilizados pela simplicidade. Vbox - O que for colocando, vai ser acomodado verticalmente um componente abaixo do outro que for inserido. HBox -
  O que for colocando, vai ser acomodado de forma horizontal, um componente ao lado do outro que for inserido.
  
  ![image](https://user-images.githubusercontent.com/32016610/152513499-94c5a6ad-254b-429d-ab68-e0d337f3a553.png)

  ![image](https://user-images.githubusercontent.com/32016610/152513663-3437d054-f0f2-44b5-a0a2-31b0b23152aa.png)


- BorderPane - BorderPane apresenta as CHILDREN nas posições superior, esquerda, direita, inferior e central.


![image](https://user-images.githubusercontent.com/32016610/152513711-647563cd-af06-4ff1-a16e-0380defdc567.png)

- ScrollPane - Um Control que fornece uma viewport rolada e recortada de seu conteúdo. Ele permite que o usuário role o conteúdo diretamente (panorâmica) ou usando barras de rolagem. O ScrollPane permite a especificação da política da barra de rolagem, que determina quando as barras de rolagem são exibidas: sempre, nunca ou somente quando são necessárias. A política da barra de rolagem pode ser especificada independentemente para as barras de rolagem horizontal e vertical.

![image](https://user-images.githubusercontent.com/32016610/152514361-ccb9ba30-d851-4eb2-a692-de8ecf0ffc9b.png)


