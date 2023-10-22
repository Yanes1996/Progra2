
package grafica;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class ClsMuestraGrafica extends Application{
    private PieChart grafica;

    
    public static void main (String[] args){
        Application.launch(args);
    }
    
@Override
    public void start(Stage stage){
        grafica = new PieChart();
        grafica.setTitle("Promedio de Notas de los Siguiente Cursos del 2023");
        
        grafica.setLegendSide(Side.LEFT);
        
        ObservableList<PieChart.Data> datosGrafica = ClsGraficaCircular.obtenerNombres();
        grafica.setData(datosGrafica);
        StackPane root = new StackPane(grafica);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Grafica Circular");
        stage.show();

    }
}
