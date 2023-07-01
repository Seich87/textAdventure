package service;


import java.util.HashMap;

public class Forms {

    public static HashMap<String, Integer> getMap() {
        return map;
    }



    public static void addMap(String name, int count) {
        map.put(name, count);
    }

    private static HashMap<String, Integer> map = new HashMap<>();
    private static String title;
    private static String text1;
    private static String text2;
    private static String location;

    public static String getBackground() {
        return background;
    }

    public static void setBackground(String background) {
        Forms.background = background;
    }

    private static String background;
    private static String name;
    private static String sessionID;


    public static String getSessionID() {
        return sessionID;
    }

    public static void setSessionID(String sessionID) {
        Forms.sessionID = sessionID;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Forms.name = name;
    }

    public static String getLocation() {
        return location;
    }

    public static void setLocation(String location) {
        Forms.location = location;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Forms.title = title;
    }

    public static String getText1() {
        return text1;
    }

    public static void setText1(String text1) {
        Forms.text1 = text1;
    }

    public static String getText2() {
        return text2;
    }

    public static void setText2(String text2) {
        Forms.text2 = text2;
    }

    public static void execute(String title, String selection) {

        if (title.contains("Ты потерял память")) {
            if (selection.equals("selection1")) {
                Forms.setBackground("/mycss/most.jpg");
                Forms.setTitle("Ты принял вызов...<br>Поднимешься на мостик к их капитану?");
                Forms.setText1("Подняться на мостик");
                Forms.setText2("Отказаться подниматься на мостик");
                Forms.setLocation("/mySetServlet");
            } else {
                Forms.setTitle("Ты отклонил вызов. Поражение");
                User.setInsertName(null);
                Forms.setLocation("/lose");
                Forms.setBackground("/mycss/lose.jpg");
            }


        } else if (title.contains("Ты принял вызов")) {
            if (selection.equals("selection1")) {
                Forms.setTitle("Ты поднялся на мостик. Ты кто?");
                Forms.setBackground("/mycss/capitan.jpg");
                Forms.setText1("Рассказать о себе правду");
                Forms.setText2("Солгать о себе");
                Forms.setLocation("/mySetServlet");
            } else {
                Forms.setTitle("Ты не прошел переговоры... Поражение!");
                User.setInsertName(null);
                Forms.setLocation("/lose");
                Forms.setBackground("/mycss/lose.jpg");
            }


        } else if (title.contains("Ты поднялся на мостик")) {
            if (selection.equals("selection1")) {
                User.setInsertName(null);
                Forms.setTitle("Тебя вернули домой. Победа!");
                Forms.setBackground("/mycss/win.jpg");
            } else {
                Forms.setTitle("Твою ложь разоблачили. Поражение");
                User.setInsertName(null);
                Forms.setBackground("/mycss/lose.jpg");
            }
            Forms.setLocation("/lose");
        }
    }
}
