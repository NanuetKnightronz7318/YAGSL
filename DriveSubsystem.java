package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {
  public CANSparkMax m_frontLeftDrive;
  public CANSparkMax m_frontRightDrive;
  public CANSparkMax m_rearLeftDrive;
  public CANSparkMax m_rearRightDrive;
  public CANSparkMax m_frontLeftRotate;
  public CANSparkMax m_frontRightRotate;
  public CANSparkMax m_rearLeftRotate;
  public CANSparkMax m_rearRightRotate;
  public DriveSubsystem() {
    m_frontLeftDrive = new CANSparkMax(Constants.DriveConstants.kFrontLeftDriveCANId, CANSparkLowLevel.MotorType.kBrushless);
    m_frontLeftDrive.setInverted(Constants.DriveConstants.kFrontLeftDriveInverted);

    m_frontRightDrive = new CANSparkMax(Constants.DriveConstants.kFrontRightDriveCANId, CANSparkLowLevel.MotorType.kBrushless);
    m_frontRightDrive.setInverted(Constants.DriveConstants.kFrontRightDriveInverted);

    m_rearLeftDrive = new CANSparkMax(Constants.DriveConstants.kRearLeftDriveCANId, CANSparkLowLevel.MotorType.kBrushless);
    m_rearLeftDrive.setInverted(Constants.DriveConstants.kRearLeftDriveInverted);

    m_rearRightDrive = new CANSparkMax(Constants.DriveConstants.kRearRightDriveCANId, CANSparkLowLevel.MotorType.kBrushless);
    m_rearRightDrive.setInverted(Constants.DriveConstants.kRearRightDriveInverted);m_frontLeft = new CANSparkMax(Constants.DriveTrainConstants.kFrontLeftCANId, CANSparkLowLevel.MotorType.kBrushless);
    
    m_frontLeftRotate = new CANSparkMax(Constants.DriveConstants.kFrontLeftRotateCANId, CANSparkLowLevel.MotorType.kBrushless);
    m_frontLeftRotate.setInverted(Constants.DriveConstants.kFrontLeftRotateInverted);

    m_frontRightRotate = new CANSparkMax(Constants.DriveConstants.kFrontRightRotateCANId, CANSparkLowLevel.MotorType.kBrushless);
    m_frontRightRotate.setInverted(Constants.DriveConstants.kFrontRightRotateInverted);

    m_rearLeftRotate = new CANSparkMax(Constants.DriveConstants.kRearLeftRotateCANId, CANSparkLowLevel.MotorType.kBrushless);
    m_rearLeftRotate.setInverted(Constants.DriveConstants.kRearLeftRotateInverted);

    m_rearRightRotate = new CANSparkMax(Constants.DriveConstants.kRearRightRotateCANId, CANSparkLowLevel.MotorType.kBrushless);
    m_rearRightRotate.setInverted(Constants.DriveConstants.kRearRightRotateInverted);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
