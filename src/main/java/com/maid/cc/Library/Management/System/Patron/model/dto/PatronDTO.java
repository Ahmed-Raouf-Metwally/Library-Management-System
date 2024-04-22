package com.maid.cc.Library.Management.System.Patron.model.dto;

import com.maid.cc.Library.Management.System.Patron.model.entity.Patron;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatronDTO {

    private Integer id;

    @NotNull(message = "Firist name shouldn't be empty")
    private String firstName;

    @NotNull(message = "Last name shouldn't be empty")
    private String lastName;

    @NotNull(message = "Nationality ID shouldn't be empty")
    private String nationalityId;

    @Pattern(regexp = "^01[0-2]\\d{1,8}$" , message = "invalid phone number should be (+20 1xx-xxx-xxxx)")
    private String phone;

    @Email
    private String mail;
    @NotNull(message = "address shouldn't be empty")
    private String address;

    public static PatronDTO toDTO(Patron patronEntity){
        return PatronDTO.builder()
                .id(patronEntity.getId())
                .firstName(patronEntity.getFirstName())
                .lastName(patronEntity.getLastName())
                .nationalityId(patronEntity.getNationalityId())
                .phone(patronEntity.getPhone())
                .mail(patronEntity.getMail())
                .address(patronEntity.getAddress())
                .build();
    }
}
