package com.codetrio.module.product;

import java.util.List;

public class ProductDto {
		private String pSeq;
		private String vSeq;
		private int pCateCd;
		private String pName;
		private String pPrice;
		private String pOption;
		private String pStock;
		private String pRegDate;
		private String pMofDate;
		private String Vender_vSeq;
		private String vName;
		private int pDelNy;
		private List<String> seqList;
		
		
		
		public List<String> getSeqList() {
			return seqList;
		}
		public void setSeqList(List<String> seqList) {
			this.seqList = seqList;
		}
		public String getvSeq() {
			return vSeq;
		}
		public void setvSeq(String vSeq) {
			this.vSeq = vSeq;
		}
		public String getvName() {
			return vName;
		}
		public void setvName(String vName) {
			this.vName = vName;
		}
		public String getpSeq() {
			return pSeq;
		}
		public void setpSeq(String pSeq) {
			this.pSeq = pSeq;
		}
		public int getpCateCd() {
			return pCateCd;
		}
		public void setpCateCd(int pCateCd) {
			this.pCateCd = pCateCd;
		}
		public String getpName() {
			return pName;
		}
		public void setpName(String pName) {
			this.pName = pName;
		}
		public String getpPrice() {
			return pPrice;
		}
		public void setpPrice(String pPrice) {
			this.pPrice = pPrice;
		}
		public String getpOption() {
			return pOption;
		}
		public void setpOption(String pOption) {
			this.pOption = pOption;
		}
		public String getpStock() {
			return pStock;
		}
		public void setpStock(String pStock) {
			this.pStock = pStock;
		}
		public String getpRegDate() {
			return pRegDate;
		}
		public void setpRegDate(String pRegDate) {
			this.pRegDate = pRegDate;
		}
		public String getpMofDate() {
			return pMofDate;
		}
		public void setpMofDate(String pMofDate) {
			this.pMofDate = pMofDate;
		}
		public String getVender_vSeq() {
			return Vender_vSeq;
		}
		public void setVender_vSeq(String vender_vSeq) {
			Vender_vSeq = vender_vSeq;
		}
		public int getpDelNy() {
			return pDelNy;
		}
		public void setpDelNy(int pDelNy) {
			this.pDelNy = pDelNy;
		}
		
		
}
