package config;

/**
 * 需要被实例化的服务类
 */
public class BambooServer {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayServerName(){
		return "I'm " + name + "! ";
	}
}
