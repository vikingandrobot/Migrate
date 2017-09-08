package settings;

import java.util.LinkedList;

/**
 * Created by mathieu on 07.09.17.
 */
public class SettingsGroup {
    private LinkedList<SettingsField> fields;

    public SettingsGroup() {
        fields = new LinkedList<SettingsField>();
    }

    public void addSettingsField(SettingsField field) {
        this.fields.add(field);
    }

}
