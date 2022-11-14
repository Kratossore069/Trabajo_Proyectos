package com.portfolio.EmployeesControl.util.pagination;

import lombok.Data;

@Data
public class PageItem {
    private int number;
    private boolean current;

    public PageItem(int number, boolean current) {
        super();
        this.number = number;
        this.current = current;
    }
}
