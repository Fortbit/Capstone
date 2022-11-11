package com.wellsfargo.SoftBank.model;
import java.util.Base64;
import java.nio.charset.StandardCharsets;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="account_number")
	private long account_no;
	
	@Column(name="first_name")
	private String fname;
	
	@Column(name="middle_name")
	private String middle_name;
	
	
	@Column(name ="last_name")
	private String lname;
	
	@Column(unique = true)
    private String user_name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="security_questions")
	private String securityQuestions;

	@Column(name="security_answers")
	private String securityAnswers;
	
	@Column(name="accountTypeID")
	private int accountTypeID;
	
	@Column(name="mobileNumber")
	private long mobileNumber;
	
	@Column(name="accountBalance")
	private long accountBalance;
	
	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public User() {
		super();
		
	}

	public User(long account_no, String fname, String middle_name, String lname, String user_name, String password,
			String securityQuestions, String securityAnswers, int accountTypeID, long mobileNumber) {
		super();
		this.account_no = account_no;
		this.fname = fname;
		this.middle_name = middle_name;
		this.lname = lname;
		this.user_name = user_name;
		this.password = password;
		this.securityQuestions = securityQuestions;
		this.securityAnswers = securityAnswers;
		this.accountTypeID = accountTypeID;
		this.mobileNumber = mobileNumber;
	}

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
//		System.out.println("First :"+password);
//		Base64.Encoder encoder = Base64.getEncoder();  // encrypt password in database field
//        String normalString = password;
//        System.out.println(password +" "+"normal :"+normalString);
//        String encodedString = encoder.encodeToString(
//        normalString.getBytes(StandardCharsets.UTF_8) );
        this.password = password;
	}

	public String getSecurityQuestions() {
		return securityQuestions;
	}

	public void setSecurityQuestions(String securityQuestions) {
		this.securityQuestions = securityQuestions;
	}

	public String getSecurityAnswers() {
		return securityAnswers;
	}

	public void setSecurityAnswers(String securityAnswers) {
		this.securityAnswers = securityAnswers;
	}

	public int getAccountTypeID() {
		return accountTypeID;
	}

	public void setAccountTypeID(int accountTypeID) {
		this.accountTypeID = accountTypeID;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
}
