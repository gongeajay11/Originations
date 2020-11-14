package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TimePassApplicationTests {

	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext wc;

	Employee e = new Employee(1, "ajay");

	ObjectMapper mapper = new ObjectMapper();

	@Before
	public void setup() {

		mockMvc = MockMvcBuilders.webAppContextSetup(wc).build();
	}
// adding mockito test cae for post mapping
	@Test
	public void saveEmployee() throws JsonProcessingException, Exception {
		MvcResult result = mockMvc.perform(
				post("/api/applications").contentType(MediaType.APPLICATION_JSON_VALUE).content(mapper.writeValueAsString(e)))
				.andExpect(status().isCreated()).andReturn();

		Employee response = mapper.readValue(result.getResponse().getContentAsString(), Employee.class);
		assertEquals(e, response);

	}

	/*
	 * @Test public void updateEmployeeTest() throws JsonProcessingException,
	 * Exception { MvcResult result =
	 * mockMvc.perform(put("/api/applications/update/{id}")).contentType(JSONValue.
	 * class)
	 * .content(mapper.writeValueAsString(employee)).andExpect(status().isOk()).
	 * andReturn(); }
	 */

}
// we have used mockito for testing purpose.