package frc.robot.commands.arm;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

import java.util.function.Supplier;

/**
 * Command class built to take an axis and move the arm to what that axis is.
 * Moves the arm.
 */
public class ActuateArm extends Command {
    // Arm and supplier from constructor
    private final Arm m_arm;
    private final Supplier<Double> m_yAxisSpeedSupplier;

    /**
     * Constructs ActuateArm command.
     * @param arm The arm that is being manipulated.
     * @param yass The double provider to move the arm against.
     */
    public ActuateArm(
            Arm arm,
            Supplier<Double> yass
    ) {
        m_arm = arm;
        m_yAxisSpeedSupplier = yass;
        addRequirements(m_arm);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        // Simply sets the angle.
        m_arm.setAngle(45 * (m_yAxisSpeedSupplier.get() + 1));
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}
