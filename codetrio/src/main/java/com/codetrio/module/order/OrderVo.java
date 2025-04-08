package com.codetrio.module.order;

import com.codetrio.module.BaseVo;

public class OrderVo extends BaseVo {
	
	private String oSeq;
	private String oStateCd;

	public String getoStateCd() {
		return oStateCd;
	}

	public void setoStateCd(String oStateCd) {
		this.oStateCd = oStateCd;
	}

	public String getoSeq() {
		return oSeq;
	}

	public void setoSeq(String oSeq) {
		this.oSeq = oSeq;
	}

}
