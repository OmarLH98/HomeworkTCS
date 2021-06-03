package ps1;

public class Customer {
	
	private String userName;
	private int connectionId;
	private String type;
	private int planType;
	
	public Customer() {}

	public Customer(String userName, int connectionId, String type, int planType) {
		super();
		this.userName = userName;
		this.connectionId = connectionId;
		this.type = type;
		this.planType = planType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(int connectionId) {
		this.connectionId = connectionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPlanType() {
		return planType;
	}

	public void setPlanType(int planType) {
		this.planType = planType;
	}

	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", connectionId=" + connectionId + ", type=" + type + ", planType="
				+ planType + "]";
	}

}
