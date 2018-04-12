package k.serializable;

import java.io.Serializable;
import java.util.Date;

public class Logon implements Serializable{
	private Date date = new Date();
	private String username;
	//transient 表示这是个临时字段，作用是：即使实现了Serializable接口，但是被该关键字修饰
	//的属性，不会被自动序列化
	private transient String password;
	Logon(String name, String pwd) {
	    username = name;
	    password = pwd;
	  }
	  public String toString() {
	    String pwd =
	      (password == null) ? "(n/a)" : password;
	    return "logon info: \n   " +
	      "username: " + username +
	      "\n   date: " + date.toString() +
	      "\n   password: " + pwd;
	  }
}
