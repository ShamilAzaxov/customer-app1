package sh.tech.customerapp1.service;



import sh.tech.customerapp1.dao.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> getAllCustomer();
    CustomerDto getCustomerById(Long id);
    void saveCustomer(CustomerDto customerDto);
    void deleteCustomerById(Long id);
    void updateCustomer(Long id, CustomerDto customerDto);

}
