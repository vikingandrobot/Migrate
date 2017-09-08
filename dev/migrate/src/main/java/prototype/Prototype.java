package prototype;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.io.*;
import settings.*;


/**
 * Created by mathieu on 06.09.17.
 */
public class Prototype {

    private Settings settings;

    public Prototype() {
        settings = new Settings();
    }

    public void usingLibrary() {

        String user = "ftpvik54423";
        String password = "Uudm8#04";
        String host = "vikingandrobot.ch";
        int port=2121;

        String remoteFile="/httpdocs/lol.html";

        try
        {
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, port);
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no");
            System.out.println("Establishing Connection...");
            session.connect();
            System.out.println("Connection established.");
            System.out.println("Crating SFTP Channel.");
            ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
            sftpChannel.connect();
            System.out.println("SFTP Channel creatqed.");


            InputStream out= null;
            out= sftpChannel.get(remoteFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(out));
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
            br.close();

            sftpChannel.quit();
            session.disconnect();
        }
        catch(Exception e){System.err.print(e);}
    }


    public void migrate() {
        // Read Settings
        InputStream settingsFile = getClass().getResourceAsStream("/settings.txt");

        Settings.buildSettings(settingsFile);

        Runtime rt = Runtime.getRuntime();
        System.out.println("Trying to run a command...");
        try {
            Process pr = rt.exec("git commit -m \"commit de test...\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
