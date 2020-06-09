package com.wst.demo.model;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		// read jasonm file and then map to the pojo object
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			List<Student> students = Arrays.asList(mapper.readValue(new File("data/sample-full.json"), Student[].class));
			for(Student st: students) {
				System.out.println(st.getLanguage().toString());
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
