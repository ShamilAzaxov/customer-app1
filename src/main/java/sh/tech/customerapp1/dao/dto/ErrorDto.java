package sh.tech.customerapp1.dao.dto;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class ErrorDto {
    int errorCode;
    String message;
    LocalDateTime sentTime;
}
