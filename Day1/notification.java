public interface NotificationChannel {
    void send(String message);
}
 

public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
 
public class SmsChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
 
public class PushNotificationChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
 
 
public class NotificationService {
    private List<NotificationChannel> channels;
 
    public NotificationService(List<NotificationChannel> channels) {
        this.channels = channels;
    }
 
    public void notify(String message) {
        for (NotificationChannel channel : channels) {
            channel.send(message);
        }
    }
}