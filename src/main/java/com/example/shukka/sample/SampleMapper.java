package com.example.shukka.sample;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {
	SampleResult findById(String code);
}
