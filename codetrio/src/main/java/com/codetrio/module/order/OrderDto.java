package com.codetrio.module.order;


public class OrderDto {
	
	private String oSeq;
	private String oStateCd;
	private String oDate;
	private String oReceiver;
	private String oReceiverTel;
	private String oReceiverAddr;
	private String user_uSeq;
	
	private String opSeq;
	private String product_pSeq;
	private int bpAmount ;
	
	public String getOpSeq() {
		return opSeq;
	}
	public void setOpSeq(String opSeq) {
		this.opSeq = opSeq;
	}
	public String getProduct_pSeq() {
		return product_pSeq;
	}
	public void setProduct_pSeq(String product_pSeq) {
		this.product_pSeq = product_pSeq;
	}
	public int getBpAmount() {
		return bpAmount;
	}
	public void setBpAmount(int bpAmount) {
		this.bpAmount = bpAmount;
	}
	public String getoSeq() {
		return oSeq;
	}
	public void setoSeq(String oSeq) {
		this.oSeq = oSeq;
	}
	public String getoStateCd() {
		return oStateCd;
	}
	public void setoStateCd(String oStateCd) {
		this.oStateCd = oStateCd;
	}
	public String getoDate() {
		return oDate;
	}
	public void setoDate(String oDate) {
		this.oDate = oDate;
	}
	public String getoReceiver() {
		return oReceiver;
	}
	public void setoReceiver(String oReceiver) {
		this.oReceiver = oReceiver;
	}
	public String getoReceiverTel() {
		return oReceiverTel;
	}
	public void setoReceiverTel(String oReceiverTel) {
		this.oReceiverTel = oReceiverTel;
	}
	public String getoReceiverAddr() {
		return oReceiverAddr;
	}
	public void setoReceiverAddr(String oReceiverAddr) {
		this.oReceiverAddr = oReceiverAddr;
	}
	public String getUser_uSeq() {
		return user_uSeq;
	}
	public void setUser_uSeq(String user_uSeq) {
		this.user_uSeq = user_uSeq;
	}
	
}
