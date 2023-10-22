
package grafica;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;


public class ClsGraficaCircular {
    
    public static ObservableList<PieChart.Data> obtenerNombres() {

        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
        
        data.add(new PieChart.Data("BaseDato", 13.18));
        data.add(new PieChart.Data("Progra2", 11.55));
        data.add(new PieChart.Data("Automatas", 8.10));
        data.add(new PieChart.Data("Electronica", 10.15));
        data.add(new PieChart.Data("Compiladores", 9.88));
    
        return data;    
        
    }
    
}
