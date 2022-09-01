package com.mr.controller.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mr.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {

}
