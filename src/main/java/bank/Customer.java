package bank;

public class Customer {
  
  private int id;
  private String name;
  private String username;
  private String pwd;
  private String accountID;


  public Customer (int id, String name, String username, String pwd, String accountID){
    setId(id);
    setName(name);
    setUsername(username);
    setPwd(pwd);
    setAccountID(accountID);
  }


  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPwd() {
    return this.pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getAccountID() {
    return this.accountID;
  }

  public void setAccountID(String accountID) {
    this.accountID = accountID;
  }


}
