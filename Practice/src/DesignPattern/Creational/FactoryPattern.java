package DesignPattern.Creational;

public class FactoryPattern {
    public static void main(String[] args) {
        Notifications nf = Factory.getInstance("Push");
        nf.notifyUser();
    }
}

class Factory {
    public static Notifications getInstance(String className) {
        switch (className) {
            case "SMS":
                return new SMSNotifications();
            case "Email":
                return new EmailNotifications();
            case "Push":
                return new PushNotifications();
        }
        return null;
    }
}



interface Notifications{
    void notifyUser();
}

class SMSNotifications implements Notifications {
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification");

    }
}

class EmailNotifications implements Notifications {
    @Override
    public void notifyUser() {
        System.out.println("Email Notification");

    }
}

class PushNotifications implements Notifications {
    @Override
    public void notifyUser() {
        System.out.println("Push Notification");

    }
}
