import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;
import java.util.Map;

public class CSVReader {
    public static void main(String[] args) {
        String filename = "service-names-port-numbers.csv";
        String line;

        Map<String, Integer> portMap = new TreeMap<>();
        String targetHost = "localhost";
        int minPort = 1;
        int maxPort = 65535;


        for (Map.Entry<String, Integer> entry : portMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        for (int port = minPort; port <= maxPort; port++) {
            try {
                Socket socket = new Socket(targetHost, port);
                System.out.println( "Port:" + port );
                socket.close();
            } catch (IOException e) {

            }
        }

    }
}