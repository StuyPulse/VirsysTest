/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package virsysj_only;
import crio.hardware.CRIO;
import edu.stuy.VirsysTest;
import edu.wpi.first.wpilibj.Client;

/**
 *
 * @author 694
 */
public class Main {
    public static void main(String[] args) {
        CRIO.run(new VirsysTest(), new ChannelAdapter());
    }
}
