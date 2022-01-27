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
