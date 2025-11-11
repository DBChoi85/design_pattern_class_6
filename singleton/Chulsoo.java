// Chulsoo.java
public class Chulsoo {
    public static final String LOGGER_ID;
    static {
        Logger logger = Logger.INSTANCE;
        logger.log("철수: 발표 준비 중");
        LOGGER_ID = logger.getId();
    }
}
