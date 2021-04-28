package in.design.pattern.creational.prototype;

public class ConnectionClass implements Cloneable {
	private StringBuffer connectionName;

	public ConnectionClass(StringBuffer connectionName) {
		super();
		this.connectionName = connectionName;
	}

	public StringBuffer getConnectionName() {
		return connectionName;
	}

	public void setConnectionName(StringBuffer connectionName) {
		this.connectionName = connectionName;
	}

	@Override
	public ConnectionClass clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ConnectionClass connectionClass = (ConnectionClass) super.clone();
		connectionClass.setConnectionName(new StringBuffer("Default Value"));
		return connectionClass;
	}

	@Override
	public String toString() {
		return "ConnectionClass [connectionName=" + connectionName + "]";
	}

}
