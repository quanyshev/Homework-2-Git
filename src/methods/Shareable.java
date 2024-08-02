package methods;

public interface Shareable {
    enum sharingPlatform {
        Gmail,
        Whatsapp,
        Sms,
        Telegram
    }
    void share (sharingPlatform platform);
}
