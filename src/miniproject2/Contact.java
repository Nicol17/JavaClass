package miniproject2;

public class Contact {
  protected  String name;
  protected   String mobile;
  protected    String work;
  protected    String home;
  protected     String city;

// constrictor
  public Contact(String name, String mobile, String city) {
    this.name = name;
    this.mobile = mobile;
    this.city = city;
  }

  // getters, setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  //Validation



//   override equals
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Contact that = (Contact) o;
    if (this.name == that.name && this.mobile == that.mobile) {
      return true;
    } else {
      return false;
    }

  }
}
