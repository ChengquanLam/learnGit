
package reg;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import java.util.HashMap;

public class RegisterAction extends ActionSupport{
	private String username;
	private String password;
	private String question;
	private String sex;
	private boolean accept;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isAccept() {
		return accept;
	}
	public void setAccept(boolean accept) {
		this.accept = accept;
	}
	public Map<String, String> getQuestionList(){
		Map<String, String> questionList = new HashMap<String, String>();
		questionList.put("1", "您的生日");
		questionList.put("2", "您父亲的生日");
		questionList.put("3", "您母亲的生日");
		return questionList;
	}
	public String execute() {
		return SUCCESS;
	}
	public String register_enter() {
		return "register_enter_page";
	}
}
