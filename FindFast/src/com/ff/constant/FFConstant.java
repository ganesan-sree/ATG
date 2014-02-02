package com.ff.constant;

public class FFConstant {
	public static String firstName="firstName";
	public static String middleName="middleName";
	public static String lastName="lastName";
	public static String email="email";
	public static String gender="gender";
	public static String password="password";
	public static String confirmPassword="confirmPassword";
	public static String login="login";
	public static String country="homeAddress.country";
	public static String state="homeAddress.state";
	public static String city="homeAddress.city";
	public static String postalcode="homeAddress.postalcode";
	public static String LOGIN_LOCKED="Login Restricted";
	public static String ADDRESS1="homeAddress.address1";
	public static String DATE_OF_BIRTH="dateOfBirth";
	public static String USER_INTERESTS="userInterests";
	public static String USER_IMAGE="userImage";
	
	public static int userName_MIN_length=6;
	public static int password_MIN_length=6;
	public static String[] requiredFields=new String[]{FFConstant.firstName,FFConstant.lastName,FFConstant.email,FFConstant.gender,FFConstant.password,FFConstant.confirmPassword,
														FFConstant.country,FFConstant.state,FFConstant.city,FFConstant.login,FFConstant.ADDRESS1,FFConstant.DATE_OF_BIRTH};
}
