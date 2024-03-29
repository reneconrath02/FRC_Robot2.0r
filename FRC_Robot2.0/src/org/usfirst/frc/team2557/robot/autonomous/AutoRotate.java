package org.usfirst.frc.team2557.robot.autonomous;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoRotate extends Command {

    public AutoRotate(double x, double y double z) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.navX.setAngle(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while(RobotMap.CAngle <x){
    		RobotMap.robotDrive.arcadeDrive.set(y, z);
    		
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
