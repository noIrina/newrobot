public class Main {


    public static void main(String[] args) {
        RobotConnections robotCon = new RobotConnections();
        robotCon.moveRobotTo(3, 4);
        RobotConnectionManagers robotConnectionManager = new RobotConnectionManagers();
        Main.moveRobot(robotConnectionManager, 5, 4);
    }


    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection connection = null;
        for (int i = 0; i < 3; ++i) {
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException("3 попытки потерпели неудачу");
                }
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception ex) {
                }
            }
        }
    }
}


