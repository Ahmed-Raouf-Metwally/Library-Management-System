package com.maid.cc.Library.Management.System.Borrowing.model.dto;

import com.maid.cc.Library.Management.System.Borrowing.model.entity.Borrowing;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorrowingDTO {

    private Integer id;
    private Integer patron_id;
    private Integer book_id;

    public static BorrowingDTO toDTO(Borrowing borrowingEntity) {
        return BorrowingDTO.builder()
                .id(borrowingEntity.getId())
                .patron_id(borrowingEntity.getPatron_id())
                .book_id(borrowingEntity.getBook_id())
                .build();
    }
}
