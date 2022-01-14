/**
 * Módulo: DI
 * Archivo: DIT55124290Y.java
 * Objetivo: Dar entrada a la aplicación a través del método start()
 * Equipo/Personas: Nicolás Esteban Bórquez
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Esta clase es que incluye el método start(), que es la entrada a la aplicación
 * Esta clase hereda de Application.
 * @see Application
 * 
 * @author Nicolás Esteban Borquez
 * @version 1.0 
 */
public class DIT555124290Y extends Application {

    /**
     * Método que inicia la ventana principal de la aplicación.
     *
     * @param stage Ventana principal creado por la aplicación en sí
     * y se pasa como argumento al método start() de la clase Application
     * @throws Exception El método start puede lanzar una excepción de tipo Exception 
     * si la ventana no es creada correctamente.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Vista.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Informes 1.0");
        stage.show();
    }

    /**
     * Método de entrada a toda aplicación Java. 
     * @param args Argumentos pasados por la línea de comandos
     */
    public static void main(String[] args) {
        launch(args);
    }
}
