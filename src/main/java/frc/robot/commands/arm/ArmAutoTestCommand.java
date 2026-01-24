package frc.robot.commands.arm;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

/**
 * This class moves the arm to a certain angle over a certain set of time.
 */
public class ArmAutoTestCommand extends Command {
    private final Arm m_arm;
    private final double topAngle;

    public ArmAutoTestCommand(
            Arm arm,
            double topAngle
    ) {
        m_arm = arm;
        this.topAngle = topAngle;
    }

    @Override
    public void initialize() {
        System.out.println("Command hit received");
    }

    @Override
    public void execute() {
        m_arm.setAngle(topAngle);
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
    }
}
