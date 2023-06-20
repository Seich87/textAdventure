import org.junit.jupiter.api.Test;
import service.Forms;

import static org.junit.jupiter.api.Assertions.*;


public class FormsTest {

    @Test
    public void executeTitle1_Selection1() {
        Forms.execute("Ты потерял память", "selection1");
        String titleTest = Forms.getTitle();
        String text1 = Forms.getText1();
        String text2 = Forms.getText2();
        String location = Forms.getLocation();
        assertEquals("Ты принял вызов. Поднимешься на мостик к их капитану?", titleTest);
        assertEquals("Подняться на мостик", text1);
        assertEquals("Отказаться подниматься на мостик", text2);
        assertEquals("/mySetServlet", location);
    }

    @Test
    public void executeTitle1_Selection2() {
        Forms.execute("Ты потерял память", "selection2");
        String titleTest = Forms.getTitle();
        String location = Forms.getLocation();
        assertEquals("Ты отклонил вызов. Поражение", titleTest);
        assertEquals("/lose", location);
    }

    @Test
    public void executeTitle2_Selection1() {
        Forms.execute("Ты принял вызов", "selection1");
        String titleTest = Forms.getTitle();
        String text1 = Forms.getText1();
        String text2 = Forms.getText2();
        String location = Forms.getLocation();
        assertEquals("Ты поднялся на мостик. Ты кто?", titleTest);
        assertEquals("Рассказать о себе правду", text1);
        assertEquals("Солгать о себе", text2);
        assertEquals("/mySetServlet", location);
    }

    @Test
    public void executeTitle2_Selection2() {
        Forms.execute("Ты принял вызов", "selection2");
        String titleTest = Forms.getTitle();
        String location = Forms.getLocation();
        assertEquals("Ты не прошел переговоры... Поражение!", titleTest);
        assertEquals("/lose", location);
    }

    @Test
    public void executeTitle3_Selection1() {
        Forms.execute("Ты поднялся на мостик", "selection1");
        String titleTest = Forms.getTitle();
        String text1 = Forms.getText1();
        String text2 = Forms.getText2();
        String location = Forms.getLocation();
        assertEquals("Тебя вернули домой. Победа!", titleTest);
        assertEquals("/lose", location);
    }

    @Test
    public void executeTitle3_Selection2() {
        Forms.execute("Ты поднялся на мостик", "selection2");
        String titleTest = Forms.getTitle();
        String location = Forms.getLocation();
        assertEquals("Твою ложь разоблачили. Поражение", titleTest);
        assertEquals("/lose", location);
    }
}
