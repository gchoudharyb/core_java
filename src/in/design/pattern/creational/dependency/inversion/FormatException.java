package in.design.pattern.creational.dependency.inversion;

import java.io.IOException;

public class FormatException extends IOException {
	
	public FormatException(Exception cause) {
		super(cause);
	}
}
