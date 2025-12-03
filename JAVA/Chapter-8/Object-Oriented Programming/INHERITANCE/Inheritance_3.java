

class father {
    private String house;
    private String car;

    // Father Methods
    public String getHouse() {
        return house;
    }

    public String getCar() {
        return car;
    }

    public void setHouse(String house) {
        System.out.println("Father ne House kharidi : " + house);
        this.house = house;
    }

    public void setCar(String car) {
        System.out.println("Father ne car kharidi : " + car);
        this.car = car;
    }

    public void fatherMethod() {
        System.out.println("Ye sirf father ke method hai!");
    }
}

class Son extends father {
    private String phone;
    private String bike;

    // Son ki apni methods
    public String getPhone() {
        return phone;
    }

    public String getBike() {
        return bike;
    }

    public void setPhone(String phone) {
        System.out.println("Son ne Phone kharidi : " + phone);
        this.phone = phone;
    }

    public void setBike(String bike) {
        System.out.println("Son ne Bike Kharidi : " + bike);
        this.bike = bike;
    }

    public void sonMethods() {
        System.out.println("Ye sirf Son ke methods hai!");
    }
}

public class Inheritance_3 {
    public static void main(String[] args) {

        System.out.println("----------1. Father as Father ------------");
        father myFather = new father();
        myFather.setCar("BMW M3");
        myFather.setHouse("Merry House");
        System.out.println("Father ka House : " + myFather.getHouse());
        System.out.println("Father ki Car : " + myFather.getCar());
        myFather.fatherMethod();

        System.out.println("----------2. Son as Son ------------------");
        Son mySon = new Son();
        mySon.setPhone("Samsung Galaxy S25 Ultra");
        mySon.setBike("RE-Continental GT 650");
        System.out.println("Son ne Phone kharidi : " + mySon.getPhone());
        System.out.println("Son ne Bike Kharidi : " + mySon.getBike());
        mySon.sonMethods();
        mySon.setHouse("Merry House");
        mySon.setCar("BMW M3");
        System.out.println("Son ko father se house mila : " + mySon.getHouse());
        System.out.println("Son ko father se car mila : " + mySon.getCar());
        myFather.fatherMethod();

        System.out.println("------------3. Son as Father (Polymorphism)---------");
        // father class/method but son Object ...
        father yesfather = new Son(); // Father reference par son ke objects
        yesfather.setHouse("Baan House"); // Father ki method use kar sakta hai
        yesfather.setCar("Mazda RX7");
        System.out.println("House through reference : " + yesfather.getHouse());
        System.out.println("Car through reference : " + yesfather.getCar());
        yesfather.fatherMethod();
        // ❌ ERROR - If father reference se Son ke Methods call nhi kar sakte hai
        System.out.println("----------4. Father as Son -----------------");
        // Son noSon = new father(); Error ❌ - Son ke class me father ke object nhi aa sakte hai.
    }
}
