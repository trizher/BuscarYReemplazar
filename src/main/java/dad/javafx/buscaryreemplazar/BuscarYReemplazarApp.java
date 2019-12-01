package dad.javafx.buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazarApp extends Application {
	private TextField buscarText, reemplazarText;
	private Button buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton;
	private CheckBox mayusMinCheck, buscarAtrasCheck, resaltarCheck, expresionCheck;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscarText = new TextField();
		
		reemplazarText = new TextField();
		
		buscarButton = new Button("Buscar");
		buscarButton.setPrefWidth(110);
		
		reemplazarButton = new Button("Reemplazar");
		reemplazarButton.setPrefWidth(110);

		reemplazarTodoButton = new Button("Reemplazar todo");
		reemplazarTodoButton.setPrefWidth(110);

		cerrarButton = new Button("Cerrar");
		cerrarButton.setPrefWidth(110);

		ayudaButton = new Button("Ayuda");
		ayudaButton.setPrefWidth(110);

		mayusMinCheck = new CheckBox("Mayúsculas y minúsculas");
		buscarAtrasCheck = new CheckBox("Buscar hacia atrás");
		resaltarCheck = new CheckBox("Resaltar resultados");
		expresionCheck = new CheckBox("Expresión regular");
		
		
		GridPane checks = new GridPane();
		checks.addRow(0, mayusMinCheck, buscarAtrasCheck);
		checks.addRow(1, expresionCheck, resaltarCheck);
		checks.setHgap(10);
		checks.setVgap(5);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		checks.getColumnConstraints().setAll(cols);
			
		cols[0].setPercentWidth(50);	
		cols[1].setPercentWidth(50);	
		
		GridPane panelCentral = new GridPane();
		panelCentral.setHgap(10);
		panelCentral.setVgap(5);
		panelCentral.setPadding(new Insets(5));
		
		panelCentral.addRow(0, new Label("Buscar:"), buscarText);
		panelCentral.addRow(1, new Label("Reemplazar con: "), reemplazarText);
		panelCentral.add(checks, 1, 2);
		
		ColumnConstraints [] cols2 = {
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		panelCentral.getColumnConstraints().setAll(cols2);
			
		cols2[1].setHgrow(Priority.ALWAYS);		
		
		
		VBox botonera = new VBox();
		botonera.getChildren().addAll(buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
		botonera.setPadding(new Insets(5));
		botonera.setSpacing(5);
		
		BorderPane root = new BorderPane();
		root.setCenter(panelCentral);
		root.setRight(botonera);
		
		Scene scene = new Scene(root, 720, 230);
		
		primaryStage.setTitle("Buscar y Reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {

		launch(args);
	}

}
