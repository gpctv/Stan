// default package
// Generated 2018/7/11 �W�� 11:53:02 by Hibernate Tools 3.4.0.CR1
package com.dao;
import java.math.BigDecimal;

/**
 * Edi generated by hbm2java
 */
public class Edi implements java.io.Serializable {

	private BigDecimal datastream;
	private String description;
	private BigDecimal active;
	private String storer;

	public Edi() {
	}

	public Edi(BigDecimal datastream) {
		this.datastream = datastream;
	}

	public Edi(BigDecimal datastream, String description, BigDecimal active, String storer) {
		this.datastream = datastream;
		this.description = description;
		this.active = active;
		this.storer = storer;
	}

	public BigDecimal getDatastream() {
		return this.datastream;
	}

	public void setDatastream(BigDecimal datastream) {
		this.datastream = datastream;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getActive() {
		return this.active;
	}

	public void setActive(BigDecimal active) {
		this.active = active;
	}

	public String getStorer() {
		return this.storer;
	}

	public void setStorer(String storer) {
		this.storer = storer;
	}

}
