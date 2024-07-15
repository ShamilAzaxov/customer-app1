package sh.tech.customerapp1.mapper;


import org.mapstruct.Mapper;
import sh.tech.customerapp1.dao.dto.CustomerDto;
import sh.tech.customerapp1.dao.entity.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDto toDto(Customer customer);
    Customer toEntity(CustomerDto customerDto);
}