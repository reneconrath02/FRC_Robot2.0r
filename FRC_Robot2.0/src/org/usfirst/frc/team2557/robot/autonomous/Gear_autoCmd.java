package org.usfirst.frc.team2557.robot.autonomous;

import org.usfirst.frc.team2557.robot.commands.GearGrab_toggle;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Gear_autoCmd extends CommandGroup {

    public Gear_autoCmd() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	addParallel(new TimedGear(.95, .75));
    	addParallel(new GearToggle_autoCmd(false));
    	addSequential(new TimedDrive(.5, false, 0));
    	addSequential(new TimedDrive(1, false, .65));
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
    }
}
