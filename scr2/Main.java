package scr2;

import scr2.commands.*;
import scr2.devices.*;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemp = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light", lightOn);
        remote.setCommand("thermostat", setTemp);

        remote.pressButton("light");
        remote.pressButton("thermostat");

        remote.undoButton();
    }
}
