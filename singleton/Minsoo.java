// Minsoo.java
public class Minsoo {
    public static final String LOGGER_ID;
    static {
        Logger logger = Logger.INSTANCE;
        logger.log("민수: 공부 시작");
        logger.log("민수: 복습 완료");
        LOGGER_ID = logger.getId();
    }
}
