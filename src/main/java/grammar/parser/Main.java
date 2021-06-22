package grammar.parser;

import org.apache.log4j.Logger;

public class Main {

    private final static String COMMAND_LINE_MODE = "cmd";

    private final static Logger logger =  Logger.getLogger(Main.class);

    public static void main(String[] args) {
        if (args.length > 0 && COMMAND_LINE_MODE.equals(args[0])) {
            logger.info("CMD Mode Starting");
        } else {
            logger.info("GUI Mode Starting...");
        }
    }

}
