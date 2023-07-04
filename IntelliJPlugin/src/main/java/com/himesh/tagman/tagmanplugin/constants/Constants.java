package com.himesh.tagman.tagmanplugin.constants;

public class Constants {
    public static final String DESIGNITE_SETTINGS_FOLDER = ".designite";
    public static final String ANALYZE_ON_STARTUP = "AnalyzeOnStartup";
    public static final String DESIGNITE_SETTINGS_FILE = "designite.config";
    public static final String DESIGNITE_LOG_FOLDER = "designiteLogs";
    public static final String DESIGNTE_OUTPUT_FOLDER = "designiteOutput";
    public static final String DESIGNITE_JAR_FILE_PATH = "designiteJarPath";
    public static final String XMX_VALUE = "xmx";
    public static final String LICENSE_KEY = "licenseKey";
    public static final String DESIGNITEJAVA_JAR_FILENAME = "DesigniteJava.jar";
    public static final String DOWNLOAD_URL = "https://www.designite-tools.com/static/download/DJE/DesigniteJava.jar";
    public static final String TOOL_WINDOW_TEXT = "This tool window shows metrics and detected smells for the classes belonging to the currently active document.";
    public static final String TOOL_WINDOW_ANALYSIS_TEXT = "You need to analyze your project to see the code quality information in this window. You may analyze a project by selecting 'Tools -> DesigniteJava -> Analyze code'.";
    public static final String DJ_DOWNLOAD_Q_TEXT = "The plugin requires DesigniteJava (Enterprise edition)." +
            "\nYou may download it from http://www.designite-tools.com yourself\n" +
            "and set the path of the file in DesigniteJava's 'Settings' dialog\n" +
            "or we can fetch the required file for you." +
            "\nWould you like us to download the required file (DesigniteJava.jar) for you?";
    public static final String DJ_DOWNLOAD_TEXT = "We are set to download DesigniteJava.jar.\n" +
            "It might take some time depending on your internet connection.";
    public static final String ANALYSIS_TEXT = "TagCoder will now analyse this project in the background. \n" +
            "Please provide feedback for the smells at the markers next to the code.";

}
