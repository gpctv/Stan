package com.action;

import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.bo.EdiBo;
import com.dao.Edi;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EdiAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> storer;
	private EdiBo ediBo;
    private List<Edi> ediTable; 
    private String storerNum;
    private int total;
	 
     

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@JSON(name="rows")
	public List<Edi> getEdiTable() {
		return ediTable;
	}

	public void setEdiTable(List<Edi> ediTable) {
		this.ediTable = ediTable;
	}

	public void setStorerNum(String storerNum) {
		this.storerNum = storerNum;
	}


	public void setEdiBo(EdiBo ediBo) {
		this.ediBo = ediBo;
	}

	@JSON(name="storer")
public List<String> getStorer() {
		return storer;
	}

	public void setStorer(List<String> storer) {
		this.storer = storer;
	}

@Override
public String execute() throws Exception {
	// TODO Auto-generated method stub
	storer=this.ediBo.getStorer(); 
	return "success";
}

public String Storer() {
	this.storer=this.ediBo.getStorer();
	return "success";
}

public String table(){
	this.ediTable=  this.ediBo.getEdiTable();
	this.total=this.ediTable.size();
	 
	return "success";
}
public String update() {
	this.ediBo.saveEdi(this.ediTable);
	this.ediTable=  this.ediBo.getEdiTable();
	this.total=this.ediTable.size();
	
	return "success";
}
}
