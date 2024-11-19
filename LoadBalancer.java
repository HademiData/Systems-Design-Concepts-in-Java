
import java.util.List;
import java.util.ArrayList;

public class LoadBalancer {
    
    //Distributes incoming traffic across multiple servers to
    // ensure no single server is overwhelmed, improving performance
    // and reliability.

    class LoadBalan {
        private List<String> servers = new ArrayList<>();
        private int currentIndex = -1;

        public LoadBalan() {
            servers.add("Server1");
            servers.add("Server2");
            servers.add("Server3");
        }

        public String getServer() {
            currentIndex = (currentIndex + 1) % servers.size();
            return servers.get(currentIndex);
        }

        public static void main(String[] args) {

            //creatin a new instance for the parent class
            LoadBalancer loadBalancer = new LoadBalancer();

            LoadBalan lb = loadBalancer.new LoadBalan();
            for (int i = 0; i < 5; i++) {
                System.out.println("Request directed to: " + lb.getServer());
            }
        }
    }


}
