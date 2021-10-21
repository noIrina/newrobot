public class RobotConnections implements RobotConnection {
    public void close(){
        System.err.println("Close");
    }
    public void moveRobotTo(int x, int y){
        System.err.println("заданная точка " +  x  + " ; " +  y);
    }
}

