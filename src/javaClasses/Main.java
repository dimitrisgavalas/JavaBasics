package javaClasses;
/*
*
* */
public class Main {

    public static void main(String[] args) {
//*** Car ***
//        Car porsche = new Car(); //created data type called porsche
//        Car holden = new Car();
//
//        porsche.setModel("Carrera");
//        System.out.println("Model is : " + porsche.getModel());


//        //*** Account ***
//         Account dimitrisAccount = new Account();
//
////         dimitrisAccount.setAccountNumber("12345");
////         dimitrisAccount.setBalance(0.00);
////         dimitrisAccount.setEmail("asdfg@gmail.com");
////         dimitrisAccount.setPhoneNumber("123456789");
//
//         dimitrisAccount.withdrawFunds(100.0);
//
//         dimitrisAccount.depositFunds(100.00);
//
//         Account timsAccount = new Account("12345", 0.00, "mitsos", "123@123.123", "123456789");
//        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
//

            //*** VipPerson ***
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("bob", 2500.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim",100, "asa@aaaa.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
        //System.out.println(person3.getCreditLimit());
    }
}
