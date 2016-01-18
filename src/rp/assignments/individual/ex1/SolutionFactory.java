package rp.assignments.individual.ex1;

import rp.robotics.DifferentialDriveRobot;
import rp.systems.StoppableRunnable;

public class SolutionFactory {

    public static StoppableRunnable createEquilateralTriangleController(DifferentialDriveRobot _robot, Float _sideLength) {
        return new StoppableRunnable(){
        	
        	public void run()
        	{
        		for(int i=0;i<3;i++)
        		{
        			_robot.getDifferentialPilot().travel(1.0f);
        			_robot.getDifferentialPilot().rotate(120);
        		}
        	}
        	public void stop()
        	{
        		
        	}
        };
    }
    
    public static StoppableRunnable createSquareController( DifferentialDriveRobot _robot, Float _sideLength)
    {
    	return new StoppableRunnable(){
        	
        	public void run()
        	{
        		for(int i=0;i<4;i++)
        		{
        			_robot.getDifferentialPilot().travel(1.0f);
        			_robot.getDifferentialPilot().rotate(90);
        		}
        	}
        	public void stop()
        	{
        		
        	}
        };
    }
    public static StoppableRunnable createDecagonController( DifferentialDriveRobot _robot, Float _sideLength)
    {
    	return new StoppableRunnable(){
        	
        	public void run()
        	{
        		for(int i=0;i<10;i++)
        		{
        			_robot.getDifferentialPilot().travel(0.2f);
        			_robot.getDifferentialPilot().rotate(36);
        		}
        	}
        	public void stop()
        	{
        		
        	}
        };
    }
}