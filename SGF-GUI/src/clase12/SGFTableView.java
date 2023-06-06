/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase12;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.Profesor;
import javafx.application.Application;

import static javafx.application.Application.launch;
import javafx.collections.ListChangeListener;
import javafx.collections.ListChangeListener.Change;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class SGFTableView extends Application {

    @Override
    public void start(Stage stage) {

        AnchorPane ajusteVentana = new AnchorPane();
        ScrollPane barritas = new ScrollPane();

        // Crea una vista de tabla
        TableView<Persona> table = new TableView<>();
        barritas.setContent(ajusteVentana);

        // Crea columnas para la vista de tabla
        TableColumn<Persona, String> nameColumn = new TableColumn<>("Nombre");
//        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        TableColumn<Persona, String> lastNameColumn = new TableColumn<>("Apellido");
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        TableColumn<Persona, String> dniColumn = new TableColumn<>("DNI");
        dniColumn.setCellValueFactory(new PropertyValueFactory<>("numeroIdentificacion"));
        TableColumn<Persona, String> estadoCivilColumn = new TableColumn<>("Estado Civil");
        estadoCivilColumn.setCellValueFactory(new PropertyValueFactory<>("estadoCivil"));

        // Add the columns to the table view
        table.getColumns().addAll(nameColumn, lastNameColumn, dniColumn, estadoCivilColumn);

        // Pone algo de datos en la vista de tabla
        table.getItems().addAll(
                new Estudiante("Juan", "Perez", "123456789", "Soltero", "Lógica"),
                new Estudiante("Maria", "Gonzalez", "987654321", "Casada", "Cálculos"),
                new Empleado("Menier", "Suarez", "45698745", "Soltero", 2020, 10),
                new Profesor("Bartolo", "Monje", "25159753", "Soltero", 2010, 17, "Programación")
        );

        // Crea unas etiquetas
        String paraTitulo = "";
        for (Persona item : table.getItems()) {
            if (item instanceof Estudiante && !paraTitulo.contains("Estudiante")) {
                paraTitulo = paraTitulo + ((paraTitulo.isEmpty()) ? "" : ", ") + item.getClass().getSimpleName();
            }
            if (item instanceof Empleado && !paraTitulo.contains("Empleado")) {
                paraTitulo = paraTitulo + ((paraTitulo.isEmpty()) ? "" : ", ") + item.getClass().getSimpleName();
            }
            if (item instanceof Profesor && !paraTitulo.contains("Profesor")) {
                paraTitulo = paraTitulo + ((paraTitulo.isEmpty()) ? "" : ", ") + item.getClass().getSimpleName();
            }
        }

        Label label = new Label(paraTitulo);
        Label info2 = new Label("Etiquetas contenido elegido...");

        ObservableList<Persona> elElegido = table.getSelectionModel().getSelectedItems();

        elElegido.addListener(new ListChangeListener<Persona>() {
            @Override
            public void onChanged(Change<? extends Persona> cambio) {
                info2.setText(cambio.getList().toString());
              
            } //        elElegido.addListener(
        });

        label.setFont(new Font("Arial", 20));

        // Crea un VBox para compaginar la vista de las etiquetas y la vista de tabla.
        VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, info2);
        ajusteVentana.autosize();
        ajusteVentana.getChildren().add(vbox);
        AnchorPane.setTopAnchor(table, 25.0);
        AnchorPane.setBottomAnchor(table, 35.0);
        AnchorPane.setRightAnchor(table, 20.0);
        AnchorPane.setLeftAnchor(table, 23.0);
        barritas.setFitToWidth(true);
        VBox.setVgrow(barritas, Priority.ALWAYS);

        // Pone la escena
        Scene scene = new Scene(barritas);

        // Pone el estudio(la ventana)
        stage.setScene(scene);
        stage.setTitle("SGF TableView");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
