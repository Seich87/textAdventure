package service;

public class User {
    private static String name;
    private static String insertName;
    private static String sessionID;

    public static String getSessionID() {
        return sessionID;
    }

    public static void setSessionID(String sessionID) {
        User.sessionID = sessionID;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }

    public static String getInsertName() {
        return insertName;
    }

    public static void setInsertName(String insertName) {
        User.insertName = insertName;
    }
}
