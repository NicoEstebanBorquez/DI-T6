
import java.io.File;
import java.net.MalformedURLException;
import modelo.Alumno;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.fxutils.viewer.JasperViewerFX;

public class VistaController implements Initializable {

    private ArrayList<Alumno> lista = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //Alumnos DI (10)
        lista.add(new Alumno("45687525R", "DI", 6.5, "Córdoba"));
        lista.add(new Alumno("25348955F", "DI", 6.0, "Granada"));
        lista.add(new Alumno("53348527R", "DI", 7.0, "Granada"));
        lista.add(new Alumno("35226857R", "DI", 9.5, "Málaga"));
        lista.add(new Alumno("42269853J", "DI", 9.0, "León"));
        lista.add(new Alumno("45224588H", "DI", 8.0, "Madrid"));
        lista.add(new Alumno("55124290Y", "DI", 9.0, "Málaga"));
        lista.add(new Alumno("54223597S", "DI", 6.0, "Valencia"));
        lista.add(new Alumno("24552357W", "DI", 7.0, "Granada"));
        lista.add(new Alumno("25662347T", "DI", 6.0, "Cádiz"));

        //Alumnos PMDM (6)
        lista.add(new Alumno("22458536E", "PMDM", 5.5, "Madrid"));
        lista.add(new Alumno("35665874T", "PMDM", 7.0, "Barcelona"));
        lista.add(new Alumno("44586287Q", "PMDM", 6.0, "Huelva"));
        lista.add(new Alumno("25366741R", "PMDM", 8.5, "Granada"));
        lista.add(new Alumno("43562279Y", "PMDM", 8.0, "Granada"));
        lista.add(new Alumno("24536852Q", "PMDM", 9.0, "Málaga"));

        //Alumnos AD (5)
        lista.add(new Alumno("36548854R", "AD", 0.0, "Valencia"));
        lista.add(new Alumno("54658754G", "AD", 0.0, "Málaga"));
        lista.add(new Alumno("35663874T", "AD", 0.0, "Granada"));
        lista.add(new Alumno("54669875H", "AD", 0.0, "Almería"));
        lista.add(new Alumno("36555864J", "AD", 0.0, "Córdoba"));

        //Alumnos PSP (3)
        lista.add(new Alumno("23555689G", "PSP", 0.0, "Granada"));
        lista.add(new Alumno("24588564W", "PSP", 0.0, "Sevilla"));
        lista.add(new Alumno("54236588L", "PSP", 0.0, "Sevilla"));

        //Se ordena el ArrayList
        Collections.sort(lista);
    }

    @FXML
    Button btnMatriculadosDI, btnGraficoSectores, btnGraficoBarras, btnSalir;

    @FXML
    private void matriculadosDI(ActionEvent event) {
        try {
            //Se define la colección de datos que se usará en el informe
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(lista);

            //Ventana donde se monstrará el informe
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();

            //Declaración del visor de informes
            JasperViewerFX viewerfx = new JasperViewerFX(stage, "Informe - Alumnos DI", "/informes/InformeListadoDI.jasper",
                    new HashMap(), beanColDataSource);

            //Se muestra el informe en el visor
            viewerfx.show();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void graficoSectores(ActionEvent event) {
        try {
            //Se define la colección de datos que se usará en el informe
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(lista);

            //Ventana donde se monstrará el informe
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();

            //Declaración del visor de informes
            JasperViewerFX viewerfx = new JasperViewerFX(stage, "Gráfico de sectores", "/informes/InformeSectores.jasper",
                    new HashMap(), beanColDataSource);

            //Se muestra el informe en el visor
            viewerfx.show();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void graficoBarras(ActionEvent event) {

        try {
            //Se define la colección de datos que se usará en el informe
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(lista);

            //Ventana donde se monstrará el informe
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();

            //Declaración del visor de informes
            JasperViewerFX viewerfx = new JasperViewerFX(stage, "Gráfico de barras", "/informes/InformeBarras.jasper",
                    new HashMap(), beanColDataSource);

            //Se muestra el informe en el visor
            viewerfx.show();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    public void salir() {
        System.exit(0);
    }

    @FXML
    public void abrirAyuda(ActionEvent event) {
        try {
            //Se lee el fichero de configuracion de JavaHelp
            File fichero = new File("src\\Documentacion\\help_set.hs");
            URL hsURL = fichero.toURI().toURL(); 
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);

            // Se crea el objeto HelBroker que permite manejar las ventanas de JavaHelp
            HelpBroker hb = helpset.createHelpBroker();

            //Se muestra el sistema de ayuda */
            hb.setDisplayed(true);

        } catch (MalformedURLException ex) {
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HelpSetException ex) {
            Logger.getLogger(VistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
