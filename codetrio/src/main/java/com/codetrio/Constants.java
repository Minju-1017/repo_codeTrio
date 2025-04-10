package com.codetrio;

import org.springframework.stereotype.Component;

@Component
public class Constants {
	
	// Url Path
	public static String ABBREVIATION_HO_XDM = "hoxdm";	// 본사(Head Office)
	public static String ABBREVIATION_WH_XDM = "whxdm";	// 창고(Warehouse)
	
	// Login Form URL
	public static String URL_LOGIN_FORM_HO_XDM = "/hoxdm/member/MemberHOXdmSignIn";
	public static String URL_LOGIN_FORM_WH_XDM = "/whxdm/member/MemberWHXdmSignIn";
	
	// Login User Seq
	public static String SESSION_SEQ_NAME_HO_XDM = "sessSeqHOXdm";
	public static String SESSION_SEQ_NAME_WH_XDM = "sessSeqWHXdm";
	
	// Login Session Time
	public static int SESSION_MINUTE = 60 * 30; // 30분
	
	// Order에서 사용하는 코드 그룹
	public final static int ORDERS_CODE_GROUP_SEQ_ORDER_STATE = 1; // oStateCd
	public final static int ORDERSPRODUCT_CODE_GROUP_SEQ_ORDERPRODUCT_STATE = 7;
}
