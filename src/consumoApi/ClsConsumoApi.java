package consumoApi;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * @author jpablo
 */

public class ClsConsumoApi {
    
    public static void main(String[] args){
        try{
        // Hacer el llamado
            URL url = new URL("https://fakestoreapi.com/products?limit=5");
            HttpURLConnection cn = (HttpURLConnection) url.openConnection();
            cn.setRequestMethod("GET");
            cn.connect();
            
        // Es correcta
            int responseCode = cn.getResponseCode();
            if(responseCode != 200){
                throw new RuntimeException ("Ocurrio un error: " + responseCode);
            }else {
                
        // Scannear los datos                
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                
                while(scanner.hasNext()){
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
            
        // Traer informacion
            System.out.println(informationString);
        
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
