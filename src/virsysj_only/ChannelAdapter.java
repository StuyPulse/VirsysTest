/*
 * to change this template, choose tools | templates
 * and open the template in the editor.
 */
package virsysj_only;

import utilities.Channels;
import edu.wpi.first.wpilibj.templates.VirsysTest;

/**
 *
 * @author 694
 */
public class ChannelAdapter implements Channels {

    public int getLeftPwm() {
        return VirsysTest.LEFT_CHANNEL;
    }

    public int getRightPwm() {
        return VirsysTest.RIGHT_CHANNEL;
    }

    public int getArmPwm() {
        return 3;
    }

    public int getWristPwm() {
        return 4;
    }

    public int getGripPwm() {
        return 5;
    }
    //inports

    public int getArmAngle() {
        return 1;
    }

    public int getArmSpeed() {
        return 2;
    }

    public int getWristAngle() {
        return 3;
    }

    public int getWristSpeed() {
        return 4;
    }

    public int getLeftAngle() {
        return 5;
    }

    public int getLeftSpeed() {
        return 6;
    }

    public int getRightAngle() {
        return 7;
    }

    public int getRightSpeed() {
        return 8;
    }

    public int getHeadingRate() {
        return 9;
    }
    //encoder channel

    public int getChannelFrontLeftEncA() {
        return 1;
    }

    public int getChannelFrontLeftEncB() {
        return 2;
    }

    public int getChannelRearLeftEncA() {
        return 9;
    } // 3 / 4 were bad

    public int getChannelRearLeftEncB() {
        return 10;
    }

    public int getChannelFrontRightEncA() {
        return 5;
    }

    public int getChannelFrontRightEncB() {
        return 6;
    }

    public int getChannelRearRightEncA() {
        return 7;
    }

    public int getChannelRearRightEncB() {
        return 8;
    }
}
