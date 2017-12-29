package com.zzh.entity;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2017/12/26.
 */
public class Page<T> {
    public static final int DEFAULT_PAGE_SIZE = 10;

    protected int pageNo = 1; // 当前页, 默认为第1页
    protected int pageSize = DEFAULT_PAGE_SIZE; // 每页记录数
    protected int totalRecord = -1; // 总记录数, 默认为-1, 表示需要查询
    protected int totalPage = -1; // 总页数, 默认为-1, 表示需要计算

    protected int offset = 0;   // 偏移量

    protected List<T> results; // 当前页记录List形式

    public Page(Integer pageSize, Integer pageNo) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.offset = pageNo * pageSize;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public int getPageNo() {

        return pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public List<T> getResults() {
        return results;
    }
}
