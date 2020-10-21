package com.gof.springcloud.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(value = "day")
public class TravelPlanModel_Day {

    @Field(type = FieldType.Date)
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date date;

    @Field(type = FieldType.Nested)
    private List<TravelPlanModel_DayNode> nodes;
}
