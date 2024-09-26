package common;

import java.io.Serializable;

public class RegisterBean implements Serializable{
	private String pname,ptktno,pcoachno,pcoachtyp;
	//Create Constroctor
	public RegisterBean() {}
	public String getPname() {
		return pname;
	}
	public String getPtktno() {
		return ptktno;
	}
	public String getPcoachno() {
		return pcoachno;
	}
	public String getPcoachtyp() {
		return pcoachtyp;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPtktno(String ptktno) {
		this.ptktno = ptktno;
	}
	public void setPcoachno(String pcoachno) {
		this.pcoachno = pcoachno;
	}
	public void setPcoachtyp(String pcoachtyp) {
		this.pcoachtyp = pcoachtyp;
	}

}
