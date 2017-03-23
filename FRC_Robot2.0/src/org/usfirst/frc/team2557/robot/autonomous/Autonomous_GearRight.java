package org.usfirst.frc.team2557.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous_GearRight extends CommandGroup {

    public Autonomous_GearRight() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addSequential(new DistanceDrive_cmd(1.82, -.615), 6); //hopefully goes forward
    	addSequential(new AutoRotate(1, -40));                 //hopefully turns
    	addSequential(new DistanceDrive_cmd(0.72, -.5), 6);   //hopefully goes forward again
    	addSequential(new Gear_autoCmd());                    //hopefully puts gear on peg    
    	
    
    }
}
