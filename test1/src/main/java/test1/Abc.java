package test1;

import org.apache.log4j.Logger;

public class Abc {

	private static Logger logger=Logger.getLogger(Abc.class);
	public static void main(String[] args) {
		logger.debug("[DEBUG] ��� �α� ^^");
		logger.info("[INFO] ��� �α� ^^");
		logger.warn("[WARN] ��� �α�^^",new Exception("����^^��"));
		logger.error("[ERROR] ��� �α� ^^");
		logger.fatal("[FATAL] ��� �α� ^^");
		
		
	}
}
