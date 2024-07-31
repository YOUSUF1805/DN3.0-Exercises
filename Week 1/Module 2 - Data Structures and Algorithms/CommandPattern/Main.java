public class Main {
    public static void main(String[] args) {
        // Create a Light object (Receiver)
        Light light = new Light();

        // Create Command objects
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Create RemoteControl (Invoker)
        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        System.out.println("Issuing Light On Command:");
        remote.pressButton();

        // Turn the light off
        remote.setCommand(lightOff);
        System.out.println("Issuing Light Off Command:");
        remote.pressButton();
    }
}
