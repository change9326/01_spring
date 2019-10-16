package design_pattern.adapter;
//使用者
public class Hotel {

	//德国标准的两眼插座
	private DBSocket socket;
	
	public void setDBSocket(DBSocket socket){
		this.socket = socket;
	}
	
	public void charge(){
		socket.method();
	}
}
