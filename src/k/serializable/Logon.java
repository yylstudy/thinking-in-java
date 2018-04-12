package k.serializable;

import java.io.Serializable;
import java.util.Date;

public class Logon implements Serializable{
	private Date date = new Date();
	private String username;
	//transient ��ʾ���Ǹ���ʱ�ֶΣ������ǣ���ʹʵ����Serializable�ӿڣ����Ǳ��ùؼ�������
	//�����ԣ����ᱻ�Զ����л�
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
