/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase12;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalServicio;
import Entidad.Profesor;
import java.awt.RenderingHints;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javafx.application.Application;
import java.util.stream.Collectors;
import static javafx.application.Application.launch;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ListChangeListener.Change;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.StringConverter;

/**
 * Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione la información sobre las
 * personas vinculadas con la misma y que se pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio.
 * A continuación, se detalla qué tipo de información debe gestionar esta aplicación:
 *
 * • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de identificación y su estado civil. • Con
 * respecto a los empleados, sean del tipo que sean, hay que saber su año de incorporación a la facultad y qué número de
 * despacho tienen asignado. • En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados. •
 * Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen (lenguajes, matemáticas,
 * arquitectura, ...). • Sobre el personal de servicio, hay que conocer a qué sección están asignados (biblioteca, decanato,
 * secretaría, ...).
 *
 * El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A continuación, debe
 * programar las clases definidas en las que, además de los constructores, hay que desarrollar los métodos correspondientes a
 * las siguientes operaciones: • Cambio del estado civil de una persona. • Reasignación de despacho a un empleado. •
 * Matriculación de un estudiante en un nuevo curso. • Cambio de departamento de un profesor. • Traslado de sección de un
 * empleado del personal de servicio. • Imprimir toda la información de cada tipo de individuo.
 *
 * Incluya un programa de prueba que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 *
 * @author pc
 */
public class SGFTableView extends Application {

    @Override
    public void start(Stage stage) {

        AnchorPane ajusteVentana = new AnchorPane();
        ScrollPane barritas = new ScrollPane();
        ComboBox attObjeto = new ComboBox<>();
        HashMap<String, String> paraCampos = new HashMap<String, String>();

        // Crea un par VBox para compaginar la vista de las etiquetas y la vista de tabla.
        VBox vbox = new VBox();
        VBox textBoxes = new VBox();
        HBox laCaja = new HBox();

        VBox ventanaAjuste = new VBox();

        // Crea TextFields para los atributos correspondientes
        TextField att1TextField = new TextField();
        TextField att2TextField = new TextField();
        TextField att3TextField = new TextField();
        TextField att4TextField = new TextField();

        // Crea una vista de tabla
        TableView<Persona> table = new TableView<>();

        // Crea columnas para la vista de tabla
        // TableColumn<Objeto, Cadena>
        TableColumn<Persona, String> nameColumn = new TableColumn<>("Nombre");

        //new PropertyValueFactory<>(  .-cadena de la propiedad del objeto en general-.  )
//        nameColumn.setCellValueFactory(dato -> (dato.getValue().getNombre()));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        TableColumn<Persona, String> lastNameColumn = new TableColumn<>("Apellido");
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        TableColumn<Persona, String> dniColumn = new TableColumn<>("DNI");
        dniColumn.setCellValueFactory(new PropertyValueFactory<>("numeroIdentificacion"));
        TableColumn<Persona, String> estadoCivilColumn = new TableColumn<>("Estado Civil");
        estadoCivilColumn.setCellValueFactory(new PropertyValueFactory<>("estadoCivil"));

        // Suma las columnas a la vista de tabla.
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

                /*
                Inicio punto aparte
                
                En el proceso de obtener un par de campos de la clase del objeto se usó un Array Stream para:
                -Obtener el objeto
                -Obtener la clase
                -conseguir los campos de attributos y/o propiedades
                
                Luego se realiza la obtención de las cadenas que los representan internamente:
                 - Obtiene el elemento
                 - Se extrae el nombre
                
                Por ultimo se crea una List<String> conteniendo las propiedades.
                 */
                List<String> propiedades = Arrays.stream(cambio.getList().get(0).getClass().getDeclaredFields())
                        .map(campos -> campos.getName())
                        .collect(Collectors.toList());
                List<String> propiedadesPadre = Arrays.stream(cambio.getList().get(0).getClass().getSuperclass().getDeclaredFields())
                        .map(campos -> campos.getName())
                        .collect(Collectors.toList());

                for (String atributo : propiedadesPadre) {
                    System.out.println(atributo);
                }
                for (String propiedade : propiedades) {
                    System.out.println(propiedade);
                }

                //Fin punto aparte
            } //        elElegido.addListener(
        });

        //Crea una caja de selección para los objetos heredados (Usa objetos nuevos para obtener los atributos y propiedades)
        attObjeto.setItems(FXCollections.observableArrayList(
                new Empleado("", "", "", "", 0, 0),
                new Estudiante("", "", "", "", ""),
                new PersonalServicio("", "", "", "", 0, 0),
                new Profesor("", "", "", "", 0, 0),
                new Persona("", "", "", "")
        ));
        attObjeto.setConverter(new StringConverter<Persona>() {

            @Override
            public String toString(Persona object) {
                return object.getClass().getSimpleName();
            }

            @Override
            public Persona fromString(String string) {
                return null;
            }
        });

        attObjeto.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue obs, Object oldValue, Object newValue) {
                if (newValue != null) {
                    System.out.println("Selected: " + newValue.getClass().getName() + ","
                            + " Campos Declarados: " + newValue.getClass().getDeclaredFields().length
                            + ", Nombres atributos:" + Arrays.stream(newValue.getClass().getDeclaredFields())
                                    .map(campos -> campos.getName())
                                    .collect(Collectors.toList()));
                    System.out.println("Obs: " + obs.getValue().getClass().getSimpleName());
                    //Basado en el objeto elegido en la caja de selección se agrega nuevo contenido

                }
            }
        });

        //Basado en el objeto elegido en la caja de selección se agrega nuevo contenido
        attObjeto.setPromptText("No se ha elegido nada.");

        attObjeto.setOnAction(new EventHandler() {
            @Override
            public void handle(Event evento) {
                ventanaAjuste.getChildren().removeIf(nodo -> nodo instanceof Pane);
                if (!attObjeto.getSelectionModel().getSelectedItem().getClass().getSimpleName().equals("Persona")) {
                    for (Field declaredField : attObjeto.getSelectionModel().getSelectedItem().getClass().getDeclaredFields()) {
                        Pane estaSeleccion = new Pane();
                        estaSeleccion.setPadding(new Insets(3));
                        TextField elCampo = new TextField(declaredField.getName() + " va aquí");
                        elCampo.setTooltip(new Tooltip("Tiene " + declaredField.getName()));
                        elCampo.setId(declaredField.getName());
                        paraCampos.put(declaredField.getName(), "");
                        elCampo.setOnKeyTyped((KeyEvent eventito) -> {
                            paraCampos.replace(declaredField.getName(), elCampo.getText() + " ");
                        });
                        // paraCampos.put(declaredField.getName(), elCampo.getText());
                        System.out.println("Tiene :" + elCampo.getId());
                        estaSeleccion.getChildren().add(elCampo);
                        ventanaAjuste.getChildren().add(estaSeleccion);
                    }

                }

                if (!textBoxes.getChildren().contains(ventanaAjuste)) {
                    textBoxes.getChildren().add(ventanaAjuste);
                }
            }
        });

        // Crear el botón para agregar una fila nueva en la vista de Tabla
        Button botonCarga = new Button("Agregar Persona");
        botonCarga.setOnAction((ActionEvent event) -> {
            System.out.println("Activo : " + event);
            if (attObjeto.getSelectionModel().getSelectedIndex() != 4) {
                switch (attObjeto.getSelectionModel().getSelectedIndex()) {
                    case 0:
                        Empleado empleado = new Empleado(att1TextField.getText(), att2TextField.getText(), att3TextField.getText(), att4TextField.getText(), Integer.parseInt(paraCampos.get("yearIncorporacion").trim()), Integer.parseInt(paraCampos.get("numeroDespacho").trim()));

                        for (Map.Entry<String, String> conjunto : paraCampos.entrySet()) {

                            System.out.println("Es " + conjunto.getKey() + " y tiene " + conjunto.getValue());

                        }
                        table.getItems().add(empleado);
                        break;
                    case 1:
                        Estudiante estudiante = new Estudiante(att1TextField.getText(), att2TextField.getText(), att3TextField.getText(), att4TextField.getText(), "");
                        table.getItems().add(estudiante);
                        System.out.println("Es " + textBoxes.getChildren().filtered(node -> node instanceof TextField).size());

                        break;
                    case 2:
                        PersonalServicio personalServicio = new PersonalServicio(att1TextField.getText(), att2TextField.getText(), att3TextField.getText(), att4TextField.getText(), 0, 0);
                        System.out.println("Es " + textBoxes.getChildren().filtered(node -> node instanceof TextField).size());
                        table.getItems().add(personalServicio);
                        break;
                    case 3:
                        Profesor profesor = new Profesor(att1TextField.getText(), att2TextField.getText(), att3TextField.getText(), att4TextField.getText(), 0, 0);
                        System.out.println("Es " + textBoxes.getChildren().filtered(node -> node instanceof TextField).size());
                        table.getItems().add(profesor);
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                // Crea un nuevo objeto Persona con los campos de texto.
                Persona persona = new Persona(att1TextField.getText(), att2TextField.getText(), att3TextField.getText(), att4TextField.getText());

                // Suma el nuevo objeto Persona a la vista de Tabla.
                table.getItems().add(persona);
            }
        });

        label.setFont(new Font("Consolas", 18));

        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, info2);
        textBoxes.getChildren().addAll(new Label("Seleccione Persona:"), attObjeto, new Label("Nombre:"), att1TextField, new Label("Apellido:"), att2TextField, new Label("DNI :"), att3TextField, new Label("Estado Civil:"), att4TextField, botonCarga);
        textBoxes.setPadding(new Insets(19, 4, 4, 10));

        // Agregación al contenedor principal de la ventana.
        barritas.setContent(ajusteVentana);
        ajusteVentana.autosize();
        laCaja.getChildren().add(vbox);
        laCaja.getChildren().add(textBoxes);
        ajusteVentana.getChildren().add(laCaja);
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
        Servicios.SGF.inicio();

    }
}
