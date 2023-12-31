package com.author.tagman.tagmanplugin.filesManager;

import com.author.tagman.tagmanplugin.constants.Constants;
import com.author.tagman.tagmanplugin.logger.DesigniteLogger;
import org.apache.commons.lang.SystemUtils;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;

public class AppProperties<Generics> {
    private String homePath = System.getProperty("user.home");
    private final java.util.Properties designiteProperties = new java.util.Properties();
    private final String settingFilePath;

    public AppProperties() {
        setHomePath();
        settingFilePath = Paths.get(homePath,
                Constants.DESIGNITE_SETTINGS_FOLDER,
                Constants.DESIGNITE_SETTINGS_FILE).toString();
        try {
            FileReader reader = new FileReader(settingFilePath);
            designiteProperties.load(reader);
        } catch (Exception e) {
            DesigniteLogger.getLogger().log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }
    }
    public String getSettingFilePath(){
        return settingFilePath;
    }
    private void setHomePath() {
        if(SystemUtils.IS_OS_WINDOWS){
            homePath = System.getenv("AppData");
        }
    }

    public void writeProperty(String property, Generics propertyValue) {
        designiteProperties.setProperty(property, String.valueOf(propertyValue));
    }

    public Generics getProperty(String property) {
        return (Generics) String.valueOf(designiteProperties.getProperty(property));
    }

    public void buildProperties() {
        try {
            designiteProperties.store(new FileOutputStream(settingFilePath), null);
        } catch (IOException e) {
            DesigniteLogger.getLogger().log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }
    }
}
