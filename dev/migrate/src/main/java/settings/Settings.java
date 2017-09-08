package settings;

import java.io.*;
import java.util.LinkedList;
import java.util.stream.Stream;

/**
 * Created by mathieu on 07.09.17.
 */
public class Settings {
    private LinkedList<SettingsGroup> groups;

    public Settings() {
        groups = new LinkedList<SettingsGroup>();
    }

    public void addSettingsGroup(SettingsGroup group) {
        groups.add(group);
    }

    public static Settings buildSettings(InputStream settingsFile) {

        Settings settings = new Settings();

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(settingsFile, "UTF8"));
            String line;
            while ( ( line = in.readLine() ) != null) {
                System.out.println(line);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return settings;
    }

}
