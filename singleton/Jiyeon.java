// Jiyeon.java
public class Jiyeon {
    public static final String LOGGER_ID;
    static {
        Logger logger = Logger.INSTANCE;
        logger.log("지연: 과제 작성 시작");
        logger.log("지연: 제출 완료");
        LOGGER_ID = logger.getId();
    }
}
