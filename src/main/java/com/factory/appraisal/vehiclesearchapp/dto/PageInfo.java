package com.factory.appraisal.vehiclesearchapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PageInfo {
    private Integer totalPages;

    private Long totalRecords;
}
