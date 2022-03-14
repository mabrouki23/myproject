/**
 * 
 */
package org.mabrouki.projet.controller;

import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mabrouki.projet.model.Evenement;
import org.mabrouki.projet.service.EvenementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.convert.Jsr310Converters.StringToLocalDateConverter;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author User
 *
 */
@WebMvcTest(controllers = EvenementResApi.class)
class EvenementResApiTest {
	 @Autowired
	    private MockMvc mockMvc;
	 @Autowired
	 private ObjectMapper objectMapper;
	 @MockBean
	    private EvenementServiceImpl evenementService;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	
	/**
	 * Test method for {@link org.mabrouki.projet.controller.EvenementResApi#allEvenements()}.
	 * @throws Exception 
	 */
	@Test
	void testAllEvenements() throws Exception {
		 mockMvc.perform(get("/api/evenements"))
         .andExpect(status().isOk());
	}

	/**
	 * Test method for {@link org.mabrouki.projet.controller.EvenementResApi#save(org.mabrouki.projet.model.Evenement)}.
	 * @throws Exception 
	 */
	@Test
	void testSave() throws Exception {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		Evenement evenement=new Evenement("jaz aout","description de l'levenement",LocalDate.parse("2022-11-11",formatter),LocalDate.parse("2022-11-12",formatter));
		Evenement evenementSaved=new Evenement(71,"jaz aout","description de l'levenement",LocalDate.parse("2022-11-11",formatter),LocalDate.parse("2022-11-12",formatter));
		
		mockMvc.perform(
		            post("/api/evenements")
		            .contentType("application/json")
		            .content(objectMapper.writeValueAsString(evenement)))		            
		           . andExpect(status().isOk());
		           
		
		            
	}

}
