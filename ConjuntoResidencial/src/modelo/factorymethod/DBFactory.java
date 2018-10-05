package modelo.factorymethod;

import java.util.Properties;


public class DBFactory {
	private static final String DB_FACTORY_PROPERTY_URL="META-INF/DBFactory.properties";
	private static final String DEFAULT_DB_CLASS_PROP ="defaultDBClass";

   
    public DBFactory() {
    }

    public static IDBAdapter getDefaultDBAdapter() {
    	try {
			Properties prop = PropertiesUtil.loadProperty(DB_FACTORY_PROPERTY_URL);
			String defaultDBClass = prop.getProperty(DEFAULT_DB_CLASS_PROP);
			System.out.println("DefaultDBClass ==>"+defaultDBClass);
			return (IDBAdapter)Class.forName(defaultDBClass).newInstance();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
    }

}