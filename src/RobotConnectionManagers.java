public class RobotConnectionManagers implements RobotConnectionManager {

    public RobotConnections getConnection() { // бросает k эксепшенов тебе в метод

            return new RobotConnections();
        }
    }


