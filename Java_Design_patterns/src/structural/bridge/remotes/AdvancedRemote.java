package structural.bridge.remotes;

import structural.bridge.devices.Device;

/**
 * We can extend the abstraction hierarchy classes independently of the device classes,
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
