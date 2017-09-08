package settings;

/**
 * Created by mathieu on 07.09.17.
 */
public class SettingsField {
    private String key;
    private String value;

    public SettingsField(String key) {
        this(key, null);
    }

    public SettingsField(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
