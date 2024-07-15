package sh.tech.customerapp1.service;



import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sh.tech.customerapp1.dao.dto.CustomerDto;
import sh.tech.customerapp1.dao.entity.Customer;
import sh.tech.customerapp1.exception.CustomerNotFoundException;
import sh.tech.customerapp1.mapper.CustomerMapper;
import sh.tech.customerapp1.repo.CustomerRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;
    private final CustomerMapper customerMapper;

    @Override
    public List<CustomerDto> getAllCustomer() {
        return customerRepo.findAll().stream().map(customerMapper::toDto).toList();
    }

    @Override
    public CustomerDto getCustomerById(Long id) {
        return customerRepo.findById(id).map(customerMapper::toDto).orElseThrow(() ->
                new CustomerNotFoundException("Customer not found by id: " + id));
    }

    @Override
    public void saveCustomer(CustomerDto customerDto) {
        customerRepo.save(customerMapper.toEntity(customerDto));
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRepo.deleteById(id);
    }

    @Override
    public void updateCustomer(Long id, CustomerDto customerDto) {
        Customer customer = customerMapper.toEntity(customerDto);
        customer.setId(id);
        customerRepo.save(customer);
    }
}
