package in.design.pattern.structural.decorator.self;

public class HtmlMessageDecorator implements Messgae {

	private Messgae message;

	public HtmlMessageDecorator(Messgae message) {
		super();
		this.message = message;
	}

	@Override
	public String createMessage() {

		return "<html>" + message.createMessage() + "</html>";
	}

}
