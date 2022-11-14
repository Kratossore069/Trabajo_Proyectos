package com.portfolio.EmployeesControl.util.pagination;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

@Data
public class PageRender<T> {

    private String url;
    private Page<T> page;
    private int totalPages;
    private int elementsPerPage;
    private int actualPage;
    private List<PageItem> pages;

    public PageRender(String url, Page<T> page) {
        this.url = url;
        this.page = page;
        this.pages = new ArrayList<PageItem>();

        elementsPerPage = 5;
        totalPages = page.getTotalPages();
        actualPage = page.getNumber() + 1;

        int from, to;
        if (totalPages <= elementsPerPage) {
            from = 1;
            to = totalPages;
        } else {
            if (actualPage <= elementsPerPage / 2) {
                from = 1;
                to = elementsPerPage;
            } else if (actualPage >= totalPages - elementsPerPage / 2) {
                from = totalPages - elementsPerPage + 1;
                to = elementsPerPage;
            } else {
                from = actualPage - elementsPerPage / 2;
                to = elementsPerPage;
            }
        }

        for (int i = 0; i < to; i++) {
            pages.add(new PageItem(from + i, actualPage == from + i));
        }
    }
}
