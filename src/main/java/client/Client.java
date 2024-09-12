package client;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;

public class Client {

	public Properties properties;
	public String absPath = System.getProperty("user.dir");
	public String relPath = "\\src\\main\\resources\\config.properties";
//	String relPath = File.separator+"src"+File.separator+ "main"+File.separator+ "resources"+File.separator+"config.properties";
	public String configFilePath = absPath + relPath;
	public String baseURL;
	private String postsResource;
	private String commentsResource;
	private String albumsResource;
	private String photosResource;
	private String todosResource;
	private String usersResource;
	
	@BeforeMethod
	public void loadProp() {
		loadConfig();
		baseURL = properties.getProperty("baseURL");
		postsResource = properties.getProperty("posts");
		commentsResource =properties.getProperty("comments");
		albumsResource =properties.getProperty("albums");
		photosResource =properties.getProperty("photos");
		todosResource =properties.getProperty("todos");
		usersResource =properties.getProperty("users");
	}
	
	Endpoints
	
	// region Methods
	
	public Response get(String url) {
		
	}
	
	// region Helpers
	
	public void loadConfig() {
		
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(configFilePath);
			properties.load(fis);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String posts() {
		return baseURL + postsResource; 
	}
	
	public String comments() {
		return baseURL + commentsResource; 
	}
	
	public String albums() {
		return baseURL + albumsResource; 
	}
	
	public String photos() {
		return baseURL + photosResource; 
	}
	
	public String todos() {
		return baseURL + todosResource; 
	}
	
	public String users() {
		return baseURL + usersResource; 
	}
	
	
}

