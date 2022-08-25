package queue.mail;

public class Mail {
	private String toWho;
	private String mailTitle;
	public Mail(String toWho, String mailTitle) {
		super();
		this.toWho = toWho;
		this.mailTitle = mailTitle;
	}
	public String getToWho() {
		return toWho;
	}
	public String getMailTitle() {
		return mailTitle;
	}
	@Override
	public String toString() {
		return "Mail [toWho=" + toWho + ", mailTitle=" + mailTitle + "]";
	}
	
	
	
	
	
	
}
