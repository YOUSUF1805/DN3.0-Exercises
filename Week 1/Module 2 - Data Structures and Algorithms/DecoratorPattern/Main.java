public class Main {
    public static void main(String[] args) {
        // Create a basic EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the EmailNotifier with SMSNotifierDecorator
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate the SMSNotifierDecorator with SlackNotifierDecorator
        Notifier slackSMSNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        // Send a notification
        System.out.println("Sending notification via Email, SMS, and Slack:");
        slackSMSNotifier.send("Hello, this is a multi-channel notification!");
    }
}
