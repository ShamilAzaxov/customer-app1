package sh.tech.customerapp1.controller;



import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sh.tech.customerapp1.dao.dto.CustomerDto;
import sh.tech.customerapp1.service.CustomerService;

import java.util.List;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("customer")
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping()
    public ResponseEntity<List<CustomerDto>> getAll(){
        return ResponseEntity.ok(customerService.getAllCustomer());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getById(@Valid @PathVariable("id") Long id){
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody CustomerDto customerDto){
        customerService.saveCustomer(customerDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        customerService.deleteCustomerById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Long id,
                                       @Valid @RequestBody CustomerDto customerDto){
        customerService.updateCustomer(id, customerDto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}