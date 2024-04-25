import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer>customers;
    public Bank(){
        customers=new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }
    public Customer getCustomerbyPin(int pin){
        for(Customer customer : customers){
            if(customer.getPin()==pin){
                return customer;
            }
        }
        return null;
    }
    public String getAllCustomerInfo(){
        StringBuilder Info = new StringBuilder();
        for(Customer customer : customers){
            Info.append(customer.toString()).append("\n");
        }
        return Info.toString();
    }
}
