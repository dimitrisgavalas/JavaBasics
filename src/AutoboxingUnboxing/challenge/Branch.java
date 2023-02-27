package AutoboxingUnboxing.challenge;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (customerName != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
//        we couldnt find a customer
        return false;
    }

//    private because its only used internaly
    private Customer findCustomer(String customerName){
        for (int i=0; i<this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getCustomerName().equals(customerName)){
                return this.customers.get(i);
            }
        }
        return null;
    }
}
